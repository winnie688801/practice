package com.tom;

public class Person {
	float height;
	float weight;
	
	public Person(float weight , float height) {
		this.weight = weight;
		this.height = height;
	}
	
	public void Hello() {
		System.out.println("Hello, you silly boy!");
	}
	
	public float bmi(){
		float bmi = weight / (height * height);
		return bmi;
	}
		

	}


