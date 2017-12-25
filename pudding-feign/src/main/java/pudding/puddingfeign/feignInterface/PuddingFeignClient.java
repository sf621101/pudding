package pudding.puddingfeign.feignInterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pudding.puddingfeign.fallback.FallbackHandel;

/**
 * create by wusf on 2017/12/25.<br>
 */
@FeignClient(name = "pudding-eureka-client1",fallback = FallbackHandel.class)//todo fallback 暂没有实现
public interface PuddingFeignClient {

    @RequestMapping(value = "/say/hi",method = RequestMethod.GET)
    public String sayHi();
}
