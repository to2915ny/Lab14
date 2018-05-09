package edu.handong.csee.java.lab14.prob5;

import java.util.Scanner;//import class Scanner

public class Prob5 {//public class Prob5
	public static void main(String[] args){//method main
		try{
			Scanner keyboard = new Scanner(System.in);//instantiate Scanner to keyboard
			String str = keyboard.nextLine();//store input to String variable str
			Prob5.myTest(str);//call Prob5's mytest method with parameter str
		} catch(MyException e){//catch MyException as e
			System.out.println("Inside catch block: " + e);//print out "Inside catch block: and e
		}
	}

	static void myTest(String str) throws MyException{//static method myTest throws MyException
		if(str.equals("null")){//if str is null
			throw new MyException("String val is null");//thron new MyException "String val is null"
		}
		else//else
			System.out.println("String val is:" + str);//print out "String val is and value of string
	}
}
