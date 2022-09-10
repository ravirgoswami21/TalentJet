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
@Table(name = "candidate_job")
@Getter
@Setter
@ToString(callSuper = true)
public class CandidateJob {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "candidate_id", unique = true, nullable = false)
	private Long candidateId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id", nullable = false)
	private Job job;

	@Column(name = "applied_on", nullable = false)
	private String appliedOn;

	@Enumerated(EnumType.STRING)
	@Column
	private ApplicationStatus applicationStatus;

	private enum ApplicationStatus {
		UNDER_REVIEW, PROGRESS
	}

}
