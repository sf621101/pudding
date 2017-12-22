package ahan.pp.puddingeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaServer
public class PuddingEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuddingEurekaServerApplication.class, args);
	}
}
