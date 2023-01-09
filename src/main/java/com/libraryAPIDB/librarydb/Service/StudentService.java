package com.libraryAPIDB.librarydb.Service;

import com.libraryAPIDB.librarydb.Models.Book;
import com.libraryAPIDB.librarydb.Models.Student;
import com.libraryAPIDB.librarydb.Models.UpdateBookPages;
import com.libraryAPIDB.librarydb.Models.UpdateStudentName;
import com.libraryAPIDB.librarydb.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    //creating student
    public void createStudent(Student student) {
        Student studentObj = new Student();

        studentObj.setName(student.getName());
        studentObj.setAge(student.getAge());
        studentObj.setEmail(student.getEmail());
        studentObj.setCountry(student.getCountry());
        studentRepository.save(studentObj);
    }

    public Student getStudentById(Integer id){
        Student student = studentRepository.findById(id).get();
        return student;
    }

    public void updateStudentName(UpdateStudentName updateStudentName){
        int id = updateStudentName.getId();
        Student studentToBeUpdated = studentRepository.findById(id).get();
        studentToBeUpdated.setName(updateStudentName.getName());
        studentRepository.save(studentToBeUpdated);
    }

    public void deleteStudentById(Integer id){
        studentRepository.deleteById(id);
    }
}
