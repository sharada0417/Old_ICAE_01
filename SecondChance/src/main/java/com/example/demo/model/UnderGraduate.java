package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //table creation
public class UnderGraduate {
	@Id //primary key
	private String id;
	private String name;
	private String email;
	private String gender;
	private Long phone;
	private String degree;
	private String university;
}
