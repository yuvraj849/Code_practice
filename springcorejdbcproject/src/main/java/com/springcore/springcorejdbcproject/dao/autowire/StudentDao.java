package com.springcore.springcorejdbcproject.dao.autowire;

import java.util.List;

import com.springcore.springcorejdbcproject.entites.Student;

public interface StudentDao {
	public int insert(Student student);
    public int change(Student student);
    public int delete(int studentId);
    public Student getStudent(int studentId);
    public List<Student> getAllStudent(	);

}
