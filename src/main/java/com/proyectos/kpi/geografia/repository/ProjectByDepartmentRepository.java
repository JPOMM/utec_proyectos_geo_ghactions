package com.proyectos.kpi.geografia.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.proyectos.kpi.geografia.model.ProjectByDepartment;

import java.util.List;

@Repository
public class ProjectByDepartmentRepository {
        private final JdbcTemplate jdbcTemplate;
        private static final String QUERY_PROYECTOS_POR_DEPARTAMENTO =
                "SELECT departamento, COUNT(*) AS total_projects " +
                        "FROM ProyectosPeru WITH(NOLOCK) " +  // Optimización para SQL Server
                        "GROUP BY departamento " +
                        "ORDER BY COUNT(*) DESC";

        public ProjectByDepartmentRepository(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
        }

        public List<ProjectByDepartment> getProjectByDepartment() {
            return jdbcTemplate.query(
                    QUERY_PROYECTOS_POR_DEPARTAMENTO,
                    (rs, rowNum) -> new ProjectByDepartment(
                            rs.getString("departamento"),
                            rs.getLong("total_projects")
                    )
            );
        }
}
