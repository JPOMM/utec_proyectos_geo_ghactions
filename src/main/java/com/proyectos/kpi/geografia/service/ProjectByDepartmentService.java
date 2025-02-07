package com.proyectos.kpi.geografia.service;

import org.springframework.stereotype.Service;
import com.proyectos.kpi.geografia.model.ProjectByDepartment;
import com.proyectos.kpi.geografia.repository.ProjectByDepartmentRepository;

import java.util.List;

@Service
public class ProjectByDepartmentService {
    private final ProjectByDepartmentRepository projectByDepartmentRepository;

    public ProjectByDepartmentService(ProjectByDepartmentRepository projectByDepartmentRepository) {
        this.projectByDepartmentRepository = projectByDepartmentRepository;
    }

    public List<ProjectByDepartment>  getProjectByDepartment() {
        return projectByDepartmentRepository.getProjectByDepartment();
    }
}
