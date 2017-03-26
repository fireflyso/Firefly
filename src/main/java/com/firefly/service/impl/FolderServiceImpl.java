package com.firefly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.firefly.dao.FolderMapper;
import com.firefly.domain.Folder;
import com.firefly.service.FolderService;

@Service("folderService")
public class FolderServiceImpl implements FolderService {

	@Resource
	private FolderMapper folderDao;
	
	@Override
	public List getFolderForTree() {

		
		return folderDao.getFolderForTree();
	}

	@Override
	public List openFolder(String folderId) {
		return folderDao.openFolder(folderId);
	}

	@Override
	public void newFolder(Folder newFolder) {
		folderDao.newFolder(newFolder);
	}

	@Override
	public void deleteFolder(String folderId) {
		System.out.println("foder service id: "+folderId);
		folderDao.deleteFolder(folderId);
	}

}
