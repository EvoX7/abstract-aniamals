package org.abstractt.animals;

public class Dog extends Animal implements INuotante {

	public Dog(String name) {
		super(name);

	}

	@Override
	public void verse() {
		System.out.println("the dog barks: woof woof");

	}

	@Override
	public void eat() {
		System.out.println("the dog eats: meat/kibbles");

	}

	@Override
	public void swim() {
		System.out.println("\nI am swimming!!");

	}

}