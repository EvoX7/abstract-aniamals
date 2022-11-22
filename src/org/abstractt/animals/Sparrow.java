package org.abstractt.animals;

public class Sparrow extends Animal {

	public Sparrow(String name) {
		super(name);
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeps:ZzZ");

	}

	@Override
	public void verse() {
		System.out.println("the sparrow: tweets");

	}

	@Override
	public void eat() {
		System.out.println("the sparrow eats: corn, oats, wheat");

	}

}