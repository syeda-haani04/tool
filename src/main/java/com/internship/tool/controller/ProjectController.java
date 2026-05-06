package com.internship.tool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    @GetMapping("/projects")
    public List<String> getProjects() {
        return List.of(
                "Web Security Audit",
                "Network Scan",
                "Cloud Vulnerability Test"
        );
    }
}
