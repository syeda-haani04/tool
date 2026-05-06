package com.internship.tool.repository;

import com.internship.tool.entity.Project;
import java.util.ArrayList;
import java.util.List;

public class ProjectRepository {

    private final List<Project> projects = new ArrayList<>();

    public List<Project> getAllProjects() {
        return projects;
    }

    public void addProject(Project project) {
        projects.add(project);
    }
}
