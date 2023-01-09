package com.libraryAPIDB.librarydb.Controller;

import com.libraryAPIDB.librarydb.Models.Book;
import com.libraryAPIDB.librarydb.Models.Student;
import com.libraryAPIDB.librarydb.Models.UpdateBookPages;
import com.libraryAPIDB.librarydb.Models.UpdateStudentName;
import com.libraryAPIDB.librarydb.Service.StudentService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
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

    @GetMapping("/get_student")
    public Student getStudent(@PathParam("id") Integer id){
        try {
            Student student = studentService.getStudentById(id);
            return student;
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    @PutMapping("/update_name")
    public void updateStudentName(@RequestBody UpdateStudentName updateStudentName) {
        studentService.updateStudentName(updateStudentName);
    }

    @DeleteMapping("/delete_student_by_id/{id}")
    public void deleteStudent(@PathVariable("id") Integer id) {
        try {
            studentService.deleteStudentById(id);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
