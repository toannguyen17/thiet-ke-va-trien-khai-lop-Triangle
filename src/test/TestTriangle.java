package test;

import app.Triangle;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(9.0, 9.0, 9.0);
		System.out.println(triangle.toString());
		System.out.println(triangle.getArea());
		System.out.println(triangle.getPerimeter());
	}
}
