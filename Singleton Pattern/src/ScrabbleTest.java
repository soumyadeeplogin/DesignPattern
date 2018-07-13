import java.util.LinkedList;

public class ScrabbleTest {
	public static void main(String[] args) {
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("instance id :: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("player 1 : " + playerOneTiles);
		
		System.out.println(newInstance.getLetterList());
		
		Singleton newInstancetwo = Singleton.getInstance();
		
		System.out.println("instance id :: " + System.identityHashCode(newInstancetwo));
		
		System.out.println(newInstancetwo.getLetterList());
		
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		
		System.out.println("player 1 : " + playerTwoTiles);
		
		
	}
}
