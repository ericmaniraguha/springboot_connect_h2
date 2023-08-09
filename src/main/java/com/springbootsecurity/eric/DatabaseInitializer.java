package com.springbootsecurity.eric;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DatabaseInitializer {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() {
        createEmployeesTable();
        insertSampleData();
    }

    private void createEmployeesTable() {
        String createTableSql = "CREATE TABLE IF NOT EXISTS employees (" +
                "id INT PRIMARY KEY, " +
                "first_name VARCHAR(50), " +
                "last_name VARCHAR(50), " +
                "department VARCHAR(50), " +
                "position VARCHAR(50), " +
                "salary DECIMAL(10, 2)" +
                ")";
        jdbcTemplate.execute(createTableSql);
    }

    private void insertSampleData() {
        String insertDataSql = "INSERT INTO employees (id, first_name, last_name, department, position, salary) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(insertDataSql, 1, "John", "Doe", "HR", "Manager", 60000.0);
        jdbcTemplate.update(insertDataSql, 2, "Jane", "Smith", "Engineering", "Software Engineer", 75000.0);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            // Your code logic here
            // This method will be executed after Spring Boot application context is loaded
        };
    }
}
