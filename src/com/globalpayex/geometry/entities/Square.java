package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shape;

public class Square extends Shape{
	float side;

	public Square(float side) {
		super();
		this.side = side;
	}
	
	public float findPerimeter() {
		return 4*side;
	}
	
	public float findArea() {
		return side*side;
	}
}
