package com.firefly.dao;

import java.util.List;

import com.firefly.domain.Folder;

public interface FolderMapper {
    int deleteByPrimaryKey(String folderId);

    int insert(Folder record);

    int insertSelective(Folder record);

    Folder selectByPrimaryKey(String folderId);

    int updateByPrimaryKeySelective(Folder record);

    int updateByPrimaryKey(Folder record);

	List getFolderForTree();
}