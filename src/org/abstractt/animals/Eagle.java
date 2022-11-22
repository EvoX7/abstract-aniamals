package org.abstractt.animals;

public class Eagle extends Animal implements IVolante {

	public Eagle(String name) {
		super(name);
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeps:ZzZ");
		
	}

	@Override
	public void verse() {
		System.out.println("the eagle: squawks");
		
	}

	@Override
	public void eat() {
		System.out.println("the eagle eats: jackrabbits, rabbits, small animals ");
		
	}

	@Override
	public void fly() {
		System.out.println("\nI am flying!!!");
		
	}
	
	

}