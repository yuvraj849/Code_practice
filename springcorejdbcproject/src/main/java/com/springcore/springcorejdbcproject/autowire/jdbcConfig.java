package com.springcore.springcorejdbcproject.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.springcore.springcorejdbcproject.dao.autowire"})
public class jdbcConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean("JdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(getDataSource());
		return temp;	
	}
	/*
	@Bean("studentdao")
	public StudentDao getStudentDao() {
		StudentDaoimpl studentDao=new StudentDaoimpl();
		studentDao.setJdbcTemplate(getTemplate());
		return studentDao;
	}*/

}
