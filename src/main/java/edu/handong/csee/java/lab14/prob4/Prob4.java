package edu.handong.csee.java.lab14.prob4;

import java.util.Scanner;//import class Scanner

public class Prob4 {//public class Prob4
	public static void main(String[] args)//method main
	{
		Scanner keyboard = new Scanner(System.in);//instantiate Scanner to keyboard
		int num = 0;//local variable int num set to zero
		Boundary arr = new Boundary();//instantiate Boundary to arr
		boolean repeat = true;//boolean variable repeat set to true
		while(repeat)//while true
		{
			try//try
			{
				System.out.print("Enter an integer: ");//print "Enter an integer: "
				num = keyboard.nextInt();//store integer input to num
				arr.receive(num);//call arr's receive method with num as parameter
			}
			catch(ArrayIndexOutOfBoundsException e)//catch ArrayIndexOutOfBoundsException as e
			{
				System.out.println("Invalid array index access!");//print out "Invalid array index access!"
				repeat = false;//end the loop
			}
		}
	}
}

