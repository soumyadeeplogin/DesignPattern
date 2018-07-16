public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = new FactoryProducer().getFactory("shape");
		Shape shape = shapeFactory.getShape("cirlce");
		shape.draw();
		
		AbstractFactory colorFactory = new FactoryProducer().getFactory("color");
		Color color = colorFactory.getColor("red");
		color.fill();
	}
}
