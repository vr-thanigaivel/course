package com.example.application.Service;

import com.example.application.Model.CourseStudent;
import com.example.application.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public CourseStudent createCourse(CourseStudent courseStudent) {
       return  courseRepository.save(courseStudent);
    }
}
