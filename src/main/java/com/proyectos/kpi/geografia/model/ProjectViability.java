package com.proyectos.kpi.geografia.model;

public class ProjectViability {

    private String state;
    private Long totalProjects;
    private double percentage;



    public ProjectViability(String state, Long totalProjects, double percentage ){

        this.state = state;
        this.totalProjects = totalProjects;
        this.percentage = percentage;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(Long totalProjects) {
        this.totalProjects = totalProjects;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
