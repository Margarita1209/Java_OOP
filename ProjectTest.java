
public class ProjectTest {

	public static void main(String[] args) {
		Project p1 = new Project();
		p1.setName("Nombre de proyecto");
		p1.setDescription("Descrpcion del Proyecto");
		System.out.println(p1.ElevatorPitch());
		System.out.println(p1.getName());
		System.out.println(p1.getDescription());
		
		
		Project p2 = new Project("Nombre proyecto");
		p2.setDescription("Descrpcion");
		System.out.println(p2.ElevatorPitch());
		System.out.println(p2.getName());
		System.out.println(p2.getDescription());
		
		Project p3 = new Project("Corfo", "Super Proyecto");
		System.out.println(p3.ElevatorPitch());
		System.out.println(p3.getName());
		System.out.println(p3.getDescription());

 }
}