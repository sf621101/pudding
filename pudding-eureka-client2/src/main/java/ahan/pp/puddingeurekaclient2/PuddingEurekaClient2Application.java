package ahan.pp.puddingeurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PuddingEurekaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(PuddingEurekaClient2Application.class, args);
	}
}
