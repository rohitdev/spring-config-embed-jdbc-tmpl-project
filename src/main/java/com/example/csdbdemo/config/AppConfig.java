package com.example.csdbdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

//,org.springframework.cloud.config.server.environment.JdbcEnvironmentRepository
@Configuration
public class AppConfig implements Ordered {
//    @Value("${app.cache.redis.host}")
//    private String repositoriesPackage;

    @Value("${app.datasource.jdbc.className}")
    private String jdbcClassName;

    @Bean
    public static ConversionService conversionService() {
        return new DefaultConversionService();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(final DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
