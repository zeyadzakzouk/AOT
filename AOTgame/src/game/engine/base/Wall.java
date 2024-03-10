package game.engine.base;

public class Wall {

	int baseHealth;
	int currentHealth;
	
	Wall(int baseHealth){
		this.baseHealth=baseHealth;
		currentHealth=baseHealth;
		
	}
	public int getbaseHealth() {
		return baseHealth;
	}
	public int getcurrentHealth() {
		return currentHealth;
	}
	public void setcurrentHealth() {
		this.currentHealth = currentHealth;
	}
}
