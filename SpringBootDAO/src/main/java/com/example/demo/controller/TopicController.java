package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Topic;
import com.example.demo.domain.course;
import com.example.demo.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService ;
	
	@RequestMapping("/topics")
	public List<Topic> getTopics()
	{
       
       return this.topicService.getTopics() ;
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable("id") String id)
	{
       
       return this.topicService.getTopic(id) ;
	}
	
	
	@RequestMapping(value="/topics" , method=RequestMethod.POST)
	public Topic addTopic(@RequestBody Topic t)
	{
       this.topicService.addTopic(t) ;
       return t ;
	}
	

	@RequestMapping(value="/topics" , method=RequestMethod.PUT)
	public Topic updateTopic(@RequestBody Topic t)
	{
       this.topicService.updateTopic(t) ;
       return t ;
	}
	
	@RequestMapping(value="/topics/{id}" , method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable("id") String id)
	{
       this.topicService.deletTopic(id); 
      
	}

}
