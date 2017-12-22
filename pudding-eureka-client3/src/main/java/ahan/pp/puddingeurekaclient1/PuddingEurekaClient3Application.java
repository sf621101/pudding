package ahan.pp.puddingeurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PuddingEurekaClient3Application {

	public static void main(String[] args) {
		SpringApplication.run(PuddingEurekaClient3Application.class, args);
	}
}
