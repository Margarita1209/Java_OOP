package com.maestroobjeto;


public class HumanTest {

	public static void main(String[] args) {
		Object Human = null;
		
		Wizard wiz = new Wizard();
		Ninja nin = new Ninja();
		Samurai sam = new Samurai();
		
		wiz.heal(Human);
		wiz.fireBall(Human);
		
		nin.steal(Human);
		nin.runAway();
		
		sam.deathBlow(Human);
		sam.meditate();
		sam.howMany();
	}

}
