package com.example.demo.domain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.SpringApplication;


@Entity
public class Topic {
	@Id
	private String id  ;
	private String name ;
	

	public Topic() {
		
	}
	public Topic(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	 
	 
	
}


