package com.firefly.dao;

import com.firefly.domain.Usert;

public interface UsertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Usert record);

    int insertSelective(Usert record);

    Usert selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usert record);

    int updateByPrimaryKey(Usert record);
}