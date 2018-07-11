public class Multiply extends Calculator{
	
	public Multiply(double a, double b){
		super();
		
		operation = new OperationMultiply();
		setResult(operation.doOperation(a,b));
	}
}