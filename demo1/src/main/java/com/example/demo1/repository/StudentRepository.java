package com.example.demo1.repository;

import com.example.demo1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // بمجرد وراثة JpaRepository وتحديد الـ Entity (Student) ونوع الـ ID (Long)
    // أصبح لدينا تلقائياً دوال جاهزة مثل: save(), findAll(), findById(), deleteById()
}
