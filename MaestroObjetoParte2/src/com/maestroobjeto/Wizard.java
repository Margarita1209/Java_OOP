package com.maestroobjeto;

public class Wizard extends Human{
	int healt = 50;
	int intelligence = 8;
	public void heal(Object Human) {
		this.health = this.health + intelligence;
		System.out.print("El Human aumentó su vida en: " + this.health + " Gracias a la sanación de Wizard. " + '\n');
	}
	public void fireBall(Object Human) {
		this.health = this.health - (intelligence*3);
		System.out.print("El Human disminuyó su vida a: " + this.health + " Por el ataque de bola de fuego de Wizard." + '\n' );
	}

}
