package org.imanol.openathon1.payroll;

public class OrderNotFoundException extends RuntimeException {
	OrderNotFoundException(Long id){
		super("Could not find order " + id);
	}
}
