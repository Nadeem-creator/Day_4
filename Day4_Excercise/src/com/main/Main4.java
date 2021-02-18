/**
 * @author Nadeem
 *
 * 
 */

package com.main;

import com.model.Problem4;

public class Main4 {

	public static void main(String[] args) {
		Problem4 objA = new Problem4();
		System.out.println("in main(): ");
		System.out.println("objA.a = " + objA.getA());
		objA.setA(222);
		
		objA=null;
	}

}
