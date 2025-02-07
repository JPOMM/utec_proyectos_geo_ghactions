package com.proyectos.kpi.geografia.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.proyectos.kpi.geografia.model.DistrictProjectStats;

import java.util.List;

@Repository
public class DistrictStatsRepository {
    private final JdbcTemplate jdbcTemplate;

    private static final String QUERY_DISTRICT_STATS =
            "SELECT distrito, " +
                    "COUNT(*) AS total_projects, " +
                    "(COUNT(*) * 100.0) / (SELECT COUNT(*) FROM ProyectosPeru) AS percentage_of_total " +
                    "FROM ProyectosPeru WITH(NOLOCK) " +
                    "GROUP BY distrito " +
                    "ORDER BY percentage_of_total DESC";

    public DistrictStatsRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<DistrictProjectStats> getDistrictStats() {
        return jdbcTemplate.query(
                QUERY_DISTRICT_STATS,
                (rs, rowNum) -> new DistrictProjectStats(
                        rs.getString("distrito"),
                        rs.getLong("total_projects"),
                        rs.getDouble("percentage_of_total")
                )
        );
    }
}
