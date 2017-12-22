package ahan.pp.puddingeurekaclient1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by wusf on 2017/12/22.<br>
 */
@RestController
@RequestMapping(value = "/say")
public class HelloPudding {

    @RequestMapping(value = "/hi")
    public String sayHi(){
        return  "hi pudding1";
    }
}
