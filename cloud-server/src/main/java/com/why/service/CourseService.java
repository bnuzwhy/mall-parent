package com.why.service;

import com.why.dao.CourseMapper;
import com.why.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: wanghongyu | stan.wang@paytm.com
 * @create: 2020/11/27 5:51 下午
 **/
@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;

    public List<Course> selectAll(){
        return courseMapper.selectAll();
    }

    public Course selectById(String id){
        return courseMapper.selectById(id);
    }
}
