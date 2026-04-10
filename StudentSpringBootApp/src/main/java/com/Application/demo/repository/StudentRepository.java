package com.Application.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Application.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
