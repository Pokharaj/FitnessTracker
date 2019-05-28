package com.pluralsight.service;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import com.pluralsight.repository.ExerciseRepository;
=======
import org.springframework.stereotype.Service;

import com.pluralsight.model.Activity;
>>>>>>> 4cba2732c61bb05c116c5bed0041948dacaf1fba


@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

<<<<<<< HEAD
	@Autowired
	private ExerciseRepository exerciseRepository;
	
=======
>>>>>>> 4cba2732c61bb05c116c5bed0041948dacaf1fba
	public List<Activity> findAllActivities() {
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
	}
<<<<<<< HEAD

	@Transactional
	public Exercise save(Exercise exercise) {
		
		exercise = exerciseRepository.save(exercise);
		
		return exercise;
	}
=======
>>>>>>> 4cba2732c61bb05c116c5bed0041948dacaf1fba
	
}
