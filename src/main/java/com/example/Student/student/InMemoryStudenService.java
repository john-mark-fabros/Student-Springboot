package com.example.Student.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudenService implements StudentService{

    private final StudentDAO dao;

    public InMemoryStudenService(StudentDAO dao) {
        this.dao = dao;
    }
    @Override
    public Student save(Student student) {
        return dao.save(student);
    }

    @Override
    public List<Student> findAllStudent() {
        return dao.findAllStudent();
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return dao.updateStudent(student);
    }

    @Override
    public void deleteByEmail(String email) {
        dao.deleteByEmail(email);
    }
}
