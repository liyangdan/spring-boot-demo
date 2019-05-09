package cn.edu.hdu.common.dto;

import lombok.Data;

/**
 * @author liyangdan
 * @date 2019/5/9 9:23 AM
 */
@Data
public class User {
    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户名称
     */
    private String userName;

}
