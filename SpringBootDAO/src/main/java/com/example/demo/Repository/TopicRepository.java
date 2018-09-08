package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Topic;

public interface TopicRepository extends CrudRepository<Topic , String> {

}
