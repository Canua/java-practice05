package prob6;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	@Override
	protected double getArea() {
		return width * height;
	}

	@Override
	protected double getPerimeter() {
		return (width + height) * 2;
	}

}
