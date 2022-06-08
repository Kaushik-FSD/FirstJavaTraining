package com.abc.geometry;

import com.abc.geometry.entities.Shape;

//import com.globalpayex.geometry.entities.Square;

//it is a seperate co.
public class ShapeStatistics {
	
	public static void print(Shape shape) {
		
		//For only square
		System.out.println("**********STATISTICS*********");
		System.out.println(String.format("Area is %s", shape.findArea()));
		System.out.println(String.format("Perimeter is %s", shape.findPerimeter()));
		System.out.println("**********STATISTICS*********");
		
		//we can overload to remove the error but its not feasible for large requirements
		
	}
}
