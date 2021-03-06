package com.hnu.softwarecollege.infocenter.mapper;

import com.hnu.softwarecollege.infocenter.entity.po.CenterDegreePo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CenterDegreePoMapper {
    int deleteByPrimaryKey(Long degreeId);

    int insert(CenterDegreePo record);

    int insertSelective(CenterDegreePo record);
}