package com.college.project.api.enitites;

import java.time.LocalDateTime;

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
@Table(name = "job")
@Getter
@Setter
@ToString
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id", unique = true, nullable = false)
	private Long jobId;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_schedule_id")
	private JobSchedule jobSchedule;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "suppliment_pay_id")
	private SupplimentPay supplimentPay;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "offered_benefit_id")
	private OfferedBenefit offeredBenefit;

}
