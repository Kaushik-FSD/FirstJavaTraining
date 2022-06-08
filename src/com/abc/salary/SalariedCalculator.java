package com.abc.salary;

@Deprecated
public class SalariedCalculator {
	public static double calculate (SalariedIndividual si) {
		int noOfDays = si.getNoOfDaysWorked();
		double costPerDay = si.getPricePerDay();
		
		double costWithoutTax = noOfDays * costPerDay;
		int professionalTax = 200;
		double costWithTaxDeducted = costWithoutTax - (0.1 * costWithoutTax);
		
		return costWithTaxDeducted - professionalTax;
	}
}
