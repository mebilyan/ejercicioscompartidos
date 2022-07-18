package graficos;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConColor mimarco=new MarcoConColor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		

	}

}


class MarcoConColor extends JFrame{
	
	
	public MarcoConColor() {
		
		setTitle("Prueba con colores");
		
		setSize(400,400);
		
		LaminaConColor milamina=new LaminaConColor();
		
		Color micolo2=new Color(200,50,190);
		
		add(milamina);
		
		milamina.setBackground(SystemColor.window);//SystemColor.Window estableces el color del 
		
		//ssistema operativo en el cual corre el programa
	}
	
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		
		//dinujo de rectangulo
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.setPaint(Color.YELLOW);
		
		g2.draw(rectangulo);
		
		Color micolor=new Color(147,49,201);
		
		g2.setPaint(micolor);
		
		g2.fill(rectangulo);
		
		//dibujo de elipse
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		 //brighter aumenta el brillo del color y darker le quita
		g2.setPaint(new Color(76,221,232).brighter().brighter());
		
		g2.fill(elipse);
		
		
	}
	
}
