package br.com.moura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MouraApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MouraApiApplication.class, args);
    }
}
