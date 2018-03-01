package com.cal.factoryMethod;

public class OperationAdd extends Operation {
	public OperationAdd() {
		super();
	}

	public OperationAdd(double numberA, double numberB) {
		super(numberA, numberB);

	}

	@Override
	public double getResult() {
		return this.getNumberA() + this.getNumberB();
	}

	@Override
	protected double getResult(double numberA, double numberB) {
		this.setNumberA(numberA);
		this.setNumberB(numberB);
		return this.getResult();
	}

}
