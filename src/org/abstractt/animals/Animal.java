package org.abstractt.animals;

public abstract class Animal {

	public abstract void verse();

	public abstract void eat();

	public void sleep() {
		System.out.println("sleeps:ZzZ");

	}

	protected String name;

	public Animal(String name) {

		setName(name);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		return getName();
	}

}
