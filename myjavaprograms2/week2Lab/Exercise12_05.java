package week2Lab;

public class Exercise12_05 {
	public static void main(String[] args) throws IllegalTriangleException {
		// Create 2 triangles. One of them obeys the rule ,the other one violates
		TriangleWithException firstTri = new TriangleWithException(12, 13, 14);
		System.out.println("First one works!");
		System.out.println(firstTri.toString());
		TriangleWithException secTri = new TriangleWithException(1, 2, 3);
		System.out.println("Second one doesn't work!");
		System.out.println(secTri.toString());
	}
}

@SuppressWarnings("serial")
class IllegalTriangleException extends Exception {
	// Implement IllegalTriangle Exception
	public IllegalTriangleException() {
		super("Invalid side sizes!");
	}
}

// Name the new Triangle class as TriangleWithException to avoid naming conflict
// with the Triangle class already defined in Programming Exercise 11.1
class TriangleWithException {
	double side1, side2, side3;

	/** Constructor */
	public TriangleWithException(double side1, double side2, double side3) throws IllegalTriangleException {
		try {
			if ((side1 + side2 > side3) &&
					(side2 + side3 > side1) &&
					(side1 + side3 > side2)) {
				this.side1 = side1;
				this.side2 = side2;
				this.side3 = side3;
			} else
				throw new IllegalTriangleException();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/** Implement the getArea method */
	public double getArea() {
		return side1 * side2 * side3;
	}

	// Implement getPerimeter method
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public String toString() {
		// Implement it to return the three sides
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
