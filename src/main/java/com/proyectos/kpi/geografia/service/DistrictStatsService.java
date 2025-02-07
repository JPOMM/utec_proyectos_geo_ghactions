package com.proyectos.kpi.geografia.service;

import org.springframework.stereotype.Service;
import com.proyectos.kpi.geografia.model.DistrictProjectStats;
import com.proyectos.kpi.geografia.repository.DistrictStatsRepository;

import java.util.List;

@Service
public class DistrictStatsService {
    private final DistrictStatsRepository districtStatsRepository;

    public DistrictStatsService(DistrictStatsRepository districtStatsRepository) {
        this.districtStatsRepository = districtStatsRepository;
    }

    public List<DistrictProjectStats> getDistrictStats() {
        return districtStatsRepository.getDistrictStats();
    }
}
