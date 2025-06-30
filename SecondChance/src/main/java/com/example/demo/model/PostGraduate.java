package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity //table creation
public class PostGraduate {
	@Id //primary key
	private String id;
	private String name;
	private String email;
	private String gender;
	private Long phone;
	private String institute;
	private String researchInterest;
	private String secondDegree;
	
	@ManyToMany
	@JoinTable(
		name = "post_graduate_sessions",
		joinColumns = @JoinColumn(name="postgraduates_id"),
		inverseJoinColumns = @JoinColumn(name= "session_id")
	)
	private List<Session> session;
}
