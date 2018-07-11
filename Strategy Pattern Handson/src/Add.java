public class Add extends Calculator{
	
	public Add(double a, double b){
		super();
		
		operation = new OperationAdd();
		setResult(operation.doOperation(a,b));
	}
}