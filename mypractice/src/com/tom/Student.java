package com.tom;

public class Student {
	String name;
	int english;
	int math;
	int java;
	
	public Student(){
	
	}
	
	public Student (String name, int english, int math, int java) {
		this.name = name;
		this.english = english;
		this .math = math;
		this.java = java;
	}
	
	public void print () {
		System.out.println(name + "\t" + english + "\t" + math + "\t" + java);
	}

}
