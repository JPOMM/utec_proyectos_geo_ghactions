package com.proyectos.kpi.geografia.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyectos.kpi.geografia.service.ProjectByDepartmentService;
import com.proyectos.kpi.geografia.model.ProjectByDepartment;

import java.util.List;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "*")
public class ProjectByDepartmentController {
    private final ProjectByDepartmentService projectByDepartmentService ;

    public ProjectByDepartmentController (ProjectByDepartmentService projectByDepartmentService) {
        this.projectByDepartmentService = projectByDepartmentService;
    }

    @GetMapping("/by-department")
    public List<ProjectByDepartment> getProjectByDepartment() {
        return projectByDepartmentService.getProjectByDepartment();
    }
}
