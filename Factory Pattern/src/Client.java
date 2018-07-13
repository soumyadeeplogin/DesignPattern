import java.util.Scanner;
public class Client {
	
	
	public static void main(String[] args) {
		EnemyShip enemyShip = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert type of ship U/B/R " );
		if(sc.hasNextLine())
		{
			enemyShip = new EnemyShipFactory().makeEnemyShip(sc.nextLine());
		}
		if(enemyShip !=null){
			doStuff(enemyShip);
		} else {
			System.out.print("Next time use U/B/R" );
		}
		sc.close();
	}
	
	private static void doStuff(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}
}
