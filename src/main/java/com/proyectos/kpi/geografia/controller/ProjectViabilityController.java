package com.proyectos.kpi.geografia.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyectos.kpi.geografia.service.ProjectViabilityService;
import com.proyectos.kpi.geografia.model.ProjectViability;

import java.util.List;


@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "*")
public class ProjectViabilityController {

    private final ProjectViabilityService projectViabilityService;

    public ProjectViabilityController(ProjectViabilityService projectViabilityService) {
        this.projectViabilityService = projectViabilityService;
    }

    @GetMapping("/viability")
    public List<ProjectViability> geProjectViability()
    {
        return projectViabilityService.getProjectViability();
    }
}
