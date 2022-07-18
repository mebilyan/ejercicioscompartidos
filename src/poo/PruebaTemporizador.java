package poo;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente=new DameLaHora();
		
		//ActionListener oyente=new DameLaHora();
		
		Timer miTemporizador=new Timer(5000, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		System.exit(0);
		
		Toolkit.getDefaultToolkit().beep();

	}

}

class DameLaHora implements ActionListener{
	
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora=new Date();
		
		System.out.println("Te pongo la hora cada 5 sg: "+ahora);
		
		Toolkit.getDefaultToolkit().beep(); //la clase Toolkit permite haceder a los recursos de la PC
		
	}
}