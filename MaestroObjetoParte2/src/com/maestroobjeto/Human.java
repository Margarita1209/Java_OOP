package com.maestroobjeto;

public class Human {
	int strength = 3;
	int stealth = 3;
	int intelligence = 3;
	int health = 100;
	public void attack(Object Human) {
		this.health = this.health - strength;
		System.out.print("El Human fue atacado y su salud disminuyo quedo en: " + this.health);
	}

}
