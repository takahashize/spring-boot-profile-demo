package info.straysheep.spring.demo.batch;

import info.straysheep.spring.demo.common.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("batch")
public class BatchConfiguration {
    @Bean
    public CommandLineRunner batchScript(BookRepository bookRepository) {
        return args -> bookRepository.findAll().forEach(System.out::println);
    }
}
