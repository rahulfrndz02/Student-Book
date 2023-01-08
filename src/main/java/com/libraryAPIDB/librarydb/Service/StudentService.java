package com.libraryAPIDB.librarydb.Service;

import com.libraryAPIDB.librarydb.Models.Student;
import com.libraryAPIDB.librarydb.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    //creating student
    public void createStudent(Student student) throws Exception {
        //validation part of duplication part
        if(studentRepository.findById(student.getId()).get()!=null) {
            throw new Exception("Student is already present");
        }
        studentRepository.save(student);
    }
}
