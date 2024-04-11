package com.springcore.springcorejdbcproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcore.springcorejdbcproject.entites.Student;

public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student sut= new Student();
		sut.setId(rs.getInt(1));
		sut.setName(rs.getString(2));
		sut.setCity(rs.getString(3));
		return sut;
	}

}
