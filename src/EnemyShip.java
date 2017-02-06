
public abstract class EnemyShip {
	
	private String name;
	private double amtDamage;
	
	public String getname(){
		return name;
	}
	public void setname(String newName){
		name = newName;
	}
	public double getDamage(){
		return amtDamage;
	}
	public void setdamage(double newDamage){
		amtDamage = newDamage;
	}
	public void followHeroShip(){
		System.out.println(getname()+" is following the hero");
	}
	public void displayEnemyShip(){
		System.out.println(getname()+" is on the screen");
	}
	public void enemyShipShoots(){
		System.out.println(getname()+" attackes and does "+ getDamage());
	}
	
}
