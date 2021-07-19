package com.ejercicio.zoo;

public class Mammal {
	private Integer energyLevel = 100;
	protected Integer energyLevel2 = 300;
	

	public Integer getEnergyLevel2() {
		return energyLevel2;
	}


	public void setEnergyLevel2(Integer energyLevel2) {
		this.energyLevel2 = energyLevel2;
	}


	public void displayEnergy() {
	System.out.println(energyLevel );
	System.out.println(energyLevel2 );
	
	}


	public Integer getEnergyLevel() {
		return energyLevel;
	}


	public void setEnergyLevel(Integer energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	public void disminuirLevel(int num) {
		this.energyLevel = energyLevel -num;
		this.energyLevel2 = energyLevel2 -num;
		 
	}
	public void aumentaEnergia(int num) {
		this.energyLevel = energyLevel + num;
		this.energyLevel2 = energyLevel2 +num;
		
	} 
	public void displayEnergy2() {
		System.out.println(energyLevel2 );
		
		}

}
