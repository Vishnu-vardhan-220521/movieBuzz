package com.gym;

public class workoutImplementation implements IWorkout {

	private Workout workouts[];
	
	public workoutImplementation()
	{
		workouts = new Workout[2];
	}

	@Override
	public void addWorkOut(Workout workout, int index) {
		// TODO Auto-generated method stub
		workouts[index] = workout;
	}

	@Override
	public Workout[] displayWorkOuts() {
		// TODO Auto-generated method stub
		
		return workouts;
	}
}