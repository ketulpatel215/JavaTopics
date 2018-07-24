package com.javatopics.program001;

public class Child extends Parent {
	
	String color = "black";
	
	void displayColor() {
		System.out.println(super.color);
		System.out.println(color);
	}
}
