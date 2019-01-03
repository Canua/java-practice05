package prob6;

public class RectTriangle extends Shape implements Resizable {
	private double width;
	private double height;

	public RectTriangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	@Override
	public void resize(double s) {
		width = width * s;
	}

	@Override
	protected double getArea() {
		return width * height / 2;
	}

	@Override
	protected double getPerimeter() {
		return width + height + Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
	}

}
