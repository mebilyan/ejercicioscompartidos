package poo;

public class Furgoneta extends Coche {  
	/*extends se usa para heredar y seguido la clase de la cual va
	va a heredar esto convierte a furgoneta en una subclase y la clase coche en super clase*/

	
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta (int plazas_extra,int capacidad_carga) {
		
		super(); // llamar al contructor de la clase padre 
		
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	
	public String DimeDatosFurgoneta() {
		
		return "La capacidad de carga es "+capacidad_carga+" Y las plazas extras son "
				+plazas_extra;
	}
}
