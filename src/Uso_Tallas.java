import java.util.*;

public class Uso_Tallas {

	//enum Talla{MINI,MEDIANA,GRANDE,MUY_GRANDE};
	
	enum Talla{
		
		Mini("s"),MEDIANA("M"),GRANDE("L"),MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
			
		}
		
		
		
		public String dameabreviatura() {
			return abreviatura;
		}



		private String abreviatura;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe una talla:MINI,MEDIANA,GRANDE,MUY GRANDE");
		
		String entrada_datos=entrada.next().toUpperCase();// toUpperCase tranforma los textos a mayusculas
		
		Talla la_Talla=Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla="+la_Talla);
		
		System.out.println("Abreviatura="+la_Talla.dameabreviatura());

	}

}
