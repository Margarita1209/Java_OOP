package com.maestroobjeto;

public class Ninja extends Human{
	int stealth = 10;
	public void steal(Object Human) {
		this.health = this.health - stealth;
		stealth = stealth +  stealth;
		System.out.print("Has robado vida de Human y tu vida ahora es de: " + stealth + ". "+ '\n');
	}
	public void runAway() {
		stealth = stealth - 10;
		System.out.print("Has corrido y perdido 10 de vida, tu vida ahora es de: " + stealth + ". "+ '\n');
	}

}
