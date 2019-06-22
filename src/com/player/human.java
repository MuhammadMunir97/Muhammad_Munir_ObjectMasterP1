package com.player;

public class human {
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	protected int health = 100;
	public void attack(human enemy) {
		enemy.health -= strength;
	}
	public int returnHealth() {	return health;	}
	public int returnStrength() { return strength;	}
	public int returnIntelligence() {	return intelligence;	}
	public int returnStealth() {	return stealth;	}
}
