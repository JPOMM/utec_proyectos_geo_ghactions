package com.proyectos.kpi.geografia.model;

public class ProjectPriority {

    private String priority;
    private Long totalProjects;
    private double percentage;

    public ProjectPriority(String priority, Long totalProjects, double percentage ){

        this.priority = priority;
        this.totalProjects = totalProjects;
        this.percentage = percentage;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
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
