package com.firefly.dao;

import java.util.List;

import com.firefly.domain.Document;
import com.firefly.domain.Folder;

public interface DocumentMapper {

    int insert(Document record);

    Document selectByPrimaryKey(String docId);

    int updateByPrimaryKeySelective(Document record);

    int updateByPrimaryKey(Document record);

	List<Document> getDocumentByFolder(Folder folder);

	void addDoc(Document doc);

	void deleteDoc(String docId);
}