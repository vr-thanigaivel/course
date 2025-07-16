package com.example.application.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "CourseDb")
public class CourseStudent {
    @Id
    private String id;
    private String name;
    private String email;
    private int courseDuration;
}
