package com.pluralsight.controller;

import java.util.List;

<<<<<<< HEAD
import javax.servlet.http.HttpSession;
=======
>>>>>>> 4cba2732c61bb05c116c5bed0041948dacaf1fba
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
<<<<<<< HEAD
import com.pluralsight.model.Goal;
=======
>>>>>>> 4cba2732c61bb05c116c5bed0041948dacaf1fba
import com.pluralsight.service.ExerciseService;


@Controller
public class MinutesController {

	@Autowired
	private ExerciseService exerciseService;
	
	@RequestMapping(value = "/addMinutes",  method = RequestMethod.GET)
	public String getMinutes(@ModelAttribute ("exercise") Exercise exercise) {
	
		return "addMinutes";
	}
	
	@RequestMapping(value = "/addMinutes",  method = RequestMethod.POST)
<<<<<<< HEAD
	public String addMinutes(@Valid @ModelAttribute ("exercise") Exercise exercise, HttpSession session, BindingResult result) {
=======
	public String addMinutes(@Valid @ModelAttribute ("exercise") Exercise exercise, BindingResult result) {
>>>>>>> 4cba2732c61bb05c116c5bed0041948dacaf1fba
		
		System.out.println("exercise: " + exercise.getMinutes());
		System.out.println("exercise activity: " + exercise.getActivity());
		
		if(result.hasErrors()) {
			return "addMinutes";
		}
<<<<<<< HEAD
		else {
			Goal goal = (Goal)session.getAttribute("goal"); 
			
			exercise.setGoal(goal);
			exerciseService.save(exercise);
		}
=======
>>>>>>> 4cba2732c61bb05c116c5bed0041948dacaf1fba
		
		return "addMinutes";
	}
	
	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		return exerciseService.findAllActivities();
	}
	
}
