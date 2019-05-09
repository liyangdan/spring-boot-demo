package cn.edu.hdu.services.demoservices;

import cn.edu.hdu.common.dto.User;

import cn.edu.hdu.services.services.UserServices;
import org.springframework.stereotype.Service;

/**
 * @author liyangdan
 * @date 2018/12/30 9:23 PM
 */

@Service
public class UserServicesImpl implements UserServices {

    @Override
    public void printUser(User user){
        System.out.println(user.toString());
    }
}

