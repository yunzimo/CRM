package com.yunzimo.Service;

import com.yunzimo.Bean.Analysis;
import com.yunzimo.Bean.Key;
import com.yunzimo.mapper.AnalysisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalysisServiceImp implements AnalysisService{

    @Autowired
    private AnalysisMapper analysisMapper;

    @Override
    public List<Analysis> QueryByKey(Key key) {
        List<Analysis> analyses = analysisMapper.QueryByKey(key);
        return analyses;
    }
}
