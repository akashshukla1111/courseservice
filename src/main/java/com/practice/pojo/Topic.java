package com.practice.pojo;

import javax.persistence.*;

@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String desp;

	public Topic() {

	}

	public Topic(String id, String name, String desp) {
		super();
		this.id = id;
		this.name = name;
		this.desp = desp;
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

	public String getDesp() {
		return desp;
	}

	public void setDesp(String desp) {
		this.desp = desp;
	}

	@Override
	public String toString() {
		return "Topic{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", desp='" + desp + '\'' + '}';
	}
}
