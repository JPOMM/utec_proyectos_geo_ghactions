package com.proyectos.kpi.geografia.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.proyectos.kpi.geografia.model.ProjectViability;

import java.util.List;

@Repository
public class ProjectViabilityRepository {
    @Autowired
    private final JdbcTemplate jdbcTemplate;

    private static final String QUERY_PROJECT_VIABILITY =
            "SELECT " +
                    "    CASE " +
                    "        WHEN situation = 'APROBADO' THEN 'APROBADO' " +
                    "        WHEN situation = 'VIABLE' THEN 'VIABLE' " +
                    "        WHEN situation = 'EN FORMULACION' THEN 'EN FORMULACION' " +
                    "        WHEN situation = 'CERRADO' THEN 'CERRADO' " +
                    "        ELSE 'OTRO' " +
                    "    END AS estado_situacion, " +
                    "    COUNT(*) AS total_proyectos, " +
                    "    CAST(COUNT(*) AS FLOAT) / (SELECT COUNT(*) FROM ProyectosPeru) * 100 AS porcentaje " +
                    "FROM " +
                    "    ProyectosPeru " +
                    "GROUP BY " +
                    "    CASE " +
                    "        WHEN situation = 'APROBADO' THEN 'APROBADO' " +
                    "        WHEN situation = 'VIABLE' THEN 'VIABLE' " +
                    "        WHEN situation = 'EN FORMULACION' THEN 'EN FORMULACION' " +
                    "        WHEN situation = 'CERRADO' THEN 'CERRADO' " +
                    "        ELSE 'OTRO' " +
                    "    END " +
                    "ORDER BY " +
                    "    MIN(CASE " +
                    "            WHEN situation = 'APROBADO' THEN 1 " +
                    "            WHEN situation = 'VIABLE' THEN 2 " +
                    "            WHEN situation = 'EN FORMULACION' THEN 3 " +
                    "            WHEN situation = 'CERRADO' THEN 4 " +
                    "            ELSE 5 " +
                    "        END)";

    public ProjectViabilityRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ProjectViability> getProjectViability() {
        return jdbcTemplate.query(
                QUERY_PROJECT_VIABILITY,
                (rs, rowNum) -> new ProjectViability(
                        rs.getString("estado_situacion"),
                        rs.getLong("total_proyectos"),
                        rs.getDouble("porcentaje")
                )
        );
    }

}
