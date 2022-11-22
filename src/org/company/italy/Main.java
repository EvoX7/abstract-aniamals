package org.company.italy;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		System.out.println("CompanyBoss 1");
		Boss boss1 = new Boss("Jack", "Black", LocalDate.now(), "15463", 3500, 10000);
//		System.out.println(boss1);
		System.out.println("\nCompanyBoss 2");
		Boss boss2 = new Boss("Bryan", "Smith", LocalDate.now(), "14864", 4000, 12500);

		System.out.println("\n------------------------------------");

		System.out.println("Employee 1");
		Employee employee1 = new Employee("Brad", "Doe", LocalDate.now(), "03211", 1500, 12);
		System.out.println("\nEmployee 2");
		Employee employee2 = new Employee("Anna", "Taylor", LocalDate.now(), "04255", 1300, 12);
		System.out.println("\nEmployee 3");
		Employee employee3 = new Employee("Laura", "King", LocalDate.now(), "06214", 1200, 12);

		System.out.println("\n------------------------------------");

		Person[] company = { boss1, boss2, employee1, employee2, employee3 };
		Person[] bossMax = { boss1, boss2 };
		Person[] employeeMin = { employee1, employee2, employee3 };

//		Calculate the max annual income in the company

		int maxYearIncome = Integer.MIN_VALUE;

		Person maxYearIncomePerPerson = null;

		for (int x = 0; x < company.length; x++) {

			Person person = company[x];

			int yearIncome = person.getYearIncome();

			if (maxYearIncome < yearIncome) {
				maxYearIncome = yearIncome;
				maxYearIncomePerPerson = person;
			}
		}

//			Calculate the min annual income in the company

		int minYearIncome = Integer.MAX_VALUE;

		Person minYearIncomePerPerson = null;

		for (int x = 0; x < company.length; x++) {

			Person person = company[x];

			int yearIncome = person.getYearIncome();

			if (minYearIncome > yearIncome) {
				minYearIncome = yearIncome;
				minYearIncomePerPerson = person;
			}

		}
		System.out.println("\nMax annual income in the company: \n" + maxYearIncomePerPerson);
		System.out.println("\nLowest annual income in the company: \n" + minYearIncomePerPerson);

//	      Calculate bosses max annual year income income in the company

		int maxYearIncome2 = Integer.MIN_VALUE;

		Person maxYearIncomeAmongBosses = null;

		for (int x = 0; x < bossMax.length; x++) {

			Person person = bossMax[x];

			int yearIncome = person.getYearIncome();

			if (maxYearIncome < yearIncome) {
				maxYearIncome = yearIncome;
				maxYearIncomeAmongBosses = person;
			}
		}
		System.out.println("\nMax annual income among Bosses: \n" + maxYearIncomeAmongBosses);
		

//		Calculate the min annual income in the company

	int minYearIncome2 = Integer.MAX_VALUE;

	Person minYearIncomeEmployees = null;

	for (int x = 0; x < employeeMin.length; x++) {

		Person person = employeeMin[x];

		int yearIncome = person.getYearIncome();

		if (minYearIncome > yearIncome) {
			minYearIncome = yearIncome;
			minYearIncomeEmployees  = person;
		}

	}
	System.out.println("\nMin annual income among Employees: \n" + minYearIncomeEmployees );

		
	}
}
