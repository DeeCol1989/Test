package Lab;

import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		//Question 1
		System.out.println("Input radius: ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		circleResults(radius);
		
		//Question 2
		System.out.println("Enter base-width and height of a triangle: ");
		input = new Scanner(System.in);
		double base = input.nextDouble();
		double height = input.nextDouble();
		System.out.println("Triangle Area: " + triangleArea(base,height));
		
		//Question 3
		System.out.println("Enter a number: ");
		input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("Number is " + num + " and it is " + EvenOrOdd(num));
		
		//Question 4
		System.out.println("Enter an integer: ");
		input = new Scanner(System.in);
		num = input.nextInt();
		System.out.println("Formatted number: " + String.format("%,.1f", formatInteger(num)));
		
		//Question 5
		System.out.println("Enter a letter: ");
		input = new Scanner(System.in);
		char entry = input.next().charAt(0);
		System.out.println("ASCII value: " + asciiValue(entry));
		
		//Question 6
		System.out.println("Enter a double: ");
		input = new Scanner(System.in);
		double a1 = input.nextDouble();
		System.out.println("Rounded value: " + round(a1));
		
		//Question 7
		System.out.println("Enter a year: ");
		input = new Scanner(System.in);
		int  year = input.nextInt();
		System.out.println("Leap Year? " + LeapYear(year));
	}
	
	public static void circleResults(double radius) {
		double pi = (double)22/7;
		double circumference = 2 * pi * radius;
		double area = pi * radius * radius;
		
		System.out.println("Circle Circumference : " + String.format("%,.2f", circumference) + "\nCircle Area : " + String.format("%,.2f", area));
	}
	
	public static double triangleArea(double base, double height) {
		double area = ((double)1/2) * base * height;
		return area;
	}
	
	public static String EvenOrOdd(int num) {
		if(num % 2 == 0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}
	
	public static double formatInteger(int num) {
		return (double) num;
	}
	
	public static int asciiValue(char entry) {
		return (int) entry;
	}
	
	public static int round(double num) {
		return (int) Math.round(num);
	}
	
	public static boolean LeapYear(int year) {
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
}

