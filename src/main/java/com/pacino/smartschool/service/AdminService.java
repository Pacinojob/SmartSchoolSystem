package com.pacino.smartschool.service;

/**
 * @Author
 * @create 2022/8/27 16:57
 */

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pacino.smartschool.pojo.Admin;
import com.pacino.smartschool.pojo.LoginForm;

public interface AdminService extends IService<Admin> {
    Admin login(LoginForm loginForm);


    Admin getAdminById(Long userId);

    IPage<Admin> getAdminsByOpr(Page<Admin> pageParam, String adminName);



}
