package com.firefly.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.firefly.domain.Document;
import com.firefly.domain.Folder;
import com.firefly.domain.User;
import com.firefly.helper.Helper;
import com.firefly.service.DocumentService;
import com.firefly.service.UserService;

@Controller
@RequestMapping("/document")
public class DocumentController {
	
	@Resource
	private DocumentService documentService;
	
	@RequestMapping("/getDocumentByFolder")
	public String getDocumentByFolder(HttpSession session){
		Folder folder = (Folder) session.getAttribute("currentFolder");
		List<Document> docList = documentService.getDocumentByFolder(folder);
		session.setAttribute("docList", docList);
		return "userMainPage";
	}
	
	@RequestMapping("/uploadDoc")
	public String uploadDoc(@RequestParam(value = "file", required = false) MultipartFile file,HttpSession session){
		System.out.println("uploadDoc start");  
        String path = Helper.getDocPath();  
        String fileName = file.getOriginalFilename(); 
        System.out.println("path  :　"+path);
        System.out.println("fileName  :　"+fileName);
        File targetFile = new File(path, fileName);  
        if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
  
        //保存  
        try {  
            file.transferTo(targetFile);  
            System.out.println("upload success");
        } catch (Exception e) {  
            e.printStackTrace();  
        }
        
        
        Document doc = new Document();
        doc.setDocId(Helper.getRandomID());
        doc.setDocActive("01");
        doc.setDocAuthor((User)session.getAttribute("currentUser"));
        doc.setDocCreatetime(Helper.getTime());
        doc.setDocName(fileName);
        doc.setDocParent((Folder)session.getAttribute("currentFolder"));
        doc.setDocPath(path);
        doc.setDocType(Helper.getFileType(fileName));
        this.documentService.addDoc(doc);
		return "redirect:/folder/openFolder?folderId="+((Folder)session.getAttribute("currentFolder")).getFolderId();
	}
	
	@RequestMapping("/downloadDoc")
	public String downloadDoc(HttpServletRequest request,HttpServletResponse response,String docPath,String docName){
		System.out.println("doc downlaod path and name:  "+docPath+docName);
		if (docName != null) { 
              File file = new File(docPath, docName);
              if (file.exists()) {
                  response.setContentType("application/force-download");// 设置强制下载不打开
                  response.addHeader("Content-Disposition",
                          "attachment;fileName=" + docName);// 设置文件名
                  byte[] buffer = new byte[1024];
                  FileInputStream fis = null;
                  BufferedInputStream bis = null;
                  try {
                      fis = new FileInputStream(file);
                      bis = new BufferedInputStream(fis);
                      OutputStream os = response.getOutputStream();
                      int i = bis.read(buffer);
                      while (i != -1) {
                          os.write(buffer, 0, i);
                          i = bis.read(buffer);
                      }
                  } catch (Exception e) {
                      e.printStackTrace();
                  } finally {
                      if (bis != null) {
                          try {
                              bis.close();
                          } catch (IOException e) {
                              e.printStackTrace();
                        }
                      }
                     if (fis != null) {
                          try {
                              fis.close();
                          } catch (IOException e) {
                          }
                      }
                  }
              }
          }
		return null;
	}
	
	@RequestMapping("deleteDoc")
	public String deleteDoc(HttpSession session,String docId){
		this.documentService.deleteDoc(docId);
		return "redirect:/folder/openFolder?folderId="+((Folder)session.getAttribute("currentFolder")).getFolderId();
	}
}
