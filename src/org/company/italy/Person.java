package org.company.italy;

import java.time.LocalDate;
import java.util.Random;

public abstract class Person {

	private String name;
	private String lastName;
	private LocalDate dob;
	private String companyCode;

	public abstract int getYearIncome();

	public Person(String name, String lastName, LocalDate dob) {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void getCompanyCode() {
		Random rnd = new Random();
		int rndValue = rnd.nextInt(95324, 1245869);
		String value = String.valueOf(rndValue);
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getFullName() {
		return name + lastName + companyCode;

	}

	@Override
	public String toString() {

		return getFullName() + "date of birth: " + getDob();
	}

}
