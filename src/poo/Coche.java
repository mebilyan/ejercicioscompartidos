package poo;

public class Coche {
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	
	// el metodo contructor es el siguiente
	
	public Coche() {
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		peso_plataforma=500;
	}
	
	
	public String dime_datos_generales() {  // estructura del metodo getter
		
		return "La plataforma del veiculo tiene "+ruedas+" ruedas."+"Mide "
		+largo/1000+" metros con un ancho "+ancho+" cm y con un peso de plataforma de "
		+peso_plataforma+" Kg"; 
	}
	
	public void establece_color(String color_coche) { // estructura del metodo setter
		
		color=color_coche;
	}
	public String dime_color() {
		
		return "el color del coche es "+ color;
		
		
	}
	
	public void configura_asitentos(String asientos_cuero) { //setter
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			
			this.asientos_cuero=true;
			
		
			}else{
				
			this.asientos_cuero=false;
				
		}
	}
	
	public String dime_asientos() { //Getter
		
		if(asientos_cuero==true) {
					
			return "El coche tiene asientos de cuero ";

		}else {
			
			return "El coche tiene asientos de serie ";
		}
		
	}
	
	public void configurar_climatizador(String climatizador) { //setter
		
		if(climatizador.equalsIgnoreCase("si")) {
			
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador() { //getter
		
		if(climatizador==true) {
			
			return "El coche incorpora climatizador";
		}else {
			
			return "El coche lleva aire acondicionado";
			
		}
	}
	
	public String dime_peso_coche() { //setter y getter
		
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true) {
			
			peso_total=peso_total+50;
		}
		
		if(climatizador==true) {
			
			peso_total=peso_total+20;
		}
		
		return "El peso del coche es "+peso_total;
	}
	
	public int precio_coche() {  /* esto es solo un metodo GETTER por que no que estamos cojiendo ninguna 
		variable de clase y cambiando su valor
		*/
		
		int precio_final=10000;
		
		if(asientos_cuero==true) {
			
			precio_final+=2000;
			
		}
		if(climatizador==true) {
			
			precio_final+=1500;
		}
		
		return precio_final;
	}

}
