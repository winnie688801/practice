package com.tom;

import java.util.Scanner;

public class SignUp {
	public static void main (String []args) {
		System.out.println("Are you 18 years old?(y/N)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println("*"+ line +"*");
		boolean adult = line.toUpperCase().equals("Y");
		System.out.println(adult);
		
		if (adult) {
			System.out.println("How old are you?");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("What is your name?");
			String name = scanner.nextLine();
			System.out.println("What is your nickname?");
			String nickname = scanner.nextLine();
			System.out.println("Your informatoin is:" + age + "," + name + "," + nickname);	
		}
		else {
			System.out.println("�A�Ӥp����,����18�Q�F��?�^�a�m�m�a");
		}
	}
	

}
