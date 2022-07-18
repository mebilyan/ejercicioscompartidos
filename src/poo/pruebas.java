package poo;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1=new Empleados("Paco");
		
		Empleados trabajador2=new Empleados("Ana");
		
		Empleados trabajador3=new Empleados("Antonio");
		
		Empleados trabajador4=new Empleados("Maria");
		
		
		trabajador1.CambiarSeccion("RRHH");
		

		System.out.println(trabajador1.devuelveDatos()+"\n"+trabajador2.devuelveDatos()+
				"\n"+trabajador3.devuelveDatos()+"\n"+trabajador4.devuelveDatos()+"\n"+
				Empleados.dameIdSiguiente());
		

	}

}

class Empleados{
	
	public Empleados(String nom ) { 
		// el contructor se encarga de dar una estado inicial a los objetos
		
		nombre=nom;
		
		seccion="Administracion";
		
		Id=Idsiguiente;
		
		Idsiguiente++;
		
		
		
		
	}
	
	public void CambiarSeccion(String seccion) { //setter
		
		//"this" se utiliza para poder diferenciar lo que es el campo de clase de un argumento de un metodo
		
		this.seccion=seccion;
	}
	

	
	public String devuelveDatos() { //Getter
		
		return "El nombre es: "+nombre+" la seccion es "+ seccion+"y el Id="+Id;
		
		
	}
	
	
	public static String dameIdSiguiente(){ //un metodo static no accede a campos de ejemplar (variables o
		//contantes a menos que estas sean tambien static 
		
		return "El Id siguiente es "+Idsiguiente;
		
	}
	
	private final String nombre;
	
	private String seccion;
	
	private int Id;
	
	private static int Idsiguiente=1;
}