import javax.management.RuntimeErrorException;

public interface IOperation {
	double doOperation(double a, double b);
}

class OperationAdd implements IOperation{
	
	@Override
	public double doOperation(double a, double b) {
		return a+b;
	}
	
}

class OperationSubstract implements IOperation{

	@Override
	public double doOperation(double a, double b) {
		return Math.abs(a-b);
	}
	
}

class OperationMultiply implements IOperation {

	@Override
	public double doOperation(double a, double b) {
		return a*b;
	}
	
}

class OperationDivision implements IOperation {

	@Override
	public double doOperation(double a, double b) {
		if(b!=0)
			return a/b;
		else
			throw new RuntimeErrorException(null, "Cannot Divide by Zero");
	}
	
}