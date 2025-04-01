package com.ust.repository;
import com.ust.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByName(String name);
}
