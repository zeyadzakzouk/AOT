package game.engine.titans;

import game.engine.interfaces.Attackee;
import game.engine.interfaces.Attacker;
import game.engine.interfaces.Mobil;

public class Titan implements Comparable<Titan>,Attacker,Attackee,Mobil {

	private int baseHealth;
	private int currentHealth;
	private int baseDamage;
	private int heightInMeters;
	private int distanceFromBase;
	private int speed;
	private int resourcesValue;
	private int dangerLevel;
	
	 Titan(int baseHealth,int baseDamage, int heightInMeters, int distanceFromBase,int speed, int resourcesValue, int dangerLevel){
		this.baseHealth=baseHealth;
		currentHealth=baseHealth;
		this.baseDamage=baseDamage;
		this.heightInMeters=heightInMeters;
		this.distanceFromBase=distanceFromBase;
		this.speed=speed;
		this.resourcesValue=resourcesValue;
		this.dangerLevel=dangerLevel;
	}
	public int getbaseHealth() {
		return baseHealth;
		
	}
	public int getcurrentHealth() {
		return currentHealth;
	}
	public void setcurrentHealth(int n) {
		 this.currentHealth = n;
	}
	public int getbaseDamage() {
		return baseDamage;
	}
	public int getheightInMeters() {
		return heightInMeters;
	}
	public int getdistanceFromBase() {
		return distanceFromBase;
	}
	public void setdistanceFromBase(int n) {
		 this.distanceFromBase= n;
	}
	public int getspeed() {
		return speed;
	}
	public void setspeed(int speed) {
		this.speed = speed; 
	}
	public int getresourcesValue() {
		return resourcesValue;
	}
	public int getdangerLevel() {
		return dangerLevel;
	}
	public int compareTo(Titan o) {
		return this.distanceFromBase - o.distanceFromBase;
	}
	public int getDamge() {
		return baseDamage;
	}
	
}
