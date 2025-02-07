package com.proyectos.kpi.geografia.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.proyectos.kpi.geografia.model.ProjectPriority;

import java.util.List;

@Repository
public class ProjectPriorityRepository {

    private final JdbcTemplate jdbcTemplate;

    private static final String QUERY_PROJECT_PRIORITY =
            "SELECT " +
                    "    prioridad, " +
                    "    COUNT(*) AS total_proyectos, " +
                    "    CAST(COUNT(*) AS FLOAT) / (SELECT COUNT(*) FROM ProyectosPeru) * 100 AS porcentaje " +
                    "FROM " +
                    "    ProyectosPeru " +
                    "GROUP BY " +
                    "    prioridad " +
                    "ORDER BY " +
                    "    CASE " +
                    "        WHEN prioridad = 'A' THEN 1 " +
                    "        WHEN prioridad = 'B' THEN 2 " +
                    "        WHEN prioridad = 'C' THEN 3 " +
                    "        WHEN prioridad = 'D' THEN 4 " +
                    "        ELSE 5 " +
                    "    END";

    public ProjectPriorityRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ProjectPriority> getProjectPriority() {
        return jdbcTemplate.query(
                QUERY_PROJECT_PRIORITY,
                (rs, rowNum) -> new ProjectPriority(
                        rs.getString("prioridad"),
                        rs.getLong("total_proyectos"),
                        rs.getDouble("porcentaje")
                )
        );
    }
}
