package org.company.italy;

import java.time.LocalDate;

public class Boss extends Person {

	private int salary;
	private int bonus;

	public Boss(String name, String lastname, LocalDate dob, String companyCode, int salary, int bonus) {
		super(name, lastname, dob, companyCode);

		setSalary(salary);
		setBonus(bonus);

	}

	@Override
	public int getYearIncome() {

		return salary * 12 + bonus;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {

		return super.toString() + "\nsalary: " + getSalary() + "\nyear bonus: " + getBonus() + "\nyear Income: " + getYearIncome();

	}
}