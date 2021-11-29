package Lab;

import java.util.Scanner;
 

public class Lab1 {

	public static void main(String[] args) 
	{
		//Question 1
		
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.println("Enter a number");
		in = new Scanner(System.in);
		int num2 = in.nextInt();
		System.out.println("Enter a number");
		in = new Scanner(System.in);
		int num3 = in.nextInt();
		System.out.println("The greatest number is " + max3(num1,num2,num3));
		
		//Question 2
		
		System.out.println("The smallest number is " + min3(num1,num2,num3));
		
		//Question 3
		
		System.out.println("The middle number is " + middle3(num1,num2,num3));
		
		//Question 4
		
		System.out.println("Enter t for true or f for false");
		in = new Scanner(System.in);
		String entry1 = in.next();
		System.out.println("Enter t for true or f for false");
		in = new Scanner(System.in);
		String entry2 = in.next();
		System.out.println("Answer " + xor(entry1,entry2));
		
		//Question 5
		
		System.out.println("Enter a number (Factor)");
		in = new Scanner(System.in);
		num1 = in.nextInt();
		System.out.println("Enter a number (Factor)");
		in = new Scanner(System.in);
		num2 = in.nextInt();
		System.out.println("Is " + num1 + " a factor of " + num2 + "? Answer: " + isFactor(num1,num2));
		
		//Question 6
		System.out.println("Enter a number (Perfect)");
		in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println("Is " + num + " a perfect number? "+ "Answer : " + isPerfect(num));
		
		//Question 7
		System.out.println("Enter a number (Prime)");
		in = new Scanner(System.in);
		num = in.nextInt();
		System.out.println("Is " + num + " a Prime number? "+ "Answer : " + isPrime(num));
	}
	public static int max3(int num1, int num2, int num3)
	{
		int max = num1;
		
		if(num2 >= max)
		{
			max = num2;
		}
		if(num3 >= max)
		{
			max = num3;
		}
		return max;
	}
	
	public static int min3(int num1, int num2, int num3)
	{
		int min = num1;
		
		if(num2 <= min)
		{
			min = num2;
		}
		if(num3 <= min)
		{
			min = num3;
		}
		return min;
	}
	
	public static int middle3(int num1, int num2, int num3)
	{
		int max = max3(num1,num2,num3);
		int min = min3(num1,num2,num3);
		int middle = num1 + num2 + num3 - max - min;
		return middle;
	}
	
	public static boolean xor(String entry1, String entry2)
	{
		boolean b1 = true;
		boolean b2 = true;
		
		if(entry1.equals("t") || entry1.equals("T"))
		{
			b1 = true;
		}
		if(entry1.equals("f") || entry1.equals("F"))
		{
			b1 = false;
		}
		if(entry2.equals("t") || entry2.equals("T"))
		{
			b2 = true;
		}
		if(entry2.equals("f") || entry2.equals("F"))
		{
			b2 = false;
		}
		
		if(b1 ^ b2)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isFactor(int k, int n) 
	{
		if(n % k == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPerfect(int n)
	{
		int addedFactors = 0;
		for(int i = 1; i < n; i++)
		{
			if(isFactor(i,n))
			{
				addedFactors += i;
			}
		}
		if(addedFactors == n)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(int n)
	{
		boolean b1 = false;
		for(int i = 2; i < n; i++)
		{
			if(isFactor(i,n))
			{
				b1 = false;
				break;
			}
			else
			{
				b1 = true;
			}
		}
		return b1;
	}
}
