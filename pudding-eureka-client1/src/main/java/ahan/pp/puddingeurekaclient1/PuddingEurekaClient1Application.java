package ahan.pp.puddingeurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PuddingEurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(PuddingEurekaClient1Application.class, args);
	}
}
