
public class Project {
	//Atributos metodo acceso/Tipo/Nombre
	private String name;
	private String description;
	private Double inicialCost;
	
	//Atributos metodo acceso(publico, private)/Tipo(Integer; String)/Nombre(descriptivo)
	public String ElevatorPitch() {
		
		//incorporacion this. para diferenciar a la clase
		return this.name + ":" + this.description;
	}

	public Project(String name, String description, Double inicialCost) {
		super();
		this.name = name;
		this.description = description;
		this.setInicialCost(inicialCost);
	}

	public Project(String name) {
	//	super();
		this.name = name;
	}

	public Project(String name, String description) {
	//	super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getInicialCost() {
		return inicialCost;
	}

	public void setInicialCost(Double inicialCost) {
		this.inicialCost = inicialCost;
	}
	
}
