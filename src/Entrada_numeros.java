import javax.swing.*;
public class Entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		double x=10000.0;
		 prinf da formanto numero sien la primera parte el formate y la segunda el valor
		System.out.printf("%1.2f",x/3);
		*/
		
		String num1=JOptionPane.showInputDialog("Introduce un numero");
		
		double num2= Double.parseDouble(num1);
		
		System.out.print("La raiz cuadrada de "+num2+ " es ");
		 
		System.out.printf("%1.4f", Math.sqrt(num2));
		

	}

}
