package com.aops.controller;
import com.aops.model.Student;
import com.aops.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class StudentController{
@Autowired private StudentRepository repo;
@GetMapping
public List<Student> getAll(){return repo.findAll();}
@PostMapping
public Student add(@RequestBody Student s){return repo.save(s);}
@PutMapping("/{id}")
public Student update(@PathVariable String id,@RequestBody Student s){
s.setId(id);return repo.save(s);}
@DeleteMapping("/{id}")
public String delete(@PathVariable String id){
repo.deleteById(id);return "Deleted";}}