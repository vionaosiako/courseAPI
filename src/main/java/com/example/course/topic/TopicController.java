package com.example.course.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public String GetAllTopics() {
        return "All topics";
    }
}
