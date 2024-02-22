package com.example.jpa.springdatajpademo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="notes")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Notes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	String author;
	String title;
	String description;
	
	

}
