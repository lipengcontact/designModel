/**
 * 
 */
package com.cal.factoryMethod;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("请输入数字A");
			double numberA = scanner.nextDouble();
			System.out.println("请输入数字B");
			double numberB = scanner.nextDouble();
			
			Operation ope = FactoryAdd.createOperation(numberA, numberB);
			System.out.println("a:"+ope.getNumberA()+" b:"+ope.getNumberB());
			System.out.println("result:"+ope.getResult());
		} catch (Exception e) {

		}

		scanner.close();

	}

}
