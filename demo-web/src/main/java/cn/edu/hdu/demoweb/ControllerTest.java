package cn.edu.hdu.demoweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyangdan
 * @date 2018/12/30 6:55 PM
 */
@RestController
@RequestMapping("/demo2")
public class ControllerTest {

    @RequestMapping(value = "/create2")
    public void testCreate(){
        System.out.println("my spring boot test is successful");
    }

}
