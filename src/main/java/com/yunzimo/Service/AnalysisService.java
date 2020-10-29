package com.yunzimo.Service;

import com.yunzimo.Bean.Analysis;
import com.yunzimo.Bean.Key;

import java.util.List;

public interface AnalysisService {
    public List<Analysis> QueryByKey(Key key);
}
