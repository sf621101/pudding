package ahan.pp.puddingeurekaclient1.controller;

import ahan.pp.puddingeurekaclient1.entity.RequestBean;
import ahan.pp.puddingeurekaclient1.entity.ResponseBean;
import ahan.pp.puddingeurekaclient1.exception.ServiceException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

/**
 * create by wusf on 2017/12/22.<br>
 */
@RestController
public class HelloPudding {

    @RequestMapping(value = "/say/hi")
    public String sayHi()
    {
        throw new ServiceException("错误");
//        return  "hi pudding1";
    }

    @RequestMapping("/play/dolly")
    public ResponseBean getResponse(@RequestParam RequestBean bean){

//        LocalTime.now().compareTo(bean.getTime());
        ResponseBean responseBean=new ResponseBean();
        responseBean.setCode("请求时间 :"+bean.getTime());
        responseBean.setMsg("好呀，好呀。");
        return responseBean;
    }
}
