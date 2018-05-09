package edu.handong.csee.java.lab14.prob3;

public class Powercalc {//public class Powercalc
	public long power(int n, int p) throws Exception//public method power with parameter int n and int p which returns long value
	{//throws exception
		long result = 0;//long variable result set to zero

		result = (long)Math.pow(n, p);//put long value of power(n,p) to result
		if(n < 0 || p < 0) //if n less than 0 or p less than 0
		{
			throw new Exception("n or p should not be negative.");//throw new Exception "n or p should not be negative."
		}
		if(n == 0 && p == 0)//if n is 0 and p is 0
		{
			throw new Exception("n and p should not be zero.");//thro new Exception "n and p should not be zero."
		}
		return result;//else return result
	}
}
