package com.springbootshirorestful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringbootShiroRestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShiroRestfulApplication.class, args);
    }

}
