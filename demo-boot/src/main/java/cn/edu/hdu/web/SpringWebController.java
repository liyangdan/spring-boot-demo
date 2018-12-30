package cn.edu.hdu.web;

import cn.edu.hdu.demoservices.UserServices;
import cn.edu.hdu.demowebtest.UserServices1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyangdan
 * @date 2018/12/30 9:19 PM
 */
@RestController
@RequestMapping("/demo")
public class SpringWebController {
    @Autowired
    UserServices1 userServices;


    @RequestMapping(value = "/create")
    public void testCreate(){
        System.out.println("my spring boot test is successful");
        userServices.getUser();
    }
}
