package com.example.restapp.service;

import ch.qos.logback.classic.boolex.StubEventEvaluator;
import com.example.restapp.data.Student;
import com.example.restapp.data.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class StudentService {

    @Autowired
    private studentRepository stuRepo;

    public List<Student> getAllStudents()
    {

        //call service methods...
        return stuRepo.findAll();
    }
    public Student getStudentById(int id)
    {
        Optional<Student> stu = stuRepo.findById(id);
        if(stu.isPresent())
        {
           return stu.get();
        }
        return null;
    }

    public Student createStudent(Student stu) {
        return stuRepo.save(stu);
    }
    public List<Student> getStudentByName(String name)
    {
        return stuRepo.getStudentByName(name);
    }
    public List<Student> getStudentByNameAndAge(String name,int age)
    {
        return stuRepo.getStudentByNameAndAge(name,age);
    }
}
