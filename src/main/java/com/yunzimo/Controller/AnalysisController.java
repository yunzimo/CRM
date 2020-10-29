package com.yunzimo.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunzimo.Bean.Analysis;
import com.yunzimo.Bean.Key;
import com.yunzimo.Service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("ana")
public class AnalysisController {

    @Autowired
    private AnalysisService analysisService;

    @RequestMapping("showAllInfo")
    public String showAllInfo(Model model, @RequestParam(defaultValue = "1")int pageNum, Key key){
        PageHelper.startPage(pageNum,2);
        List<Analysis> analyses = analysisService.QueryByKey(key);
        PageInfo<Analysis> pageInfo=new PageInfo<>(analyses);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("key",key);
        return "forward:../project-need.jsp";
    }
}
