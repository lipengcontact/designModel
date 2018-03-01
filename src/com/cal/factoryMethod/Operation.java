package com.cal.factoryMethod;

public abstract class Operation {
	private double numberA;
	private double numberB;

	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}

	public Operation() {
		super();
		this.numberA = 0.0;
		this.numberB = 0.0;
	}

	public Operation(double numberA, double numberB) {
		super();
		this.numberA = numberA;
		this.numberB = numberB;
	}

	protected abstract double getResult();

	protected abstract double getResult(double numberA, double numberB);
}
