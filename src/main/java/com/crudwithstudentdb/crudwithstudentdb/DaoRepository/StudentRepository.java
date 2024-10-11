package com.crudwithstudentdb.crudwithstudentdb.DaoRepository;

import com.crudwithstudentdb.crudwithstudentdb.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
