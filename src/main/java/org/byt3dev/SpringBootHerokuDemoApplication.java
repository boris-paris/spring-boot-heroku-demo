package org.byt3dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringBootHerokuDemoApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello Heroku World";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHerokuDemoApplication.class, args);
    }
}
