package com.wissensalt.rnd.sba;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created on 3/8/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@EnableAdminServer
@SpringBootApplication
public class SbaApplication {
    public static void main(String [] args){
        SpringApplication.run(SbaApplication.class);
    }
}
