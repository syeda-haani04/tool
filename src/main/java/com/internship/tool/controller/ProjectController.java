package com.internship.tool.controller;

import com.internship.tool.service.ProjectService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/projects")
    public List<String> getProjects() {
        return projectService.getProjects();
    }
}