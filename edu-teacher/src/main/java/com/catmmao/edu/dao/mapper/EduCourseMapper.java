package com.catmmao.edu.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catmmao.edu.entity.EduCourse;
import org.apache.ibatis.annotations.Mapper;

/**
 * 课程(EduCourse)表数据库访问层
 *
 * @author catmmao
 * @since 2021-08-18 19:17:47
 */
@Mapper
public interface EduCourseMapper extends BaseMapper<EduCourse> {

}

