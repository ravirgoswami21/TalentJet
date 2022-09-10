package com.college.project.api.enitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user_details")
@Getter
@Setter
@ToString
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId", unique = true, nullable = false)
	private Long userId;

	@Column(name = "full_name", nullable = false, length = 50)
	private String fullName;
	
	@Column(name = "gender", nullable = false, length = 50)
	private String gender;

	@Column(name = "email", nullable = false, length = 50, unique = true)
	private String email;

	@Column(name = "passowrd", nullable = false, length = 50)
	private String password;

	@Column(name = "mobile_number", nullable = false, length = 20)
	private String mobileNumber;


	@Column(name = "current_city", nullable = false, length = 50)
	private String currentCity;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id")
	private State  state;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id")
	private Country country;
	
	@Column(name = "work_status", nullable = false, length = 20)
	private Status workStatus;

	@Column(name = "highest_qualification", nullable = false, length = 50)
	private String highestQualification;

	@Column(name = "education_board", nullable = false, length = 50)
	private String educationBoard;
	
	@Column(name = "medium", nullable = false, length = 50)
	private String medium;
	
	@Column(name = "percentage", nullable = false, length = 50)
	private String percentage;
	
	@Column(name = "year", nullable = false, length = 50)
	private String year;
	
	@Column(name = "key_skills", nullable = false, length = 50)
	private String keySkills;
	
	@Column(name = "preferred_work_location", nullable = false, length = 50)
	private String preferredWorkLocation;
	
	private enum Status {
		FRESHER, EXPRIENCED
	}

}
