package com.proyectos.kpi.geografia.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyectos.kpi.geografia.service.DistrictStatsService;
import com.proyectos.kpi.geografia.model.DistrictProjectStats;

import java.util.List;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "*")
public class DistrictStatsController {
    private final DistrictStatsService districtStatsService;

    public DistrictStatsController(DistrictStatsService districtStatsService) {
        this.districtStatsService = districtStatsService;
    }

    @GetMapping("/by-districts")
    public List<DistrictProjectStats> getDistrictStats() {
        return districtStatsService.getDistrictStats();
    }
}
