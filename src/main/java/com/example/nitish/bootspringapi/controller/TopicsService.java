package com.example.nitish.bootspringapi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	private List<Topic> topics = new ArrayList<Topic> (Arrays.asList(
			new Topic("001", "Java", "Core Java"),
			new Topic("002", "JavaScript", "Front End"),
			new Topic("003", "C#", "Microsoft C#")
			));
	public List<Topic> getAll(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic t) {
		topics.add(t);
	}

//	public void updateTopic(String id, Topic t) {
//		for(Topic topic:topics) {
//			if(topic.getId().equals(id)) {
//				topics.set(topic.getId(), t) ;
//			}
//		}
//		
//	}
	
	public void updateTopic(String id, Topic topic) {
		for(int i=0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf((t) -> t.getId().equals(id));
	}
		
}
