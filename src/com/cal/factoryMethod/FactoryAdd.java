/**
 * 
 */
package com.cal.factoryMethod;

/**
 * @author Administrator
 *
 */
public class FactoryAdd implements Factory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cal.factoryMethod.Factory#createOperation()
	 */
	public static Operation createOperation() {
		Operation ope = new OperationAdd();
		return ope;
	}

	
	public static Operation createOperation(double numberA, double numberB) {
		Operation ope = new OperationAdd(numberA, numberB);
		return ope;
	}

}
