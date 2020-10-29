package com.yunzimo.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunzimo.Bean.Function;
import com.yunzimo.Service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("fun")
public class FunctionController {

    @Autowired
    private FunctionService functionService;

    @RequestMapping("showAllInfo")
    public String showAllInfo(Model model, @RequestParam(defaultValue = "1")int pageNum){
        PageHelper.startPage(pageNum,2);
        List<Function> functions = functionService.QueryAll();
        PageInfo<Function> pageInfo=new PageInfo<>(functions);
        model.addAttribute("pageInfo",pageInfo);
        return "forward:../project-function.jsp";
    }

    @RequestMapping("checkName")
    @ResponseBody
    public boolean checkName(int modeleFk,String functionname){

        System.out.println("============进入controller");
        Function function=new Function();
        function.setFunctionname(functionname);
        function.setModeleFk(modeleFk);
        boolean b = functionService.CheckName(function);
        return b;
    }

    @RequestMapping("addFunction")
    public String addFunction(Function function){
        boolean b = functionService.insertFunction(function);
        if(b){
            System.out.println("功能插入成功");
        }else{
            System.out.println("功能插入失败");
        }
        return "redirect:showAllInfo";
    }
}
