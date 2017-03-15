package com.firefly.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firefly.service.FolderService;

@Controller
@RequestMapping("/folder")
public class FolderController {

	@Resource
	private FolderService folderService; 
	
	@RequestMapping("/getFolderForTree")
	public String toUserLogin(HttpSession session){
		System.out.println("-------  get Folder for tree");
		List folderList = this.folderService.getFolderForTree();
		System.out.println("folder list :: "+folderList);
		session.setAttribute("folderList", folderList);
		return "redirect:/document/getDocumentByFolder";
	}
	
}
