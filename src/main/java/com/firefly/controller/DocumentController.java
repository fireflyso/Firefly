package com.firefly.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firefly.domain.Document;
import com.firefly.domain.Folder;
import com.firefly.service.DocumentService;
import com.firefly.service.UserService;

@Controller
@RequestMapping("/document")
public class DocumentController {
	
	@Resource
	private DocumentService documentService;
	
	@RequestMapping("/getDocumentByFolder")
	public String getDocumentByFolder(HttpSession session){
		Folder folder = (Folder)((List)session.getAttribute("folderList")).get(0);
		List<Document> docList = documentService.getDocumentByFolder(folder);
		session.setAttribute("docList", docList);
		System.out.println("document list: "+docList);
		return "userMainPage";
	}
}
