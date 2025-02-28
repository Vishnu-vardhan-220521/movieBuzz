package com.gym;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		userImplementation userobj = new userImplementation();
		workoutImplementation workoutobj = new workoutImplementation();
		
		User user = new User("Hari","Narayana","Harin","hari123");
		userobj.register(user, 0);
		System.out.println("is user is valid:"+userobj.login("Harin", "hari123"));
		System.out.println("is user is valid:"+userobj.login("Naman", "naman"));
        
		//workoutinfo
		Workout workout1 = new Workout("Cardio","Tredmill",0,10,"Fitness");
		Workout workout2 = new Workout("muscle","dumbel",10,15,"strength");
		
		workoutobj.addWorkOut(workout1, 0);
		workoutobj.addWorkOut(workout2, 1);
		
		Workout workouts[] = workoutobj.displayWorkOuts();
		for(Workout w:workouts)
		{
			System.out.println(w);
		}
	}

}
