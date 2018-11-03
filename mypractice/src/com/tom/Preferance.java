package com.tom;

import java.util.Scanner;

public class Preferance {

	public static void main(String[] args) {
		int max = 100, min = 0, i;
        int g;
        //int mid;
        
        g = (int)(Math.random()*100 + 1);    
        System.out.println("answer: ***");    

        while (true) {
            System.out.print("Please input a number: ");
            //catch number
            Scanner rsScanner = new Scanner(System.in);
            i = rsScanner.nextInt();
            System.out.println("u input:" + i);
            
            //mid = (min + max)%2;
            
            if (i == g){
                System.out.println("U got!");
                break;
            }else if (i < g) {
                System.out.println("Too <<<...=.,=");
                System.out.println(i + "~" + max);
                System.out.println("****************");
                min = i;
                //mid = (max + min) % 2;
            }else if (i > g){
                System.out.println("Too >>> >///<");
                System.out.println( min + "~" + i);
                System.out.println("****************");
                max = i;
                //mid = (min + max) %2;
            }
        }
    }

 

}

