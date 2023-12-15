package com.example.csdbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.environment.JdbcEnvironmentRepository;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableConfigServer
@Import({DataSourceAutoConfiguration.class, JdbcTemplateAutoConfiguration.class, JdbcEnvironmentRepository.class})
//@ComponentScan(
//        basePackages = {
//                "com.example.csdbdemo"
//        })
public class CsdbdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsdbdemoApplication.class, args);
    }


}
