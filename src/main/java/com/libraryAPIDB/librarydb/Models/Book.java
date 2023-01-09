package com.libraryAPIDB.librarydb.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "book") //creating table
public class Book {

    @Id //making primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int id;

    @Column(name="book_name") //column name
    private String name;

    private int pages;

    private String author;

    @OneToOne
    @JoinColumn //a column has been added in the child class
    private Student student; //connect student entity, connection should be in child class

}
