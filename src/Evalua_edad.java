import java.util.*;
public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		 /* operadores de comparacion 
		< mayor que 
		> menor que
		!= diferente que
		== igual que
		*/
		
		if(edad>=18) {
			
			System.out.println("Eres mayor de edad");
		}

		else{
			//un else siempre debe ir acompaņado de un if 
			
			System.out.println("Eres menor de edad");
			
		}
		
	}

}
