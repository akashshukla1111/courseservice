package com.practice.service;

import com.practice.pojo.Topic;
import com.practice.repository.TopicInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CourseControllerApiService {

	@Autowired
	private TopicInterface topicInterface;

	private List<Topic> topics = new ArrayList<>();

	public List<Topic> getAllTopics() {
		topicInterface.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(tp -> Objects.nonNull(tp) && tp.getId().equals(id)).findFirst().get();
	}

	public void addTopic(List<Topic> topic) {
		topicInterface.save(topic);
	}

	//	private List<Topic> topics = new ArrayList<Topic>(
	//			Arrays.asList(new Topic("java", "JAVA", "all the info related to java langauage"),
	//					new Topic("hbt", "HIBERNATE", "Hibernate related info"),
	//					new Topic("algo", "ALGORTHEM", "all the algorthem related info")));
}
