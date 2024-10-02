package com.smart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name ="CONTACT")
public class Contact {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cId;
	private String name;
	private String secondName;
	private String work;
	
	private String email;
	
	private String phone;

	private String image;
	
	@Column(length = 500)
	private String description;

	// many contact can belong to one user, so no need to take any collection
	@ManyToOne
	@JsonIgnore // to avoid circlur serialization while doing search conatct functionality
	private User user;

}
