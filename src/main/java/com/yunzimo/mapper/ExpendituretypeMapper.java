package com.yunzimo.mapper;

import com.yunzimo.Bean.Expendituretype;

public interface ExpendituretypeMapper {

    int deleteByPrimaryKey(Integer etid);
    int insertSelective(Expendituretype record);
    Expendituretype selectByPrimaryKey(Integer etid);
    int updateByPrimaryKeySelective(Expendituretype record);

    int updateByPrimaryKey(Expendituretype record);
}