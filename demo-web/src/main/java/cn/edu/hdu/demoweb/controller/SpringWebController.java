package cn.edu.hdu.demoweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyangdan
 * @date 2018/12/30 9:19 PM
 */
@RestController
@RequestMapping("/demo")
public class SpringWebController {

    @RequestMapping(value = "/create")
    public void testCreate(){
        System.out.println("my spring boot test is successful test");
    }
}
