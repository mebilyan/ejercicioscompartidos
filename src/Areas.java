import javax.swing.*;
import java.util.*;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Elije una opción: \n1: cuadrado \n2: rectangulo \n3: triangulo \n4: circulo");
		
		int figura=entrada.nextInt();
		
		switch (figura) {
		
		/*Simpre se acompaña el metodo case con un break; y lo que hace es salirse del switch y no ejecutar
		 * el resto del programa
		 */
		
		case 1: 
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("intuduce el lado, por favor"));
			
			System.out.println("El area de cuadrado es "+Math.pow(lado, 2));
			
			break;
			
		case 2:
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("intuduce la base, por favor"));
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("intuduce la altura, por favor"));
			
			System.out.println("El area del rectangulo es "+base*altura);
			
			break;
			
		case 3:
			
			base=Integer.parseInt(JOptionPane.showInputDialog("intuduce la base, por favor"));
			
			altura=Integer.parseInt(JOptionPane.showInputDialog("intuduce la altura, por favor"));
			
			System.out.println("El area del triangulo es "+(base*altura)/2);
			
			break;
			
		case 4:
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("intuduce la radio, por favor"));
			
			System.out.print("El area del circulo es ");
			
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
			
			break;
			
			//default es sinonimo de else que significaria y si no
			
			default:
				
				System.out.println("La opcion no es correcta");
				
		}

	}

}
