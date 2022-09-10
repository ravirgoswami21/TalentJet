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
@Table(name = "company")
@Getter
@Setter
@ToString
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id", unique = true, nullable = false)
	private Long companyId;

	@Column(name = "company_name", nullable = false)
	private String companyName;

	@Column(name = "company_location")
	private String companyLocation;

	@Column(name = "descripation")
	private String descripation;

}
