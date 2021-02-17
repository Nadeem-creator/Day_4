/**
 * @author Nadeem
 *
 * 
 */

package com.main;

import java.util.Scanner;

import com.model.Circle;
import com.model.Rectangle;
import com.model.Square;

public class ShapeMainApp {
	public static void main(String[] args) {

		Circle circle;
		Rectangle rectangle;
		Square square;

		System.out.println("Enter any of the following shapes :");
		System.out.println("Circle,Square,Rectangle");

		Scanner in = new Scanner(System.in);
		String uInput = in.next();

		if (uInput.toLowerCase().equals("Circle".toLowerCase())) {
			System.out.print("Enter the radius value : ");
			int uRadius = in.nextInt();
			circle = new Circle(uInput, uRadius);
			System.out.println(String.format("%.2f", circle.calculateArea()));
		}
		if (uInput.toLowerCase().equals("Square".toLowerCase())) {
			System.out.print("Enter the side length value : ");
			int uLength = in.nextInt();
			square = new Square(uInput, uLength);
			System.out.println(String.format("%.2f", square.calculateArea()));
		}
		if (uInput.toLowerCase().equals("Rectangle".toLowerCase())) {
			System.out.print("Enter the length value : ");
			int uLengthRect = in.nextInt();
			System.out.print("Enter the breadth value : ");
			int uBreadthRect = in.nextInt();
			rectangle = new Rectangle(uInput, uLengthRect, uBreadthRect);
			System.out.println(String.format("%.2f", rectangle.calculateArea()));
		}

		in.close();

		//
		circle = null;
		square = null;
		rectangle = null;

	}
}
