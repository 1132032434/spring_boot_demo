package com.example.demo.mapper;

import com.example.demo.entity.DemoInfo;

public interface DemoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DemoInfo record);

    int insertSelective(DemoInfo record);

    DemoInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DemoInfo record);

    int updateByPrimaryKey(DemoInfo record);
}