package com.why.service;

import com.why.dao.CourseDao;
import com.why.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: wanghongyu | stan.wang@paytm.com
 * @create: 2020/11/27 6:42 下午
 **/
@Service
public class CourseService {
    @Autowired
    private CourseDao courseDao;

    public List<Course> getCourses(){
        return courseDao.getCourses();
    }

    public Course getCourseById(String id){
        return courseDao.getCourseById(id);
    }
}
