package game.engine.titans;

public class ColossalTitan extends Titan {

	final int TITAN_CODE=4;
	
	ColossalTitan(int baseHealth,int baseDamage, int heightInMeters, int distanceFromBase,int speed, int resourceValue, int dangerLevel){
		super( baseHealth,baseDamage, heightInMeters, distanceFromBase,speed, resourceValue, dangerLevel);
		
	}
}
