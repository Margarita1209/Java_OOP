package com.zoo2;

import com.ejercicio.zoo.Mammal;

public class Bat extends Mammal {

	public Bat() {
		super();		
	}
	public void fly() {
		super.disminuirLevel(50);
		
	}
	public void eatHumans() {
		super.aumentaEnergia(25);
		
	}
	public void attackTown() {
		super.disminuirLevel(100);
		
	}
	

}

