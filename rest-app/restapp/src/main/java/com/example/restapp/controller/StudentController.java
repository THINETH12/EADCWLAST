package com.example.restapp.controller;

import com.example.restapp.data.Student;
import com.example.restapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController


public class StudentController {

    @Autowired
    private StudentService obj;
    @GetMapping(path = "/Student")

    public List<Student> getAllStudents() { //get users
    //call service methods
        // StudentService obj = new StudentService();

        return obj.getAllStudents();

    }
    @GetMapping(path ="/Student/{id}")
    public Student getStudentById(@PathVariable int id)
    {

        return obj.getStudentById(id);

    }
    @PostMapping(path ="/Student")
    public Student createStudent(@RequestBody Student stu)
    {
        //....call service layer...
        return obj.createStudent(stu);
    }

    @GetMapping(path = "/Student",params = {"name"} )
    public List<Student> getStudentsByName(@RequestParam String name) {

        return obj.getStudentByName(name);
    }
    @GetMapping(path = "/Student", params = {"name", "age"})
    public List<Student> getStudentByNameAndAge(String name,int age)
    {
        return obj.getStudentByNameAndAge(name, age);
    }

}
