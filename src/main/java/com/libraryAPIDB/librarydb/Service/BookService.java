package com.libraryAPIDB.librarydb.Service;

import com.libraryAPIDB.librarydb.Models.Book;
import com.libraryAPIDB.librarydb.Models.Student;
import com.libraryAPIDB.librarydb.Repository.BookRepository;
import com.libraryAPIDB.librarydb.Models.UpdateBookPages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void createBook(Book book) {
        Book bookObj = new Book();
        bookObj.setName(book.getName());
        bookObj.setPages(book.getPages());
        bookObj.setAuthor(book.getAuthor());
        bookRepository.save(bookObj);
    }

    public Book getBookById(Integer id){
        Book book = bookRepository.findById(id).get();
        return book;
    }

    public void updateBookPages(UpdateBookPages updateBookPages){
        int id = updateBookPages.getId();
        Book bookToBeUpdated = bookRepository.findById(id).get();
        bookToBeUpdated.setPages(updateBookPages.getPages());
        bookRepository.save(bookToBeUpdated);
    }

    public void deleteBookById(Integer id){
        bookRepository.deleteAllById(Collections.singleton(id));
    }

}
