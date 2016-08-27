package info.straysheep.spring.demo.web;

import info.straysheep.spring.demo.common.Book;
import info.straysheep.spring.demo.common.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private BookRepository bookRepository;

    @Autowired
    public HelloController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/")
    public List<Book> index() {
        return bookRepository.findAll();
    }
}
