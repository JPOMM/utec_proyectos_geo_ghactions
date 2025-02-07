package com.proyectos.kpi.geografia.model;

public class DistrictProjectStats {
    private String district;
    private Long totalProjects;
    private Double percentageOfTotal;

    public DistrictProjectStats(String district, Long totalProjects, Double percentageOfTotal) {
        this.district = district;
        this.totalProjects = totalProjects;
        this.percentageOfTotal = percentageOfTotal;
    }

    // Getters y Setters
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Long getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(Long totalProjects) {
        this.totalProjects = totalProjects;
    }

    public Double getPercentageOfTotal() {
        return percentageOfTotal;
    }

    public void setPercentageOfTotal(Double percentageOfTotal) {
        this.percentageOfTotal = percentageOfTotal;
    }
}
