import javax.swing.*;
public class Entrada_Ejemplo2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad, por favor");
		
		int usuario_edad=Integer.parseInt(edad);
		
		// ++ incrementa en 1 el valor a que se le pone
		
		usuario_edad++;
				
		System.out.println("Hola "+nombre_usuario+".El año que viene tendras "+usuario_edad+" años");
				
				
				
	}

}
