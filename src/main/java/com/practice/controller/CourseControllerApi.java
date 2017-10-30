package com.practice.controller;

import com.practice.pojo.Topic;
import com.practice.service.CourseControllerApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseControllerApi {

	@Autowired
	private CourseControllerApiService apiService;

	@RequestMapping(value = "/topics")
	public List<Topic> getTopics(){
		return apiService.getAllTopics();
	}


	@RequestMapping(value = "/topics/{id}")
	public Topic getTopic(@PathVariable("id") String id){
			return apiService.getTopic(id);
	}

	@RequestMapping(method=RequestMethod.POST, value = "/topics/add")
	public void addTopic(@RequestBody List<Topic> topic){
		apiService.addTopic(topic);

	}
}
