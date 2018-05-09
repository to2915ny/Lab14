package edu.handong.csee.java.lab14.prob6;

public class CustomID extends Exception {//public class CustomID which inherits Exception
	private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"};//private string array races with and store "Vulcans", "Romulan", "Klingons"
	private String name = "";//private instance variable String name 
	private int age = 0;//private instance variable int age =0
	private String race = "";//private string race
	private int state = 0;//private int state =0

	public void set_name(String str) throws Exception//public method set_name with parameter str throws Exception
	{
		if(str.length() < 5) {//if str length less than 5
			state = 0;//state =0
			throw new Exception("Your name is short! Try again!");///throw new Exception "Your name is short! Try again!"
		}

		else {//else
			this.name = str;//store str to variable name
			System.out.println("Name is valid");//print "Name is valid"
			System.out.println("Name: " + this.name);//print out "Name and the value of variable name"
			state++;//increment state
		}
	}



	public void set_age(int num) throws Exception//public method set_age with parameter int num throws Exception
	{
		if(num < 18) {//if nub is less than 18
			state = 1;//state =1
			throw new Exception("You are too young! Try again!");//throw new Exception "You are too young! Try again!"
		}
		else {//else
			this.age = num;//store num to variable age
			System.out.println("Age is valid");//print out "Age is valid"
			System.out.println("Age: " + this.age);//print out "Age and the value of age
			state++;//increment state
		}
	}

	public void set_race(String race) throws Exception{//public method set_race with parameter String race throws Exception
		for(int i = 0; i < races.length; i++)//for i =0 ; i is less than races length ; increment i 
		{
			if(races[i].equals(race)) {//if race[0],race[1],race[2] is equal to input race
				this.race = races[i];//put the matching array's value to instancce variable race
				System.out.println("Race is valid");//print out "Race is valid"
				System.out.println("Race: " + this.race);//print "Race" and race
				state = 0;//state =0 and return
				return;//return
			}
		}
		state = 2;//else state =2 
		throw new Exception("Human! Try again.");//and throw new Exception "Human! Try again!"
	}
	public int getState()//public method getState which returns integer
	{
		return state;//return state
	}
}
