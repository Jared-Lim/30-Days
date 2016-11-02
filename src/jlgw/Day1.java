package jlgw;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

@SuppressWarnings("unused")
public class Day1 {
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
	
		Scanner scan = new Scanner(System.in);
		/* Declare second integer, double, and String variables. */
		int scanint;
		double scandouble;
		String scanstring;
		/* Read and save an integer, double, and String to your variables.*/
		scanint=scan.nextInt();
		scandouble=scan.nextDouble();
		scan.nextLine();
		scanstring=scan.nextLine();
		/* Print the sum of both integer variables on a new line. */
		System.out.println(i+scanint);
		/* Print the sum of the double variables on a new line. */
		System.out.println(d+scandouble);
		/* Concatenate and print the String variables on a new line; 
			the 's' variable above should be printed first. */
		System.out.println(s + scanstring);
		scan.close();
	}
}
