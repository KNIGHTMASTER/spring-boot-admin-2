package com.wissensalt.rnd.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 3/8/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@RestController
@SpringBootApplication
public class Client1Application {
    public static void main(String [] args) {
        SpringApplication.run(Client1Application.class);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello From Client 2";
    }
}
