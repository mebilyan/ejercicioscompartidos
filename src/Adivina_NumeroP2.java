import java.util.Scanner; 
public class Adivina_NumeroP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creacion de bucles usando do-while la cual permiter ejecutar el programa almenos una vez
		
		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in); 
		
		int numero=0;
		
		int intentos=0;
		
		//operador diferente de = "!="
		
		{
			
			intentos++;
			
			System.out.println("Introduce un numero, por favor");
			
			numero=entrada.nextInt();
			
			if (aleatorio<numero) {
				
			System.out.println("Mas bajo");
				
			}
			
			else if (aleatorio>numero) {
				
				System.out.println("Mas alto");
			}
		
		
		}while(numero!=aleatorio); 
		
		System.out.println("Correcto. Lo has conseguido en "+intentos+" intentos.");

	}

}
