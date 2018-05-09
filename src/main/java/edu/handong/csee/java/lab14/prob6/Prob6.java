package edu.handong.csee.java.lab14.prob6;

import java.util.Scanner;//import class Scanner

public class Prob6 {//public class Prob6

	public static void main(String[] args)//method main
	{
		String name, race;//String variable name and race
		int age = 0;//int variable age set to 0
		Scanner keyboard = new Scanner(System.in);//instantiate Scanner to keyboard
		CustomID obj = new CustomID();//instantiate CustomId to obj
		boolean repeat = true;//boolean variable repeat is set to true 

		while(repeat)//while true
		{
			try {//try
				if(obj.getState() == 0) {//if state ==0
					System.out.print("Enter your name: ");//print out "Enter your name: "
					name = keyboard.nextLine();//put input to variable name
					obj.set_name(name);//set_name with name
				}
				else if(obj.getState() == 1) {//if state ==1
					System.out.print("Enter your age: ");//print out "Enter your age: "
					age = keyboard.nextInt();//put input to variable age
					keyboard.nextLine();//skip a line
					obj.set_age(age);//set_age  with age
				}
				if(obj.getState() == 2) {//if state ==2
					System.out.print("Enter your race: ");//print out Enter your race
					race = keyboard.nextLine();//put input to variable race
					obj.set_race(race);//set_race with race
				}
			}
			catch(Exception e){//catch Exception as e
				System.out.println(e.getMessage());//print out e
				continue;//continue
			}
		}
	}
}


