package com.yunzimo.mapper;


import com.yunzimo.Bean.Analysis;
import com.yunzimo.Bean.Key;

import java.util.List;

public interface AnalysisMapper {
    public List<Analysis> QueryByKey(Key key);
    public Analysis QueryById(int id);
}