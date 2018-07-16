
public class FactoryProducer {
	
	public AbstractFactory getFactory(String factoryType){
		
		if(factoryType.equalsIgnoreCase("shape"))
			return new ShapeFactory();
		else if(factoryType.equalsIgnoreCase("color"))
			return new ColorFactory();
		return null;
	}

}
