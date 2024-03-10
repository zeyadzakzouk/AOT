package game.engine.weapons;

public class VolleySpreadCannon extends Weapon {

	private int WEAPON_CODE=3;
	int minRange;
	int maxRange;
	
	VolleySpreadCannon(int baseDamage, int minrange, int maxRange){
		super(baseDamage);
		this.minRange=minRange;
		this.maxRange=maxRange;
		
	}
}
