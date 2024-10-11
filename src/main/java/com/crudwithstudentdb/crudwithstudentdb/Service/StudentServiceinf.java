package com.crudwithstudentdb.crudwithstudentdb.Service;

import com.crudwithstudentdb.crudwithstudentdb.Model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentServiceinf {
    List<Student> getAllStudent();

    Optional<Student> getbyId(Integer id);
    Student AddStudent(Student student);
    Student updateStudent(Student student,Integer id);
    void deletebyid(Integer id);
}
