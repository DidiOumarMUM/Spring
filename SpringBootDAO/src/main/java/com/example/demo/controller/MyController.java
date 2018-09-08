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


import com.example.demo.domain.course;
import com.example.demo.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService ;
	
	@RequestMapping("/courses")
	public List<course> getCourses()
	{
       
       return this.courseService.getCourses() ;
	}
	
	@RequestMapping("/topics/{topicid}/courses/{id}")
	public course getCourse(@PathVariable("id") String id)
	{
       
       return this.courseService.getCourse(id) ;
	}
	
	
	@RequestMapping(value="/topics/{topicsid}/courses/{id}" , method=RequestMethod.POST)
	public course addCourse(@RequestBody course c)
	{
       this.courseService.addCourse(c) ;
       return c ;
	}
	

	@RequestMapping(value="/courses" , method=RequestMethod.PUT)
	public course updateCourse(@RequestBody course c)
	{
       this.courseService.updateCourse(c) ;
       return c ;
	}
	
	@RequestMapping(value="/courses/{id}" , method=RequestMethod.DELETE)
	public void deleteCourse(@PathVariable("id") String id)
	{
       this.courseService.deletCourse(id); 
      
	}

}
