package com.yunzimo.Service;

import com.yunzimo.Bean.Key;
import com.yunzimo.Bean.Project;
import com.yunzimo.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImp implements ProjectService{

    @Autowired
    private ProjectMapper projectMapper;
    @Override
    public List<Project> QueryByKey(Key key) {
        List<Project> projects = projectMapper.QueryByKey(key);

        return projects;
    }

    @Override
    public boolean addProject(Project project) {
        int i = projectMapper.addProject(project);
        return i>0;
    }

    @Override
    public Project QueryByPid(int pid) {
        Project project = projectMapper.QueryByPid(pid);
        return project;
    }

    @Override
    public boolean projectEdit(Project project) {
        int i = projectMapper.projectEdit(project);
        return i>0;
    }

    @Override
    public List<Project> showProWithModule() {
        List<Project> projects = projectMapper.showProWithModule();

        return projects;
    }
}
