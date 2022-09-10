package com.college.project.api.enitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
@Getter
@Setter
@ToString
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId", unique = true, nullable = false)
	private Long userId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_detail_id", nullable = false)
	private UserDetails userDetails;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_skill_id", nullable = false)
	private Skills userSkills;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hrId")
	private HrTable hrTable;
	

}
