package com.firefly.dao;

import java.util.List;

import com.firefly.domain.Folder;

public interface FolderMapper {

	List getFolderForTree();

	List openFolder(String folderId);

	void newFolder(Folder newFolder);

	void deleteFolder(String folderId);
}