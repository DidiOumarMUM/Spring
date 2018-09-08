package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CourseRepository;
import com.example.demo.domain.course;;

@Service
public class CourseService {
	@Autowired 
	private CourseRepository courseRepository ;
	
	
	public List<course> getCourses()
	{
      List<course> courses = new ArrayList<course>() ;
      courseRepository.findAll().forEach(c -> courses.add(c));
      return courses ;
	}
	
	public course getCourse(String id)
	{
      
       return this.courseRepository.findById(id).get() ;
	
	}
	
	public course addCourse(course c)
	{
      
		courseRepository.save( c) ;
       return c ;
	}

	public course updateCourse(course c)
	{
		courseRepository.save( c) ;
	     return c ;
	}
	
	public void deletCourse(String id)
	{
		courseRepository.deleteById(id); ;
	    
	}

}
