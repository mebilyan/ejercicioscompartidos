package poo;

import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Coche Renault=new Coche(); INSTANCIAR UNA CLASE. EJEMPLARIZAR UNA CLASE
		
		/*Coche mi_coche=new Coche();
		
		mi_coche.establece_color(JOptionPane.showInputDialog("Introducce color"));
		
		mi_coche.configura_asitentos(JOptionPane.showInputDialog("¿Tienen asientos de cuero?"));
		
		mi_coche.configurar_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		
		System.out.println(mi_coche.dime_datos_generales());
		
		System.out.println(mi_coche.dime_color());
		
		System.out.println(mi_coche.dime_asientos());
		
		System.out.println(mi_coche.dime_climatizador());
		
		System.out.println(mi_coche.dime_peso_coche());
		
		System.out.println("El precio final del coche es:"+mi_coche.precio_coche()+" pesos.");*/
		
		
		Coche micoche1=new Coche();
		
		micoche1.establece_color("rojo");
		Furgoneta mifurgoneta1=new Furgoneta( 7,580);
		
		mifurgoneta1.establece_color("azul");
		
		mifurgoneta1.configura_asitentos("si");
		
		mifurgoneta1.configurar_climatizador("si");
		
		
		System.out.println(micoche1.dime_datos_generales()+"\n"+micoche1.dime_color());
		
		System.out.println(mifurgoneta1.dime_datos_generales()+"\n"+mifurgoneta1.DimeDatosFurgoneta());
	}

}
