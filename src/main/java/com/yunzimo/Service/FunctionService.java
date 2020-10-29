package com.yunzimo.Service;

import com.yunzimo.Bean.Function;

import java.util.List;

public interface FunctionService {
    public List<Function> QueryAll();
    public boolean CheckName(Function function);
    public boolean insertFunction(Function function);
}
