package br.com.moura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author alexandre.lovatini (alexandre.lovatini@castgroup.com.br)
 * @version 1.0
 * @since 1.0-SNAPSHOT
 */
@SpringBootApplication
public class MouraApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MouraApiApplication.class, args);
    }
}
