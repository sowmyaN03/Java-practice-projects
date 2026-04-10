package com.Application.student.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Application.student.entity.Student;
import com.Application.student.repository.StudentRepository;
import com.Application.student.service.StudentService;

@RestController
public class StudentController {
	StudentService studService;

	public StudentController(StudentService studService) {
		super();
		this.studService = studService;
	}
	
	@PostMapping("/create")
	public String create(@RequestBody Student st) {
		studService.createStudent(st);
		return "Student is saved.";
	}
	
	@GetMapping("/get/{roll}")
	public Student get(@PathVariable int roll) {
		return studService.getStudent(roll);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAll() {
		return studService.getAllStudents();
	}
	
	@PutMapping("/update/{roll}")
	public String update(@PathVariable int roll, @RequestBody Student st) {
		st.setRoll(roll);
		studService.updateStudent(st);
		return "Student is updated.";
	}
	
	@DeleteMapping("delete/{roll}")
	public String delete(@PathVariable int roll) {
		studService.deleteStudent(roll);
		return "Student is deleted.";
	}
}
