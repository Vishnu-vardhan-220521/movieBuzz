package com.movieBuzz;

import java.util.Scanner;

public class Movies extends Thread{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		chiru c=new chiru();
		balayya b=new balayya();
		mahesh m=new mahesh();

	System.out.println("Enter movie name");
	String op=sc.next();
	if(op.equals("chiru")) {
		
		c.start();
	}else  if(op.equals("balayya")){
		
		b.start();
	}else  if(op.equals("mahesh")){
		
		m.start();
	}
	else {
		c.start();
		b.start();
		m.start();

}
	
sc.close();
	

}
}

