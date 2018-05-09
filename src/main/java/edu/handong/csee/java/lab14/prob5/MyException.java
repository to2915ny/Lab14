package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception{//public class MyException which inherits Exception
	private String message = null;//private instance variable String message

	public MyException() {//public constructor MyException
		super();//call super class constructor
	}

	public MyException(String message) {//public constructor with parameter message
		super(message);//call super class constructor with message given
		this.message = message;//put message into instance variable message
	}

	public MyException(Throwable cause) {//public constructor with class Throwable
		super(cause);//call super class	with cause given
	}

	public String toString() {//method toString which returns String value
		return message;//return message
	}
}
