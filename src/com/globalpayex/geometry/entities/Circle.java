package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shape;

public class Circle extends Shape{
	
	float rad;

	public Circle(float rad) {
		super();
		this.rad = rad;
	}

	@Override
	public float findArea() {
		// TODO Auto-generated method stub
		return (float) (Math.PI * rad * rad);
	}

	@Override
	public float findPerimeter() {
		// TODO Auto-generated method stub
		return (float) (Math.PI * 2 * rad);
	}
	
}
