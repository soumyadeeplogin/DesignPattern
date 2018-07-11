public class Divide extends Calculator{
	
	public Divide(double a, double b){
		super();
		
		operation = new OperationDivision();
		setResult(operation.doOperation(a,b));
	}
}