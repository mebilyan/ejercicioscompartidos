
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double raiz=Math.sqrt(9);
		
		/*refundicion es convertir un tipo de dato en otro 
		poniendo entre () al que se va a convertir
		
		
				int resultado=(int)Math.round(num1);
				*/
				
		double base=5;
		
		double exponente=3;
		
		int resultado=(int)Math.pow(base, exponente);
		
		System.out.println("El resultado de "+base+ " elevado a " + exponente + " es " +resultado);

	}

}
