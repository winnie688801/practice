package com.tom;

import java.util.Scanner;

public class RangeTester {
	public static void main (String []args) {
		System.out.println("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
		System.out.println(line >= -5 && line <=10);
		
		
	}
}

