package com.example.Student.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student("john mark",
                        "fabros", LocalDate.now(),
                        "fabrosjohnmarka@gmail.com",
                        23)
        );
    }
}
