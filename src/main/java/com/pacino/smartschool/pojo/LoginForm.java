package com.pacino.smartschool.pojo;

/**
 * @Author
 * @create 2022/8/27 16:53
 */
import lombok.Data;

/**
 * @project: ssm_sms
 * @description: 用户登录表单信息
 */
@Data
public class LoginForm {

    private String username;
    private String password;
    private String verifiCode;
    private Integer userType;

}
