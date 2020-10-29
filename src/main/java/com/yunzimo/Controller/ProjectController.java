package com.yunzimo.Controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunzimo.Bean.Key;
import com.yunzimo.Bean.Project;
import com.yunzimo.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/pro")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @RequestMapping("showAllInfo")
    public String showAllInfo(Model model, @RequestParam(defaultValue = "1")int pageNum, Key key){
        PageHelper.startPage(pageNum,2);
        List<Project> projects = projectService.QueryByKey(key);
        PageInfo<Project> pageInfo=new PageInfo<>(projects);
        System.out.println(pageInfo.getList());
        model.addAttribute("key",key);
        model.addAttribute("pageInfo",pageInfo);
        return "forward:../project-base.jsp";
    }

    @RequestMapping("addProject")
    public String addProject(Project project){
        boolean b = projectService.addProject(project);
        if(b){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
        return "redirect:/pro/showAllInfo";

    }

    @RequestMapping("proEdit")
    public String proEdit(int pid,Model model){
        Project project = projectService.QueryByPid(pid);
        model.addAttribute("pro",project);
        return "forward:../project-base-edit.jsp";
    }

    @RequestMapping("updateProject")
    public String updateProject(Project project){
        boolean b = projectService.projectEdit(project);
        if(b){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        return "redirect:/pro/showAllInfo";
    }
}
