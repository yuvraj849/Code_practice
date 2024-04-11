package com.springcore.springcorejdbcproject.dao.autowire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springcore.springcorejdbcproject.entites.Student;

@Component("studentDao")
public class StudentDaoimpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate1;
	
	
	@Override
	public int insert(Student student) {
		String q = "insert into student(id, name, city) values(?,?,?)";
		int result = this.jdbcTemplate1.update(q,student.getId(),student.getName(),student.getCity());
		return result;
	}
	
	
	@Override
	public int change(Student student) {
		String q ="update student set name=? , city=? where id=? ";
		int result = this.jdbcTemplate1.update(q, student.getName(), student.getCity(),student.getId());
		return result;
	}
	@Override
	public int delete(int studentId) {
		String q ="delete from student  where id=? ";
		int result = this.jdbcTemplate1.update(q, studentId);
		return result;
	}
	
	@Override
	public Student getStudent(int studentId) {
		
		String q ="select * from student  where id=? ";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student result = this.jdbcTemplate1.queryForObject(q, rowMapper, studentId);
		return result;
	}
	

	@Override
	public List<Student> getAllStudent() {
		// multipe student
		String q="select * from student";
		List<Student> students = this.jdbcTemplate1.query(q, new RowMapperImpl());
		return students;
	}

	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate1;
	}
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate1 = jdbcTemplate;
	}



	
	

	

	

}
