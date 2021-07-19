package com.ejercicio.zoo;

public class Gorilla extends Mammal{
	
	public Gorilla() {
		super();		
	}
	public void throwSomething() {
		super.disminuirLevel(5);
		System.out.println("Lanzando cosas a la gente disminuye la energia 5 puntos");
	}
	
	public void eatBananas() {
		super.aumentaEnergia(10);
		System.out.println("Comiendo babanas aumentas energia 10 puntos");
	
	}
	public void climb() {
		super.disminuirLevel(10);
		System.out.println("Escalando disminuye energia 10 puntos");
		
	}
	

}
