package com.yunzimo.mapper;


import com.yunzimo.Bean.Baoxiao;

import java.util.List;

public interface BaoxiaoMapper {
    public List<Baoxiao> QueryByEmpFk(int empFk);
}