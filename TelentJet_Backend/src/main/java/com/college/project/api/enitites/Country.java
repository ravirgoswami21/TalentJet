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
@Table(name = "country")
@Getter
@Setter
@ToString
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id", unique = true, nullable = false)
	private Long countryId;
	
	@Column(name = "country_code", unique = true, nullable = false)
	private String countryCode;
	
	@Column(name = "country_name", unique = true, nullable = false)
	private String countryName;

}
