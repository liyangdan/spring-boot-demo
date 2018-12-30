package cn.edu.hdu.demowebtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyangdan
 * @date 2018/12/30 11:41 PM
 */
@RestController
@RequestMapping("/demo1")
public class MyController {

    @RequestMapping(value = "/create1")
    public void testCreate(){
        System.out.println("my spring bo");

    }
}
