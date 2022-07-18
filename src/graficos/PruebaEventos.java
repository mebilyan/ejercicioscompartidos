package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones mimarco=new MarcoBotones();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		
		setTitle("Botones y Eventos");
		
        setBounds(700,300,500,300);
		
		LaminaBotones milamina=new LaminaBotones();
		
		add(milamina);
		
	}
}


class LaminaBotones extends JPanel implements ActionListener{
	
	JButton botonAzul =new JButton("Azul");
	
	JButton botonAmarillo=new JButton("Amarrillo");
	
	JButton botonRojo=new JButton("Rojo");
			
	public LaminaBotones() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
		botonAmarillo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado=e.getSource();//getsource este metodo nos devuelve quien es la fuente
		//origen del evento
		
		if(botonPulsado==botonAzul) {
		
		setBackground(Color.blue);
		}
		
		else if(botonPulsado==botonAmarillo) {
			
			setBackground(Color.yellow);
		}
		else{
			
			setBackground(Color.RED);
		}
	}
	
}