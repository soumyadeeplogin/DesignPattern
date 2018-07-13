import java.util.Scanner;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		Shape shape = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("What type of shape? ");
		if(sc.hasNextLine())
		{
			shape = new ShapeFactory().getShape(sc.nextLine());
		}
		sc.close();
		if(shape!=null)
		{
			shape.draw();
		}
	}
}
