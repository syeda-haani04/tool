package com.internship.tool.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjectService {

    public List<String> getProjects() {
        return List.of(
                "Penetration Testing Dashboard",
                "Vulnerability Scanner",
                "Security Report Generator"
        );
    }
}
