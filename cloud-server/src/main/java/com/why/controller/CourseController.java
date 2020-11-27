package com.why.controller;

import com.why.model.Course;
import com.why.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: wanghongyu | stan.wang@paytm.com
 * @create: 2020/11/27 5:52 下午
 **/
@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("getCourses")
    public List<Course> getCourse(){
        return courseService.selectAll();
    }

    @GetMapping("getCourse/{id}")
    public Course getCouseById(@PathVariable("id") String id){
        return courseService.selectById(id);
    }
}
