package edu.handong.csee.java.lab14.prob1;

public class SpeedLimitter {//public class SpeedLimitter
	private int speed = 0;//private instance variable int speed set to 0
	private int limit = 0;//private instance variable int limit set to 0
	public SpeedLimitter(int limit, int speed)//constructor SpeedLimitter with parameter int limit and int speed
	{
		this.limit = limit;//put limit from parameter to instance variable limit
		this.speed = speed;//put speed from parameter to instance variable speed
	}

	public void warnSpeedLimit()//public method warnSpeedlimit
	{
		try {//try
			if(this.speed > this.limit)//if speed is bigger than limit
			{
				throw new Exception("Speed Limit " + this.limit + "km exceeded!");//throw new exception with message "Speed Limit +value of lime km exceeded!"
			}
			System.out.println("You are a law abiding citizen!");//if not print out "You are a law abiding citizen!"
		}catch(Exception e) {//catch throw statement and declare Exception class e
			System.out.println(e.getMessage());//print out the message from Exception e class
			System.out.println("You are being fined. ");//print out "You are being fined"
		}
		System.out.println("Your current speed: " + this.speed);//print out "Your current speed +the value of variable speed
	}
}