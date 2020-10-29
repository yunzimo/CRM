package com.yunzimo.Service;

import com.yunzimo.Bean.Function;
import com.yunzimo.Controller.FunctionController;
import com.yunzimo.mapper.FunctionMapper;
import com.yunzimo.mapper.ModuleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunctionServiceImp implements FunctionService{

    @Autowired
    private FunctionMapper functionMapper;

    @Autowired
    private ModuleMapper moduleMapper;

    @Override
    public List<Function> QueryAll() {

        List<Function> functions = functionMapper.QueryAll();
        for(Function function:functions){
            function.setModule(moduleMapper.QueryById(function.getModeleFk()));
        }
        return functions;
    }
}
