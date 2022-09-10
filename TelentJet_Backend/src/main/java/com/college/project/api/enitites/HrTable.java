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
@Table(name = "hr_table")
@Getter
@Setter
@ToString
public class HrTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hrId", unique = true, nullable = false)
	private Long hrId;

	private String name;

	private String gender;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id", nullable = false)
	private Company company;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "education_id", nullable = false)
	private Qualification qualification;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id", nullable = false)
	private Country country;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id", nullable = false)
	private State state;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "skill_id", nullable = false)
	private Skills skills;

}
