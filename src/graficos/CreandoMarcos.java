package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1=new miMarco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );

	}

}

class miMarco extends JFrame{
	
	miMarco(){
		
		//setSize(500,300); //da las domensiones de la ventana
		
		//setLocation(500,300); //da la ubicacion en la pantalla
		
		setBounds(500,300,550,250); // da la ubicacion y tamaña de la ventana
		
		setResizable(false);  //permite o niega el hacer grande la ventana
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);//permite extender la pantalla aa tamaño completa
		
		setTitle("Mi ventana");// le pone titulo a la ventana
	}
}
