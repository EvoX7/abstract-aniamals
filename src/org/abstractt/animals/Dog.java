package org.abstractt.animals;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeps:ZzZ");
		
	}

	@Override
	public void verse() {
		System.out.println("the dog barks: woof woof");
		
	}

	@Override
	public void eat() {
		System.out.println("the dog eats meat/kibbles");
		
	}
	
	

}