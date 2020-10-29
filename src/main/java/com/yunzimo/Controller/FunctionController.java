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
}
