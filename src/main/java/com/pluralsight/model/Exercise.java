package com.pluralsight.model;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Exercise {
	
	@Id
	@GeneratedValue
	private Long id;
	
=======
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;


public class Exercise {
	
>>>>>>> 4cba2732c61bb05c116c5bed0041948dacaf1fba
	@Range(min = 1, max = 120)
	private int minutes;

	@NotNull
	private String activity;
	
	@ManyToOne
	private Goal goal;

	public String getActivity() {
		return activity;
	}

	public Goal getGoal() {
		return goal;
	}

	public Long getId() {
		return id;
	}
	
	@NotNull
	private String activity;

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
}
