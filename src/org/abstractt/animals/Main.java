package org.abstractt.animals;

public class Main {
	public static void main(String[] args) {
		
		
		System.out.println("Dogs: \n");
		Dog dog = new Dog("Dogs"); 
		dog.sleep();
		dog.verse();
		dog.eat();
		
		System.out.println("\n----------------------------\n");
		
		System.out.println("Eagles: \n");
		Eagle eagle = new Eagle("Eagles"); 
		eagle.sleep();
		eagle.verse();
		eagle.eat();
		
		System.out.println("\n----------------------------");
		
		System.out.println("\nSparrows: \n");
		Sparrow sparrow = new Sparrow("Sparrows"); 
		sparrow.sleep();
		sparrow.verse();
		sparrow.eat();
		System.out.println("\n----------------------------");
		
		System.out.println("\nDolphins: \n");
		Dolphin dolphin = new Dolphin("Dolphins"); 
		dolphin.sleep();
		dolphin.verse();
		dolphin.eat();
		System.out.println("\n----------------------------");
	}

}
