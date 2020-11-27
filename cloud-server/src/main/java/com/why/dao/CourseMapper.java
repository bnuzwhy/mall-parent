package com.why.dao;

import com.why.model.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author: wanghongyu | stan.wang@paytm.com
 * @create: 2020/11/27 5:50 下午
 **/
public interface CourseMapper {

    @Select("select * from course")
    List<Course> selectAll();

    @Select("select * from course where course_id = #{id}")
    Course selectById(String id);
}
