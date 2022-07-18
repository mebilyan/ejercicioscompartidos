package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaEventosP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones mimarco=new MarcoBotones();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoBotones2 extends JFrame{
	
	public MarcoBotones2() {
		
		setTitle("Botones y Eventos");
		
        setBounds(700,300,500,300);
		
		LaminaBotones milamina=new LaminaBotones();
		
		add(milamina);
		
	}
}


class LaminaBotones2 extends JPanel {
	
	JButton botonAzul =new JButton("Azul");
	
	JButton botonAmarillo=new JButton("Amarrillo");
	
	JButton botonRojo=new JButton("Rojo");
			
	public LaminaBotones2() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo Amarillo=new ColorFondo(Color.yellow);
		ColorFondo Azul=new ColorFondo(Color.blue);
		ColorFondo Rojo=new ColorFondo(Color.red);
		
		botonAzul.addActionListener(Azul);
		botonRojo.addActionListener(Rojo);
		botonAmarillo.addActionListener(Amarillo);
	}
	
	private class ColorFondo implements ActionListener{
		
		public ColorFondo(Color c) {
			
			colorDeFondo=c;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorDeFondo);
		}
		private Color colorDeFondo;
	}
	
}

