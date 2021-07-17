package com.ejercicio.zoo;

public class Mammal {
	private Integer energyLevel = 100;
	

	public void displayEnergy() {
	System.out.println(energyLevel );
	
	}


	public Integer getEnergyLevel() {
		return energyLevel;
	}


	public void setEnergyLevel(Integer energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	public void disminuirLevel(int num) {
		this.energyLevel = this.energyLevel -num;
		 
	}
	public void aumentaEnergia(int num) {
		this.energyLevel = this.energyLevel + num;
		
	} 
	

}
