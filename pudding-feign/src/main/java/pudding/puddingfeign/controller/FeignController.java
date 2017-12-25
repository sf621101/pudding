package pudding.puddingfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import  pudding.puddingfeign.feignInterface.*;
/**
 * create by wusf on 2017/12/25.<br>
 */

@RestController
public class FeignController {

    @Autowired
    private PuddingFeignClient puddingfeignClient;

    @GetMapping("/feign/hi")
    public String feignHi(){
        return puddingfeignClient.sayHi();
    }

//    @Override
//    @GetMapping("/feign/hi")
//    public String sayHi() {
//        return super;
//    }
}
