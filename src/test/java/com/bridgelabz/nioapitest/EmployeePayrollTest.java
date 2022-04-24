package com.bridgelabz.nioapitest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.employeepayroll.EmployeeData;
import com.bridgelabz.employeepayroll.EmployeePayRollService;

public class EmployeePayrollTest {
	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
		EmployeePayRollService employeePayrollService = new EmployeePayRollService();
		employeePayrollService.addEmployee(new EmployeeData(1, "Jeff Bezos", 10000));
		employeePayrollService.addEmployee(new EmployeeData(2, "Bill Gates", 20000));
		employeePayrollService.addEmployee(new EmployeeData(3, "Mark Z", 30000));
		employeePayrollService.writeEmployeeDataToFile();
		long entries = employeePayrollService.countEntries();
		assertEquals(3, entries);
	}

	@Test
	public void given3EmployeesWhenWrittenToFileShouldPrintEmployeeEntries() {
		EmployeePayRollService employeePayrollService = new EmployeePayRollService();
		employeePayrollService.addEmployee(new EmployeeData(1, "Jeff Bezos", 10000));
		employeePayrollService.addEmployee(new EmployeeData(2, "Bill Gates", 20000));
		employeePayrollService.addEmployee(new EmployeeData(3, "Mark Z", 30000));
		employeePayrollService.writeEmployeeDataToFile();
		employeePayrollService.printData();
		long entries = employeePayrollService.countEntries();
		assertEquals(3, entries);
	}

	@Test
	public void given3EmployeesWhenWrittenToFileShouldPrintNumberOfEmployeeEntries() {
		EmployeePayRollService employeePayrollService = new EmployeePayRollService();
		employeePayrollService.addEmployee(new EmployeeData(1, "Jeff Bezos", 10000));
		employeePayrollService.addEmployee(new EmployeeData(2, "Bill Gates", 20000));
		employeePayrollService.addEmployee(new EmployeeData(3, "Mark Z", 30000));
		employeePayrollService.writeEmployeeDataToFile();
		long entries = employeePayrollService.countEntries();
		System.out.println("Number of entries are " + entries);
		assertEquals(3, entries);
	}
}