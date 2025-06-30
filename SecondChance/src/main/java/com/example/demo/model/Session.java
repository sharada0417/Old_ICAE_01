package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity //table creation
public class Session {
	@Id //primary key
	private String id;
	private String name;
	private String description;
	private LocalDate date;
	private LocalTime time;
	
	@ManyToOne
	@JoinColumn(name = "workshop_id")
	private Workshop workshop;
}
