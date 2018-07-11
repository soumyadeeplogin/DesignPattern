public class CalculatorTest {
	
	public static void main(String[] args) {
		Calculator calculatorAdd = new Add(10,20);
		Calculator calculatorSub = new Substract(10,20);
		Calculator calculatorMul = new Multiply(10,20);
		Calculator calculatorDiv = new Divide(10,20);
		Calculator calculatorDivZ = null;
		try {
			calculatorDivZ = new Divide(10,0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(calculatorAdd.getResult());
		System.out.println(calculatorSub.getResult());
		System.out.println(calculatorMul.getResult());
		System.out.println(calculatorDiv.getResult());
		if(calculatorDivZ!=null)
			System.out.println(calculatorDivZ.getResult());
		
		
	}
}
