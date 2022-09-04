package com.pacino.smartschool.service;

/**
 * @Author
 * @create 2022/8/27 16:58
 */

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pacino.smartschool.pojo.Grade;

import java.util.List;

public interface GradeService extends IService<Grade> {


    IPage<Grade> getGradeByOpr(Page<Grade> page, String gradeName);


    List<Grade> getGrades();
}

