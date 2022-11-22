package org.abstractt.animals;

public class Eagle extends Animal {

	public Eagle(String name) {
		super(name);
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeps:ZzZ");
		
	}

	@Override
	public void verse() {
		System.out.println("the eagle squawks");
		
	}

	@Override
	public void eat() {
		System.out.println("the eagle eats: jackrabbits, rabbits, small animals ");
		
	}
	
	

}