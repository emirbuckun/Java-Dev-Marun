package chapter09;

public class Rectangle {
	double width, height;

	Rectangle() {
		width = 1;
		height = 1;
	}

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}
}
