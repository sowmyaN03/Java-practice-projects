package com.Application.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Application.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
