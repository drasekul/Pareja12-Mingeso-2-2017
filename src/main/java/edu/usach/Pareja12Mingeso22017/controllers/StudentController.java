package edu.usach.Pareja12Mingeso22017.controllers;

import edu.usach.Pareja12Mingeso22017.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

//Test13
@Transactional
public interface StudentController extends CrudRepository<Student, Long> {

    public Student findByName(@Param("name")String name);



}
