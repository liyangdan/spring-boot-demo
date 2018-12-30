package cn.edu.hdu.demoweb.controller;

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

    @RequestMapping(value = "/create1")
    public void testCreate(){
        System.out.println("my spring boot test is successful test1");
    }

}
