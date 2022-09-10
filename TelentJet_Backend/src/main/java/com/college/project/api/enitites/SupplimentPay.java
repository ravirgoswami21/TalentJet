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
@Table(name = "suppliment_pay")
@Getter
@Setter
@ToString
public class SupplimentPay {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "suppliment_pay_id", unique = true, nullable = false)
	private Long supplimentPayId;

	@Column(name = "descriptation")
	private String descriptation;

}
