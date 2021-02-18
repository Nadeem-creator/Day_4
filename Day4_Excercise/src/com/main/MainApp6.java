/**
 * @author Nadeem
 *
 * 
 */

package com.main;

import com.model.A;
import com.model.B;
import com.model.C;

public class MainApp6 {

	static int a = 555;

	public static void main(String[] args) {
		A objA = new A();
		B objB1 = new B();
		A objB2 = new B();
		C objC1 = new C();
		B objC2 = new C();
		A objC3 = new C();
		objA.display();
		objB1.display();
		objB2.display();
		objC1.display();
		objC2.display();
		objC3.display();
		
		objA = null;
		objB1 = null;
		objB2 = null;
		objC1 = null;
		objC2 = null;
		objC3 = null;
	}

}
