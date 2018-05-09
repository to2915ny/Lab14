package edu.handong.csee.java.lab14.prob1;

import java.util.Random;
import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int limit = 0, speed = 0;

		System.out.print("Set the speed limit, officer: ");
		limit = keyboard.nextInt();
		speed = rand.nextInt(101);

		SpeedLimitter lim = new SpeedLimitter(limit, speed);

		lim.warnSpeedLimit();

		keyboard.close();

	}

}

