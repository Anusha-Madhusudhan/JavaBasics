package com.tekarch.OOPSDay2;

class Area extends Shape{

	@Override
	void RectangleArea(int length, int breadth) {
		System.out.println("RectangleArea = "+ (length*breadth));
	}

	@Override
	void SquareArea(int side) {
		System.out.println("SquareArea = "+ (side*side));
	}

	@Override
	void CircleArea(int radius) {
		System.out.println("CircleArea = "+ (radius*radius*3.14));
	}
	
}

public class Q6_AreaDriverClass {

	public static void main(String[] args) {
		
		Shape shape=new Area();
		
		shape.RectangleArea(5, 4);
		shape.SquareArea(6);
		shape.CircleArea(3);

	}

}
