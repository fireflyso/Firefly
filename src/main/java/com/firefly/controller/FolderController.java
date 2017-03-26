package com.firefly.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firefly.domain.Folder;
import com.firefly.domain.User;
import com.firefly.helper.Helper;
import com.firefly.service.FolderService;

@Controller
@RequestMapping("/folder")
public class FolderController {

	@Resource
	private FolderService folderService; 
	
	@RequestMapping("/getFolderForTree")
	public String toUserLogin(HttpSession session){
		List folderList = this.folderService.getFolderForTree();
		System.out.println("folder list :: "+folderList);
		session.setAttribute("folderList", folderList);
		session.setAttribute("currentFolder",folderList.get(0));
		return "redirect:/document/getDocumentByFolder";
	}
	
	@RequestMapping("/openFolder")
	public String openFolder(HttpSession session,String folderId){
		Folder currentFolder = new Folder();
		currentFolder.setFolderId(folderId);
		session.setAttribute("currentFolder", currentFolder);
		List folderList = this.folderService.openFolder(folderId);
		session.setAttribute("folderList", folderList);
		return "redirect:/document/getDocumentByFolder";
	}
	
	@RequestMapping("/newFolder")
	public String newFolder(HttpSession session,String folderId,String folderName) throws UnsupportedEncodingException{
		folderName = URLDecoder.decode(folderName, "utf-8");
		System.out.println("new folder !!! "+folderId+"  "+folderName);
		Folder newFolder = new Folder();
		Folder parent = new Folder();
		parent.setFolderId(folderId);
		newFolder.setFolderId(Helper.getRandomID());
		newFolder.setFolderActive("01");
		newFolder.setFolderAuthor((User)session.getAttribute("currentUser"));
		newFolder.setFolderCreatetime(Helper.getTime());
		newFolder.setFolderIsRoot("00");
		newFolder.setFolderName(folderName);
		newFolder.setFolderParent(parent);
		System.out.println("folder : "+newFolder);
		this.folderService.newFolder(newFolder);
		return "redirect:/folder/openFolder?folderId="+folderId;
	}
	
	@RequestMapping("/deleteFolder")
	public String deleteFolder(HttpSession session,String folderId){
		System.out.println("folder controller id : "+folderId);
		this.folderService.deleteFolder(folderId);
		System.out.println("folder controller currnet folder : "+(Folder)session.getAttribute("currentFolder") );
		return "redirect:/folder/openFolder?folderId="+((Folder)session.getAttribute("currentFolder")).getFolderId();
	}
}
