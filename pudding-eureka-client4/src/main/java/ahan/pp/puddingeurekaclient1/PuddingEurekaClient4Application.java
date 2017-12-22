package ahan.pp.puddingeurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PuddingEurekaClient4Application {

	public static void main(String[] args) {
		SpringApplication.run(PuddingEurekaClient4Application.class, args);
	}
}
