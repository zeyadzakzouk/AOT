package game.engine.titans;

public class AbnormalTitan extends Titan {
 
	final int TITAN_CODE=2;
	
	AbnormalTitan(int baseHealth,int baseDamage, int heightInMeters, int distanceFromBase,int speed, int resourceValue, int dangerLevel){
		super( baseHealth,baseDamage, heightInMeters, distanceFromBase,speed, resourceValue, dangerLevel);
		
	}
}
