package game.engine.titans;

public class PureTitan extends Titan {
	final int TITAN_CODE=1;	
	
	PureTitan(int baseHealth,int baseDamage, int heightInMeters, int distanceFromBase,int speed, int resourceValue, int dangerLevel){
		super( baseHealth,baseDamage, heightInMeters, distanceFromBase,speed, resourceValue, dangerLevel);
		
	}
}
