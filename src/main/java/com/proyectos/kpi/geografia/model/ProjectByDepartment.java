package com.proyectos.kpi.geografia.model;

public class ProjectByDepartment {
    private String departamento;
    private Long totalProyectos;

    // Constructor
    public ProjectByDepartment(String departamento, Long totalProyectos) {
        this.departamento = departamento;
        this.totalProyectos = totalProyectos;
    }

    // Getters y Setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Long getTotalProyectos() {
        return totalProyectos;
    }

    public void setTotalProyectos(Long totalProyectos) {
        this.totalProyectos = totalProyectos;
    }
}
