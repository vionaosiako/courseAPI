package com.example.course.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("spring","spring framework","spring framework description"),
            new Topic("java","core java","java description"),
            new Topic("javascript","javascript framework","javascript framework description")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }
}
