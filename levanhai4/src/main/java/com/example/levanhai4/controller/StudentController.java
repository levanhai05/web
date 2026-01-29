package com.example.levanhai4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.levanhai4.model.Student;
import com.example.levanhai4.service.StudentService;

@RestController
@RequestMapping("/api/students")
@CrossOrigin // cho phép frontend gọi
public class StudentController {

    @Autowired
    private StudentService service;

    // 1. API thêm sinh viên
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    // 2. API xóa sinh viên
    @PostMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        service.deleteStudent(id);
        return "Deleted student with ID = " + id;
    }

    // 3. Tim kiếm sinh viên theo tên
    @GetMapping("/search")
    public List<Student> searchByName(@RequestParam String name) {
        return service.findByName(name);
    }

    // 4. API lấy sinh viên theo ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return service.getStudentById(id);
    }

    // 5. API lấy danh sách sinh viên
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAll();
    }

    // 6. API cập nhật sinh viên
    @PutMapping("/{id}")
public Student updateStudent(
        @PathVariable Integer id,
        @RequestBody Student student) {

    Student existing = service.getStudentById(id);
    if (existing == null) {
        return null;
    }

    existing.setName(student.getName());
    existing.setEmail(student.getEmail());

    return service.addStudent(existing);
}


}