import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String clave="brayan";
		 
		 String pass="";
		 
		 while (clave.equals(pass)==false) {
			 
			 pass=JOptionPane.showInputDialog("Introducce la contrase�a, por favor");
			 
			 if(clave.equals(pass)==false) {
				 
			System.out.println("Contrase�a incorrecta"); 
			
			 }
		 
		 }
		 
		 System.out.println("Contrase�a correcta. Acceso permitido");
	}

}
