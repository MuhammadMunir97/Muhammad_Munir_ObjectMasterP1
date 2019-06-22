package com.player;

public class humanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human Human1 = new human();
		human Human2 = new human();
		Human1.attack(Human2);
		System.out.println("the damaged health is: " + Human2.returnHealth());
	}

}
