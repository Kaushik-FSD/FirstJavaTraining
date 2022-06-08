package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shape;

public class Rectangle extends Shape{
	
	float length;
	float breadth;
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
//	public float peri() {
//		return 2 * (length + breadth);
//	}
//	
//	public float area() {
//		
//	}

	@Override
	public float findArea() {
		// TODO Auto-generated method stub
		return 2 * (length + breadth);
	}

	@Override
	public float findPerimeter() {
		// TODO Auto-generated method stub
		return length*breadth;
	}
	
}
