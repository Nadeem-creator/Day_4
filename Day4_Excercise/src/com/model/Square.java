package com.model;

public class Square extends Shape {

	private int side;

	public Square() {
		super();
	}

	public Square(String name, int side) {
		super(name);
		this.side = side;
	}

	@Override
	public float calculateArea() {
		return this.side * this.side;
	}

}
