package com.yunzimo.Service;

import com.yunzimo.Bean.Key;
import com.yunzimo.Bean.Project;

import java.util.List;

public interface ProjectService {
    public List<Project> QueryByKey(Key key);
    public boolean addProject(Project project);
    public Project QueryByPid(int pid);
    public boolean projectEdit(Project project);
    public List<Project> showProWithModule();
}
