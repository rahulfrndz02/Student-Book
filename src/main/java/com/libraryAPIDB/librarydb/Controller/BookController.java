package com.libraryAPIDB.librarydb.Controller;

import com.libraryAPIDB.librarydb.Service.BookService;
import com.libraryAPIDB.librarydb.Models.Book;
import com.libraryAPIDB.librarydb.Models.Student;
import com.libraryAPIDB.librarydb.Models.UpdateBookPages;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/add_book")
    public void addBook(@RequestBody Book book){
        try {
            bookService.createBook(book);
        }
        catch (Exception e){
           throw new RuntimeException(e);
        }
    }

    @GetMapping("/get_book")
    public Book getBook(@PathParam("id") Integer id){
        try {
            Book book = bookService.getBookById(id);
            return book;
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @PutMapping("/update_pages")
    public void updateBookPages(@RequestBody UpdateBookPages updateBookPages) {
        bookService.updateBookPages(updateBookPages);
    }

    @DeleteMapping("/delete_book_by_id/{id}")
    public void deleteBook(@PathVariable("id") Integer id) {
        try {
            bookService.deleteBookById(id);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
