
public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		Color color = null;
		if(colorType.equalsIgnoreCase("red"))
			color = new Red();
		else if(colorType.equalsIgnoreCase("green"))
			color = new Green();
		else if(colorType.equalsIgnoreCase("Blue"))
			color = new Blue();
		return color;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}
}
