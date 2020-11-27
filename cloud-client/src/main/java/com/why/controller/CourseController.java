package com.why.controller;

import com.why.model.Course;
import com.why.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: wanghongyu | stan.wang@paytm.com
 * @create: 2020/11/27 6:43 下午
 **/
@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @GetMapping("course/{id}")
    public Course getCourseById(@PathVariable("id") String id){
        return courseService.getCourseById(id);
    }
}
