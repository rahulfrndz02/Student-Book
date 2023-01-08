package com.libraryAPIDB.librarydb.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="card")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int fine;
    private String expiry;

    @OneToOne
    @JoinColumn //By default it keeps the primary id as foreign key
    public Student student; //telling that connect student entity
}
