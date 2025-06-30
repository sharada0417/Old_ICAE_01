package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity //table creation
public class Workshop {
	@Id //primary key
	private Long id;
	private String name;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	
	@OneToMany(mappedBy = "workshop")
	private List<Session> sessions;
}
