package com.libraryAPIDB.librarydb.Models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Entity
@Table(name="student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="student_name", nullable = false) //column name
    private String name;

    private int age;

    @Column(name = "school_email",unique = true,nullable = false)
    private String email;

    @Column(columnDefinition = "varchar(255) default 'India'")
    private String country;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

    @OneToOne(mappedBy = "student" ,cascade = CascadeType.ALL)
    private Book book;

}