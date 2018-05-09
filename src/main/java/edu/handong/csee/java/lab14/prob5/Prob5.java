package edu.handong.csee.java.lab14.prob5;

import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args){
		try{
			Scanner keyboard = new Scanner(System.in);
			String str = keyboard.nextLine();
			Prob5.myTest(str);
		} catch(MyException e){
			System.out.println("Inside catch block: " + e);
		}
	}

	static void myTest(String str) throws MyException{
		if(str.equals("null")){
			throw new MyException("String val is null");
		}
		else
			System.out.println("String val is:" + str);
	}
}
