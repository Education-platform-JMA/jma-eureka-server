package ru.education_platform_jma.jmaeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JmaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmaEurekaServerApplication.class, args);
	}

}
