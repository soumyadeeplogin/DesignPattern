public class ObserverPatternDemo {
	
	public static void main(String[] args) {
		
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		
		System.out.println("State Change :: 15");
		subject.setState(15);
		System.out.println("State Change :: 10");
		subject.setState(10);
		
		Subject subjectbinaryObserver = new Subject(); 
		new BinaryObserver(subjectbinaryObserver);
		subjectbinaryObserver.setState(1010);
		
	}
}
