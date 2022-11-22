package org.company.italy;

import java.time.LocalDate;
import java.util.Random;

public abstract class Person {
	
	public abstract int getYearIncome();

	private String name;
	private String lastName;
	private LocalDate dob;
	private String companyCode;

	public Person(String name, String lastname, LocalDate dob, String companyCode) {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode( String companyCode) {
		this.companyCode = companyCode;
	}
	
	public String getFullName() {
		return name + lastName + companyCode;
	}

	@Override
	public String toString() {

		return "company code: " + getCompanyCode() + "\nname: " + getName() + "\nlastname: " + getlastName() + "\ndate of birth: "
				+ dob + getFullName();
	}

}
