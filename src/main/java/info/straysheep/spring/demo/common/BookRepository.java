package info.straysheep.spring.demo.common;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


@Component
public class BookRepository {

    private List<Book> books = new CopyOnWriteArrayList<>();

    @PostConstruct
    public void init() {
        books.add(new Book("book1", "book body"));
        books.add(new Book("book2", "nice"));
        books.add(new Book("book3", "hogehoge"));
    }

    public void save(Book book) {
        books.add(book);
    }

    public List<Book> findAll() {
        return books;
    }
}
