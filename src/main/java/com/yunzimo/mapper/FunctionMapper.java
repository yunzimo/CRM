package com.yunzimo.mapper;


import com.yunzimo.Bean.Function;

import java.util.List;

public interface FunctionMapper {
    public List<Function> QueryAll();
    public Function checkName(Function function);
    public int insertFunction(Function function);
    public Function QueryById(int id);
    public int editFunction(Function function);
}
