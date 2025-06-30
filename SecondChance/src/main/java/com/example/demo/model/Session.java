package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
	@JoinColumn(name = "workshop_id")//foreign key
	private Workshop workshop;//workshop object
	
	//relationship presenter(many) to sessions(many)
	@ManyToMany(mappedBy = "sessions")
	private List<presenter> presenters;
	
	//relationship sessions(many) to postgraduate(many)
	@ManyToMany(mappedBy = "sessions")
	private List<PostGraduate> postGraduates;
	
	//relationship session(many) to undergraduate
	@ManyToMany(mappedBy = "sessions")
	private List<UnderGraduate> underGraduates;
	
	

}
