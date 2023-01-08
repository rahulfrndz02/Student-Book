package com.libraryAPIDB.librarydb.Repository;

import com.libraryAPIDB.librarydb.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//This is an Interface
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> { //entity class name, data type of primary key

}
