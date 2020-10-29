package com.yunzimo.mapper;


import com.yunzimo.Bean.Key;
import com.yunzimo.Bean.Project;

import java.util.List;

public interface ProjectMapper {
    public List<Project> QueryByKey(Key key);
    public int addProject(Project project);
    public Project QueryByPid(int pid);
    public int projectEdit(Project project);
}