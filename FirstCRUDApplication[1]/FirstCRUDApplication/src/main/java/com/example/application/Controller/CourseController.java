package com.example.application.Controller;

import com.example.application.Model.CourseStudent;
import com.example.application.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping   //create
    public CourseStudent createCourse(@RequestBody CourseStudent courseStudent){
        return courseService.createCourse(courseStudent);
    }

}
