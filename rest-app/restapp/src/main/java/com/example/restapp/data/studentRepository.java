package com.example.restapp.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentRepository extends JpaRepository<Student,Integer>
{
    @Query("select s from Student s where s.name=?1")
public List<Student> getStudentByName(String name);

    @Query("select s from Student s where s.name=?1 AND s.age=?2")
    public List<Student> getStudentByNameAndAge(String name,int age);

//mysql select * form Student where name=....
    //jpql select s from Student s where s.name=?

}
