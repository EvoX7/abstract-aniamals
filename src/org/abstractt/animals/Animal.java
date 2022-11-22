package org.abstractt.animals;

import java.time.LocalDate;

public abstract class Animal {

	public abstract void sleep();

	public abstract void verse();

	public abstract void eat();
	
	private String name;
	
	public Animal (String name) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
