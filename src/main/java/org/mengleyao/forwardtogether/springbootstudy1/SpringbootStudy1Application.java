package org.mengleyao.forwardtogether.springbootstudy1;

import org.mengleyao.forwardtogether.springbootstudy1.domain.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootStudy1Application {

    @Autowired
    private BookEntity bookEntity;



    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudy1Application.class, args);
    }

    @RequestMapping(value = "/", produces = "text/plain;charset=utf-8")
    public String index() {
        return "Hello Spring Boot! The BookName is "+bookEntity.getName()+";and Book Author is "+bookEntity.getAuthor()+";and Book Price is "+bookEntity.getPrice();
    }
}
