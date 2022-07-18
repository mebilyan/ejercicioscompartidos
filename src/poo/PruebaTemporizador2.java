package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj=new Reloj();
		
		mireloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		
		System.exit(0);
		

	}

}

class Reloj{
	
	/*public Reloj(int intervalo,boolean sonido) {
		
		this.intervalo=intervalo;
		this.sonido=sonido;
		
		
	} se puede presindir del contructor devido a que la class DameLaHora2 es una clase interna local*/
	
	public void enMarcha(int intervalo,boolean sonido) {
		
		class DameLaHora2 implements ActionListener{
			
			public void actionPerformed (ActionEvent evento) {
				
				Date ahora=new Date();
				
				System.out.println("Te pongo las hora cada 3seg: "+ahora);
				
				if(sonido) {
					
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}

		ActionListener oyente=new DameLaHora2();
		
		Timer miTemporizador=new Timer(intervalo,oyente);
		
		miTemporizador.start();
		
		
	}
	
	
	
	

	
}