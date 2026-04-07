package com.aops.repository;
import com.aops.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface StudentRepository extends MongoRepository<Student,String>{
}