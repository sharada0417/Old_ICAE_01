package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity //table creation
public class presenter {
	@Id //primary key
	private String id;
	private String name;
	private String email;
	private String gender;
	private Long phone;
	private String affliation;
	private String country;
	private String jobTitle;
	
	@ManyToMany
	@JoinTable(
		name = "presenter_sessions",
		joinColumns = @JoinColumn(name = "presenters_id"),
		inverseJoinColumns = @JoinColumn(name = "session_id")
	)
	
	private List<Session> sessions;
}
