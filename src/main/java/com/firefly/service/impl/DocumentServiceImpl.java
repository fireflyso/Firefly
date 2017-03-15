package com.firefly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.firefly.dao.DocumentMapper;
import com.firefly.domain.Document;
import com.firefly.domain.Folder;
import com.firefly.service.DocumentService;

@Service("documentService")
public class DocumentServiceImpl implements DocumentService {

	@Resource
	private DocumentMapper documentDao;
	
	@Override
	public List<Document> getDocumentByFolder(Folder folder) {
		
		return documentDao.getDocumentByFolder(folder);
	}

}
