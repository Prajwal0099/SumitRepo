package com.calories.Calculator;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.calories.Calculator.Dao","com.calories.Calculator.Service"})
public class Config {
	
	@Bean
	public JdbcTemplate jdbc() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(ds());
		return jdbcTemplate;
	}
	
	@Bean
	public DataSource ds() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setPassword("Prajwal@2000");
		
		return dataSource;
		
		
	}

}
