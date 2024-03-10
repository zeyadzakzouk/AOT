package game.engine.titans;

public class ArmoredTitan extends Titan {

	final int TITAN_CODE=3;
	
	ArmoredTitan(int baseHealth,int baseDamage, int heightInMeters, int distanceFromBase,int speed, int resourceValue, int dangerLevel){
		super( baseHealth,baseDamage, heightInMeters, distanceFromBase,speed, resourceValue, dangerLevel);
		
	}
}
