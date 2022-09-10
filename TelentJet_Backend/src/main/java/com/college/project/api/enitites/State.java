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
@Table(name = "state")
@Getter
@Setter
@ToString
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "state_id", unique = true, nullable = false)
	private Long stateId;
	
	@Column(name = "state_code", unique = true, nullable = false)
	private String stateCode;
	
	@Column(name = "state_name", unique = true, nullable = false)
	private String stateName;

}
