import java.util.Scanner;

public class EnemyShipTesting {
	
	public static void main(String[] args){
		
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of ship should it be (U/R/B)");
		if(userInput.hasNextLine()){
			String typeOfShip = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		doStuffEnemy(theEnemy);
	}
	public static void doStuffEnemy(EnemyShip anEnemyShip){
		
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
