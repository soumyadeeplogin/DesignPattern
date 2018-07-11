public class Substract extends Calculator{
	
	public Substract(double a, double b){
		super();
		
		operation = new OperationSubstract();
		setResult(operation.doOperation(a,b));
	}
}