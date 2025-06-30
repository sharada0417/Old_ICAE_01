package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

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
}
