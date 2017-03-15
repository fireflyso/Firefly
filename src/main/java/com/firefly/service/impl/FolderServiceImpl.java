package com.firefly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.firefly.dao.FolderMapper;
import com.firefly.service.FolderService;

@Service("folderService")
public class FolderServiceImpl implements FolderService {

	@Resource
	private FolderMapper folderDao;
	
	@Override
	public List getFolderForTree() {

		
		return folderDao.getFolderForTree();
	}

}
