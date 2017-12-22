package pudding.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * create by wusf on 2017/12/22.<br>
 */
@RestController
@RequestMapping("/ribbon")
public class PuddingController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    public String hi(){
//        ServiceInstance serviceInstance = this.loadBalancerClient.choose("pudding-eureka-client1:192.168.1.176:8702");
//        System.out.println("111" + ":" + serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort());
//
//        return ("111" + ":" + serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort());
        System.out.println(this.restTemplate.getForObject("http://pudding-eureka-client1/say/hi",String.class));
        return this.restTemplate.getForObject("http://pudding-eureka-client1/say/hi",String.class);
    }

    @GetMapping("/happay")
    public String happay(){
//        ServiceInstance serviceInstance = this.loadBalancerClient.choose("pudding-eureka-client1:192.168.1.176:8702");
//        System.out.println("111" + ":" + serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort());
//
//        return ("111" + ":" + serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort());
        String kk=this.restTemplate.getForObject("http://pudding-eureka-client2/say/hi",String.class);
        System.out.println(kk);
        return kk;
    }
}
