package com.yunzimo.mapper;


import com.yunzimo.Bean.Module;

import java.util.List;

public interface ModuleMapper {
    public Module QueryById(int id);
    public List<Module> QueryByAnalysisFk(int analysisFk);
}