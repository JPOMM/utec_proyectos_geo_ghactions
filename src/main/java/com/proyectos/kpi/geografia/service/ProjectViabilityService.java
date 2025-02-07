package com.proyectos.kpi.geografia.service;


import org.springframework.stereotype.Service;
import com.proyectos.kpi.geografia.model.ProjectViability;
import com.proyectos.kpi.geografia.repository.ProjectViabilityRepository;

import java.util.List;

@Service
public class ProjectViabilityService {
    private final ProjectViabilityRepository projectViabilityRepository;

    public ProjectViabilityService(ProjectViabilityRepository projectViabilityRepository) {
        this.projectViabilityRepository = projectViabilityRepository;
    }

    public List<ProjectViability> getProjectViability(){
        return projectViabilityRepository.getProjectViability();
    }
}
