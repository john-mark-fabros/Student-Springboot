package com.example.Student.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

//@Service
public interface StudentService {

    Student save(Student student);

    List<Student> findAllStudent();
    Student findByEmail(String email);

    Student updateStudent(Student student);

    void deleteByEmail(String email);

}
