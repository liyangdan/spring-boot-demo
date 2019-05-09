package cn.edu.hdu.services.demoweb.controller;

import cn.edu.hdu.common.dto.User;
import cn.edu.hdu.services.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyangdan
 * @date 2018/12/30 6:55 PM
 */
@RestController
@RequestMapping("/demo1")
public class ControllerTest {
    @Autowired
    UserServices userServices;

    @RequestMapping(value = "/create1")
    public void testCreate(){
        System.out.println("my spring boot test is successful test1");
        User user = new User();
        user.setId(1000L);
        userServices.printUser(user);

    }

}
