package com.example.application.Repository;

import com.example.application.Model.CourseStudent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<CourseStudent, String> {
}
