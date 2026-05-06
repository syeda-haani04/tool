package com.internship.tool.service;

import com.internship.tool.entity.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    public List<Project> getProjects() {
        return List.of(
                new Project(1L, "Penetration Testing Dashboard", "Completed"),
                new Project(2L, "Vulnerability Scanner", "In Progress"),
                new Project(3L, "Security Report Generator", "Pending")
        );
    }
}