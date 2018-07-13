
public abstract class EnemyShip {
	private String name;
	private double amtDamage;
	
	public void followHeroShip(){
		System.out.println(getName() + " is following hero Ship");
	}
	
	public void displayEnemyShip(){
		System.out.println("Displaying enemy ship -> " + getName());
	}
	
	public void enemyShipShoots(){
		System.out.println(getName() + "is shooting and gets damages " + getDamage());
	}
	
	public void setDamage(double amtdamage){
		this.amtDamage = amtdamage;
	}
	
	public double getDamage(){
		return amtDamage;
	}
	
	public void setname(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
