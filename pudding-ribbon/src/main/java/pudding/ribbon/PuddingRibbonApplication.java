package pudding.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient //ribbion 也是一个eureka client
public class PuddingRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuddingRibbonApplication.class, args);
	}

	@Bean
    @LoadBalanced
	public RestTemplate restTemplate(){
	    return new RestTemplate();
    }
//    @Bean
//    public IRule ribbonRule() {
//        return new RandomRule();//这里配置策略，和配置文件对应
//    }
}
