package com.libraryAPIDB.librarydb.Controller;

import com.libraryAPIDB.librarydb.Models.Student;
import com.libraryAPIDB.librarydb.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add_student")
    public void addStudent(@RequestBody Student student){
        try {
            studentService.createStudent(student);
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
