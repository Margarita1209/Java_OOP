package com.maestroobjeto;

public class Samurai extends Human{
	int health = 200;
	public void deathBlow(Object Human) {
		this.stealth = 0;
		health = health/2;
		System.out.print("Has asesinado a Human pero has reducido tu vida a: " +  health + ". "+ '\n');
	}
	public void meditate() {
		health = health + (health/2);
		System.out.print("Has meditado y aumentado tu vida a: " +  health + ". "+ '\n');
	}
	public int howMany() {
		System.out.print("La cantidad de vida es de: " + health + ". ");
		return health;
	}

}
