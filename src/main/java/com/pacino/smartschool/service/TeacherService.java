package com.pacino.smartschool.service;

/**
 * @Author
 * @create 2022/8/27 16:59
 */

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pacino.smartschool.pojo.LoginForm;
import com.pacino.smartschool.pojo.Teacher;

public interface TeacherService extends IService<Teacher> {


    Teacher login(LoginForm loginForm);


    Teacher getByTeacherById(Long userId);

    IPage<Teacher> getTeachersByOpr(Page<Teacher> paraParam, Teacher teacher);


}
