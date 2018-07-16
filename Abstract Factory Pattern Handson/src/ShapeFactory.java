
public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		Shape shape = null;
		if(shapeType.equalsIgnoreCase("cirlce"))
			shape = new Circle();
		else if(shapeType.equalsIgnoreCase("rectangle"))
			shape = new Rectangle();
		else if(shapeType.equalsIgnoreCase("square"))
			shape = new Square();
		return shape;
	}
	
	@Override
	public Color getColor(String color){
		return null;
	}
	
}
