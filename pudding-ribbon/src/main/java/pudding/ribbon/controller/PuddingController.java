package pudding.ribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pudding.ribbon.entity.ResponseBean;

import java.time.LocalTime;

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
    @HystrixCommand(fallbackMethod = "hiFallBack")  //todo 异常切换渠道
    public String hi(){
        System.out.println(this.restTemplate.getForObject("http://pudding-eureka-client1/say/hi",String.class));
        return this.restTemplate.getForObject("http://pudding-eureka-client1/say/hi",String.class);
    }


    public String hiFallBack(){
        return "嗨你妹个嗨!";
    }
    @GetMapping("/happay")
    public String happay(){
        String kk=this.restTemplate.getForObject("http://pudding-eureka-client2/say/hi",String.class);
        System.out.println(kk);
        return kk;
    }

    @RequestMapping("/play/dolly")
    @HystrixCommand(fallbackMethod = "playDollyFallBack")
    public ResponseBean playDolly(){
        return this.restTemplate.getForObject("http://pudding-eureka-client1/play/dolly?time="+LocalTime.now().toString()+"&type=dolly",ResponseBean.class);
    }

    public ResponseBean playDollyFallBack(){
        return new ResponseBean();
    }
}
