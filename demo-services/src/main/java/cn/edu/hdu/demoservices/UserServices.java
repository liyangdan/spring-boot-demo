package cn.edu.hdu.demoservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liyangdan
 * @date 2018/12/30 9:23 PM
 */

@Service
public class UserServices {

    public void getUser(){
        System.out.println("hello world");
    }

    public void saveUser(String name,Integer age, String address){

    }
}

