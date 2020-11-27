package com.why.dao;

import com.why.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: wanghongyu | stan.wang@paytm.com
 * @create: 2020/11/27 6:37 下午
 **/
@Component
public class CourseDao {

    @Autowired
    private RestTemplate restTemplate;

    public List<Course> getCourses(){
        String url = "http://localhost:9001/course/getCourses";
        return this.restTemplate.getForObject(url, ArrayList.class);
    }

    public Course getCourseById(String id){
        String url = "http://localhost:9001/course/getCourse/"+id;
        return this.restTemplate.getForObject(url, Course.class);
    }
}
