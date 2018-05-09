package edu.handong.csee.java.lab14.prob1;

import java.util.Random;//import class Random
import java.util.Scanner;//import class Scanner

public class Prob1 {//public class Prob1
	public static void main(String[] args) {//public method main
		Scanner keyboard = new Scanner(System.in); // instantiate Scanner to keyboard
		Random rand = new Random(); //instantiate Randome to rand
		int limit = 0, speed = 0;//local int variable limit and speed set to 0

		System.out.print("Set the speed limit, officer: ");//print out "Set the speed limit, officer"
		limit = keyboard.nextInt();//store keyboard integer value input to limt
		speed = rand.nextInt(101);//put random number within range of 101 to speed

		SpeedLimitter lim = new SpeedLimitter(limit, speed);//instantiate SpeedLimitter to lim and pass on variable limit and speed

		lim.warnSpeedLimit();// call lim's warnSpeedLimit method

		keyboard.close();//close instance keyboard

	}

}

