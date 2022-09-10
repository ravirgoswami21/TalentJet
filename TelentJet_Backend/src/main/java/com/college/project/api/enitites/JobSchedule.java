package com.college.project.api.enitites;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
@Table(name = "job_schedule")
@Getter
@Setter
@ToString
public class JobSchedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_schedule_id", unique = true, nullable = false)
	private Long jobScheduleId;
	
	@Column(name = "descripation" , length = 255)
	private String descripation;
	
	@Column(name = "start_date_time" , length = 255)
	private LocalDateTime starDateTime;
	
	@Column(name = "end_date_time" , length = 255)
	private LocalDateTime EndDateTime;

}
