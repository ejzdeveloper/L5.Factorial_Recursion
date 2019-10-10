// Author: Jackie Zablah. Java Bootcamp 2019.

package lab5;

import java.util.Scanner;

public class Factorial {
	
	//extended challenge, use recursion to implement the factorial
	public static long recursion(int num) {
		long result;

	       if(num==1)
	         return 1;

	       result = recursion(num-1) * num;
	       return result;
	    }
		
		
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int integer;
		String userChoice = "";
		long factorial;

		System.out.println("Welcome to the Factorial Calculator");

		do {
			System.out.println("<< Enter an integer that's greater than 0 but less than 21 >>");
			integer = scnr.nextInt();

			if (integer >= 0 && integer <= 20) {
				factorial = 1;
				for (int i = 1; i <= integer; i++) {
					factorial *= i;
				}

				System.out.println("The factorial of " + integer + " is " + factorial);
				System.out.println("Using recursion, The factorial of " + integer + " is " + recursion(integer));

			} else {
				System.out.println("<< you must to enter an integer only between 0 and 10 >>");
			}

			System.out.print(">> Would you like to continue (y/n)?");
			userChoice = scnr.next();

			if (userChoice.equalsIgnoreCase("n")) {
				System.out.println(">> Goodbye!");
			}

		} while (userChoice.equalsIgnoreCase("y"));
		scnr.close();

	}
}