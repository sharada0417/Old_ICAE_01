package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

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
}
