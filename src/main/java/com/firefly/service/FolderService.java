package com.firefly.service;

import java.util.List;

import com.firefly.domain.Folder;

public interface FolderService {

	public List getFolderForTree();

	public List openFolder(String folderId);

	public void newFolder(Folder newFolder);

	public void deleteFolder(String folderId);

}
