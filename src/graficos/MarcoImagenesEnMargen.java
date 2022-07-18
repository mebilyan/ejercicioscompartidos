package graficos;

import java.awt.*;
import java.io.*;

import javax.swing.*;
import javax.imageio.*;

public class MarcoImagenesEnMargen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoDeMargenes mimarco=new MarcoDeMargenes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}


class MarcoDeMargenes extends JFrame {
	
	public MarcoDeMargenes() {
		
		setTitle("Marco de margenes");
		
		setBounds(650,300,500,500);
		
		LaminaDeMargenes milamina=new LaminaDeMargenes();
		
		add(milamina);
		
	}
}

class LaminaDeMargenes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
		File imagenChica=new File("src/graficos/Torkoal2.jpg");
		
		try {
			imagenMargen=ImageIO.read(imagenChica);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			imagenCentro=ImageIO.read(new File("src/graficos/Torkoal.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		g.drawImage(imagenMargen, 0, 0, 50, 50, this);
		
		g.drawImage(imagenCentro, 50, 50, 400, 400, this);
		
		for(int i=0;i<200;i++) {
			
			g.copyArea(0, 0, 50, 50, i*50, 0);
			g.copyArea(0, 0, 50, 50, 0, i*50);
			g.copyArea(0, 0, 50, 500, 450, 0);
			g.copyArea(0, 0, 500, 50, 0, 450);
		}
		
		
		Graphics2D g2=(Graphics2D) g;
		
		Font texto=new Font("Arial",Font.ITALIC,32);
		
		Color micolor=new Color(125,85,200);
		
		g2.setFont(texto);
		
		g2.setPaint(micolor);
		
		g2.drawString("hola soy Torkoal", 100, 100);
		
		Color micolor2=new Color(210,150,90);
		
		g2.setPaint(micolor2);
		
		g2.setFont(new Font("Forte",Font.BOLD,28));
		
		g2.drawString("Y ESTOY MAMADISIMO", 50, 450);
		
		
	}
	
	
	private Image imagenMargen;
	private Image imagenCentro;
}