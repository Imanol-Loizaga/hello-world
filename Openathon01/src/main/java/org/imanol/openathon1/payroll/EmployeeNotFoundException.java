package org.imanol.openathon1.payroll;

public class EmployeeNotFoundException extends RuntimeException {
	EmployeeNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
