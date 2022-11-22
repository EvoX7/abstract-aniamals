package org.abstractt.animals;

public class Dolphin extends Animal implements INuotante{

	public Dolphin(String name) {
		super(name);
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeps(only with half brain active):ZzZ");
		
	}

	@Override
	public void verse() {
		System.out.println("the dolphin: whistles");
		
	}

	@Override
	public void eat() {
		System.out.println("the dolphin eats: variety of fishes, squids, and crustaceans such as shrimps");
		
	}

	@Override
	public void swim() {
		System.out.println("\nI am swimming!!");
		
	}
	
	

}

