package com.college.project.api.enitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "qualification")
@Getter
@Setter
@ToString
public class Qualification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "education_id", unique = true, nullable = false)
	private Long educationId;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private UserDetails user;
	
	@Column(name = "school_name", length = 255)
	private String schoolName;
	
	@Column(name = "board", length = 255)
	private String board;
	
	@Column(name = "degree", length = 255)
	private String degree;
	
	@Column(name = "intitute_name", length = 255)
	private String intituteName;
	
	@Column(name = "university", length = 255)
	private String University;

	@Column(name = "year_of_passing", nullable = false, length = 50)
	private String yearOfPassing;

}
