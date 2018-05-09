package edu.handong.csee.java.lab14.prob4;

public class Boundary {//public class Boundary
	private static int [] arr = new int[5];//instance variable private static int array to arr[5]
	private static int cnt = 0;//set private static instance variable int cnt to zero
	public void receive(int num) throws ArrayIndexOutOfBoundsException//public method receive with parameter int num throws ArrayIndeOutofBoundsException
	{
		int i = cnt;//variable int i =cnt
		arr[i] = num;//put int num to array[i]
		cnt++;//increment cnt 
		System.out.printf("arr[%d] <- %d\n", i, num);//print out "arr[%d] <- %d\n", i, num
	}
}
