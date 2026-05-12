package com.linkcode.upcasting;

public class Main {
public static void main(String[] args) {
//	//upcasting=child--->parent
	Puppy puppy=new Puppy();
	puppy.play();
	puppy.bark();
	puppy.sleep();
	Dog dog=puppy;//upcasting=create parent reference and stored child reference into this
	dog.bark();
	dog.sleep();
	Animal animal=dog;//upcasting
	animal.sleep();
	
	//downcasting=parent class--->child class.....used caste operator as class name in which we have to convert
	
//	Animal animal=new Puppy();
//	animal.sleep();
//	Dog dog=(Dog)animal;//downcasting
//	dog.bark();
//	dog.sleep();
//	Puppy puppy=(Puppy)dog;//downcasting
//	puppy.bark();
//	puppy.sleep();
//	puppy.play();
}
}
