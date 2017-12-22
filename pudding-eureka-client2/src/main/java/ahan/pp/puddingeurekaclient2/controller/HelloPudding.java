package ahan.pp.puddingeurekaclient2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by wusf on 2017/12/22.<br>
 */
@RestController
@RequestMapping("/say")
public class HelloPudding {

    @RequestMapping("/hi")
    public  String sayHi(){
        return " hi pudding2";
    }
}
