package com.pacino.smartschool.service;

/**
 * @Author
 * @create 2022/8/27 16:58
 */

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pacino.smartschool.pojo.LoginForm;
import com.pacino.smartschool.pojo.Student;


public interface StudentService extends IService<Student> {


    Student login(LoginForm loginForm);


    Student getStudentById(Long userId);

    IPage<Student> getStudentByOpr(Page<Student> pageParam, Student student);


}
