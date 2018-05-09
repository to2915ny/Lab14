package edu.handong.csee.java.lab14.prob3;

import java.util.Scanner;//import class Scanner

public class Prob3 {//public class Prob3
	public static final Powercalc my_calculator = new Powercalc();//instantiate public Powercalc to my_calculator which is static and final
	public static final Scanner in = new Scanner(System.in);//instantiate public Scanner to in which is static and final

	public static void main(String[] args) {//method main
		while (in.hasNextInt()) {//while input type is integer
			int n = in.nextInt();//put input value to variable int n
			int p = in.nextInt();//put input value to variable int p

			try {//try
				System.out.println(my_calculator.power(n, p));//print out mycalculator's power(n,p)
			} catch (Exception e) {//catch Exception as e
				System.out.println(e.getMessage());//if error print out e
			}
		}
	}


}

