package org.company.italy;

import java.time.LocalDate;

public class Employee extends Person {

	private int salary;
	private int monthlyCount;

	public Employee(String name, String lastname, LocalDate dob, String companyCode, int salary, int monthlyCount) {
		super(name, lastname, dob, companyCode);

		setMonthlyCount(monthlyCount);
		setSalary(salary);

	}

	@Override
	public int getYearIncome() {

		return salary * monthlyCount;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getMonthlyCount() {
		return monthlyCount;
	}

	public void setMonthlyCount(int monthlyCount) {
		this.monthlyCount = monthlyCount;
	}

	@Override
	public String toString() {

		return super.toString() + "\nSalary: " + getSalary() + "\nmonthly Count: " + getMonthlyCount() + "\nyear Income: "
				+ getYearIncome();
	}
}