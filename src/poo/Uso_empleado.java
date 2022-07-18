package poo;

import java.util.*;

public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*para intaciar una clase lo primero es poner el nombre de la clase acontinuacion el nombre de
		intancia u objeto perteneciente a la clase despues un "=" y luego el operador new eso hace llamar
		directamente al contructor y por ultimo pacer parametos al contructor si es que los requiere*/
		
		/*Empleado empleado1=new Empleado("Paco Gómez",85000,1990,12,17);
		
		Empleado empleado2=new Empleado("Ana López",95000,1995,06,02);
		
		Empleado empleado3=new Empleado("Maria Martín",105000,2002,03,15);
		
		empleado1.Subesueldo(5);
		
		empleado2.Subesueldo(5);
		
		empleado3.Subesueldo(5);
		
		
		System.out.println("Nombre: "+empleado1.dameNombre()+" Suledo: "+empleado1.dameSueldo()
		           +" fecha de alta: "+empleado1.dameFechaContrato());
		
		System.out.println("Nombre: "+empleado2.dameNombre()+" Suledo: "+empleado2.dameSueldo()
        +" fecha de alta: "+empleado2.dameFechaContrato());
		
		System.out.println("Nombre: "+empleado3.dameNombre()+" Suledo: "+empleado3.dameSueldo()
        +" fecha de alta: "+empleado3.dameFechaContrato());*/
		
		
		Jefatura jefe_RRHH=new Jefatura("Brayan", 55000,2006,9,25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Paco Gómez",85000,1990,12,17);
		
		misEmpleados[1]=new Empleado("Ana López",95000,1995,06,02);
		
		misEmpleados[2]=new Empleado("Maria Martín",105000,2002,03,15);
		
		misEmpleados[3]=new Empleado("pancho");
		
		misEmpleados[4]=jefe_RRHH; //polimorfismo en accion. Pricipio de sustitucion
		
		misEmpleados[5]=new Jefatura("Mirian",95000,1999,5,26);
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		
		jefa_Finanzas.estableceIncentivo(55000);
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		
		
		System.out.println("El Jefe "+ jefa_Finanzas.dameNombre()+" tiene un bonus de: "
		+jefa_Finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dameNombre()+" tiene un bonus de: "+
		misEmpleados[3].establece_bonus(200));
		
		//bucle for normal
		
		for(int i=0;i<misEmpleados.length;i++) {
			
			misEmpleados[i].Subesueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e:misEmpleados) { //bucle for mejorado para este se debe crear una variable de la array
			
			System.out.println("Nombre: "+e.dameNombre()
					+" Suledo: "+e.dameSueldo()+" Fecha de alta: "+e.dameFechaContrato());
		}

	}

}

class Empleado implements Comparable, Trabajadores {
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		//gregorianCalendar en el apartado del mes empieza desde 0 tomando a este como enero
		
		nombre=nom;
		sueldo=sue;
		
		GregorianCalendar calendario= new GregorianCalendar(agno,mes-1,dia);
		//getTime este metodo perteneciente a la clase GregorianCalendar lo que hace es devolverme la fecha
		
		altaContrato=calendario.getTime();
		
		Id=Idsiguiente;
		++Idsiguiente;
		
		
		
	}
	
	public double establece_bonus (double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	public Empleado (String nom) {
		
		this(nom,30000,2000,01,01); // el this llama al otro cosntructor
		
	}
	
	public String dameNombre() { //Getter
		return nombre+" Id: "+ Id ;
	}
	
	public double dameSueldo() { //Getter
		
		return sueldo;
	}
	
	public Date dameFechaContrato() { //Getter
		
		return altaContrato;
	}
	

	public void Subesueldo(double porcentaje) { //Setter
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	
	public int compareTo(Object miobjeto) {
		
		Empleado otroEmpleado=(Empleado) miobjeto;
		
		if(this.Id<otroEmpleado.Id) {
			
			return -1;
		}
		
		if(this.Id>otroEmpleado.Id) {
			
			return 1;
		}
		return 0;
	}

	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
    private int Id;
	
	private static int Idsiguiente=1;
}


 class Jefatura extends Empleado implements Jefes{ // colocando final se puede cortar la cadena de la herencia
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom,sue, agno,mes,dia);
	}
	
	
	public String tomar_decisiones(String decision) {
		
		return "Un mienbro de la direcció ha tomado la decisió de:"+decision;
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima; 
	}
	
	public void estableceIncentivo(double b){
		
		incentivo=b;
	}
	
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe+incentivo;
	}
	
	private double incentivo;
}


