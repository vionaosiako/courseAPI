package com.example.course.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
//    @RequestMapping("/topics")
//    public String GetAllTopics() {
//        return "All topics";
//    }
//    @RequestMapping("/topics")
//    public List<Topic> getAllTopics(){
//        return Arrays.asList(
//            new Topic("spring","spring framework","spring framework description"),
//            new Topic("java","core java","java description"),
//            new Topic("javascript","javascript framework","javascript framework description")
//        );
//    }

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public  List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value ="/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    public void updateTopics(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic (id, topic);
    }
}
