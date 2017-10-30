package com.practice.repository;

import com.practice.pojo.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicInterface extends CrudRepository<Topic,String> {

}
