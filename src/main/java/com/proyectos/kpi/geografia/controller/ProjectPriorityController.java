package com.proyectos.kpi.geografia.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyectos.kpi.geografia.service.ProjectPriorityService;
import com.proyectos.kpi.geografia.model.ProjectPriority;

import java.util.List;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "*")
public class ProjectPriorityController {
    private final ProjectPriorityService projectPriorityService;


    public ProjectPriorityController(ProjectPriorityService projectPriorityService) {
        this.projectPriorityService = projectPriorityService;
    }

    @GetMapping("/priority")
    public List<ProjectPriority> geProjectPriority()
    {
        return projectPriorityService.getProjectPriority();
    }
}
