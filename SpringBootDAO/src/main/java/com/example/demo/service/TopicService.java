package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TopicRepository;
import com.example.demo.domain.Topic;

@Service
public class TopicService {
	@Autowired 
	private TopicRepository topicRepository ;
	
	
	public List<Topic> getTopics()
	{
      List<Topic> courses = new ArrayList<Topic>() ;
      topicRepository.findAll().forEach(c -> courses.add(c));
      return courses ;
	}
	
	public Topic getTopic(String id)
	{
      
       return this.topicRepository.findById(id).get() ;
	
	}
	
	public Topic addTopic(Topic c)
	{
      
		topicRepository.save( c) ;
       return c ;
	}

	public Topic updateTopic(Topic c)
	{
		topicRepository.save( c) ;
	     return c ;
	}
	
	public void deletTopic(String id)
	{
		topicRepository.deleteById(id); ;
	    
	}

}
