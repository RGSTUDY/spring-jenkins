package com.jenkins;

import jakarta.annotation.PostConstruct;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    public static void main(String[] args) {
        logger.info("Started....");
		SpringApplication.run(SpringJenkinsApplication.class, args);
    }

    @PostConstruct
    public void init() {
        logger.info("Application has been started.....");
    }

}
