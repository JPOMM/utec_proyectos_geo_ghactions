package com.proyectos.kpi.geografia.service;

import org.springframework.stereotype.Service;
import com.proyectos.kpi.geografia.model.ProjectPriority;
import com.proyectos.kpi.geografia.repository.ProjectPriorityRepository;

import java.util.List;

@Service
public class ProjectPriorityService {

    private final ProjectPriorityRepository projectPriorityRepository;

    public ProjectPriorityService(ProjectPriorityRepository projectPriorityRepository) {
        this.projectPriorityRepository = projectPriorityRepository;
    }

    public List<ProjectPriority> getProjectPriority(){
        return projectPriorityRepository.getProjectPriority();
    }
}
