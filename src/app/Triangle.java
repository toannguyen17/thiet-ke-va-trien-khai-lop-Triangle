package app;

public class Triangle implements Shape {
	private double side1;
	private double side2;
	private double side3;

	public Triangle(){
		side1 = 1.0f;
		side2 = 1.0f;
		side3 = 1.0f;
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/**
	 * @return the side1
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * @param side1 the side1 to set
	 */
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	/**
	 * @return the side2
	 */
	public double getSide2() {
		return side2;
	}
	/**
	 * @param side2 the side2 to set
	 */
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	/**
	 * @return the side3
	 */
	public double getSide3() {
		return side3;
	}
	/**
	 * @param side3 the side3 to set
	 */
	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getArea() {
		double p  = getPerimeter() / 2;
		double hA = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		hA        = 2 * (hA / side1);
		double area = (side2*hA)/2;
		return area;
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public String toString() {
		return "side1: " + side1 + ", side2: " + side2 + ", side1: " + side3;
	}
}
