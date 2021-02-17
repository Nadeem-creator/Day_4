/**
 * @author Nadeem
 *
 * 
 */

package com.main;

import java.util.Scanner;

import com.service.MyCalculator;

public class MyCalculatorMainApp {

	public static void main(String[] args) {
		MyCalculator myCalc = new MyCalculator();

		System.out.println("Enter the number: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		System.out.println(myCalc.divisor_sum(num));

		in.close();
	}

}
