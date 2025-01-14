package com.jenkins;

import jakarta.annotation.security.RunAs;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SpringJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Tested successfully....");
		logger.info("WOWOWOWOWO...");
	}

}
