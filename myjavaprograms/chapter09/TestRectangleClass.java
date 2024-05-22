package chapter09;

public class TestRectangleClass {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4.0, 40.0);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		System.out.println("The area and perimeter of the first rectangle are " + rectangle1.getArea() +
				" and " + rectangle1.getPerimeter());
		System.out.println("The area and perimeter of the first rectangle are " +
				(int) (rectangle2.getArea() * 100.0) / 100.0 + " and " + rectangle2.getPerimeter());
	}
}
