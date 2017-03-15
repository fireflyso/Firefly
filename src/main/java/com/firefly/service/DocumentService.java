package com.firefly.service;

import java.util.List;

import com.firefly.domain.Document;
import com.firefly.domain.Folder;

public interface DocumentService {

	public List<Document> getDocumentByFolder(Folder folder);

}
