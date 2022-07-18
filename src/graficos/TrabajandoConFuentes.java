package graficos;

import java.awt.*;
import javax.swing.*;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConFuentes mimarco=new MarcoConFuentes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoConFuentes extends JFrame{
	
	
	public MarcoConFuentes() {
		
		setTitle("Prueba con Fuentes");
		
		setSize(400,400);
		
		LaminaConFuentes milamina=new LaminaConFuentes();
		
		add(milamina);
		
		milamina.setForeground(Color.RED); //lo que hace estableces el color base para todo lo que
		//se ponga en la lamina
		
  }
	
}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Font mifuente=new Font("Arial",Font.BOLD,28); //bold pone el testo en negritas
		
		g2.setFont(mifuente);
		
		g2.setPaint(Color.red);
		
		g2.drawString("Brayan", 100, 100);
		
		g2.setFont(new Font("Times New Roman",Font.ITALIC,38));//pone el texto en cursiva
		
		g2.setPaint(Color.cyan);
		
		g2.drawString("hola que haces",100, 300);
		
		g2.setFont(new Font("Forte",Font.PLAIN,28));//pone el texto en normal
		
		g2.setPaint(new Color(45,75,100));
		
		g2.drawString("en medio", 200, 200);
	}
	
}

