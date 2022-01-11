package jy.com.ec.edu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante estud1=new Estudiante();
		estud1.llenarDatos("jess", "yan");
		System.out.println(estud1.getNombre());
		Estudiante estud2=new Estudiante();
		estud2.llenarDatos("pedr", "lin");
		System.out.println(estud2.getNombre());
		Estudiante estu3=estud2;//crea una copia de estu2 (referencia en memoria stack)
		System.out.println("************");
		System.out.println("estu3: "+estu3.getNombre()+"    estu2: "+estud2.getNombre());
	}

}
