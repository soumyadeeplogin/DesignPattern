public class ShapeFactory {
	public Shape getShape(String shapeType) {
		Shape shape = null;
		if(shapeType.equalsIgnoreCase("circle"))
			shape = new Circle();
		else if(shapeType.equalsIgnoreCase("square"))
			shape = new Square();
		else if(shapeType.equalsIgnoreCase("rectangle"))
			shape = new Rectangle();
		return shape;
	}
}
