package com.example.levanhai3.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.levanhai3.entity.Student;
public interface StudentRepository 
        extends JpaRepository<Student, Integer> {
}
