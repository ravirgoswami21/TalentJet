package com.college.project.api.enitites;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "job_post")
@Getter
@Setter
@ToString
public class JobPost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_posting_id", unique = true, nullable = false)
	private Long jobPostingId;
	
	@Column(name = "state_code",  nullable = false)
	private String experience;
	
	@Column(name = "state_name",  nullable = false)
	private String location;
	
	@Column(name = "job_type",  nullable = false)
	private JobType jobType;
	
	private Skills userSkills;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	

}
