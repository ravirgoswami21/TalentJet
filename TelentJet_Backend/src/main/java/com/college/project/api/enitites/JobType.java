package com.college.project.api.enitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "job_type")
@Getter
@Setter
@ToString
public class JobType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_type_id", unique = true, nullable = false)
	private Long jobTypeId;
	
	@Column(name = "job_type", nullable = false)
	private String jobType;
	

}
