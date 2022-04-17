package com.ali;

import com.ali.domain.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootTest
class Springboot17MongodbApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void contextLoads() {
        Book book = new Book();
        book.setId(2);
        book.setName("springboot2");
        book.setType("springboot2");
        mongoTemplate.save(book);
    }


    @Test
    void find(){
        List<Book> all = mongoTemplate.findAll(Book.class);
        System.out.println(all);
    }

    @AfterEach
    void tearDown() {

    }
}
