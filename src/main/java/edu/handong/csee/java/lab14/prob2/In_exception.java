package edu.handong.csee.java.lab14.prob2;
import java.util.*;//import all class from package java.util

public class In_exception {//public class In_exception
	private int x = 0, y = 0;//private instance variable int x and y set to zero

	public In_exception()//constructor In_exception not necessary though
	{}//void 
	public void error_det() {//public method error_det()

		try{//try
			Scanner keyboard = new Scanner(System.in);//instantiate Scanner to keyboard
			System.out.print("x: "); //print out "x: "
			x = keyboard.nextInt();//store integer input from keyboard
			System.out.print("y: ");//print out "y:  "
			y = keyboard.nextInt();//store integer input from keyboard
			System.out.println(this.x/this.y);//print out x divided by y
		}
		catch(ArithmeticException e){//catch ArithmeticException and declare as  e
			System.out.println("java.lang.ArithmeticException: " + e.getMessage());//print out "java.lang.ArithmeticException: " and the message from method getMessage from e
		}
		catch(InputMismatchException e){//catch InputmismatchException and declare as e
			System.out.println("java.util.InputMismatchException");//print out "java.util.InputMismatchException"
		}
		catch(Exception e) {//while trying other error rather than Arithmetic or Inputmismatch occurs
			System.out.println("Some other exception has occurred: " + e.getMessage());//print out "Some other exception has occurred"
		}
	}
}

