package com.tom;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int secret = random.nextInt(100)+1;
		System.out.println(secret);
		System.out.println("1 to 100 ");
	
		while(true) {
			System.out.println("Please guess a number");
			int i = scanner.nextInt();
			
			if (i>secret) {
				max = i;
				System.out.println("The secret number is between " + min + " to " + i);
			}
				
			else if (i<secret) {
				min = i;
				System.out.println("The secret number is between " + i + " to " + max);
			}
			
			else if (i==secret) {
				System.out.println("Congratulations! You got the right number!");
				break;
			}
			
		}
			
		

	}

}
