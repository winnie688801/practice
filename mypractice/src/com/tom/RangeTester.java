package com.tom;

import java.util.Scanner;

public class RangeTester {
	public static void main (String []args) {
		System.out.println("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
		System.out.println(line >= -5 && line <=10);
		
		
	}
}

