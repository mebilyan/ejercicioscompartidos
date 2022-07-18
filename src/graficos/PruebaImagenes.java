package graficos;

import javax.swing.*;
import java.awt.*;
import java.io.*;

import javax.imageio.*;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        MarcoImagen mimarco=new MarcoImagen();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		setTitle("Marco con Imagen");
		 
		setBounds(750,300,500,500);
		
		LaminaConImagen milamina=new LaminaConImagen();
		
		add(milamina);
		
		
		
	}
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		try { imagen=ImageIO.read(new File("src/graficos/Torkoal2.jpg")); } 
		  catch(IOException e) {
		  System.out.println("la imagen no se encuentra"); }
	}
	
        public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		

		
		
		  //File miimagen=new File("src/graficos/Torkoal.png");
		  
		 
		  //un objeto de tipo observer es el que  espera  que se cargue la imagen.
		  
		  int anchuraimagen=imagen.getWidth(this);//el operador this hace referencia al objeto donde
		  //se encuentra uno, por que lamina es el objeto que espera a que la lamina sea cargada
		  
		  int alturaimagen=imagen.getHeight(this);
		  
		  g.drawImage(imagen, 0, 0, anchuraimagen, alturaimagen, null);
		  
		  for(int i=0;i<500;i++) {
			  for (int j=0;j<500;j++) {
				  
				  if(i+j>0) {
				
				  g.copyArea(0, 0, anchuraimagen, alturaimagen, anchuraimagen*i,alturaimagen*j );
				  }
			  }
		  }
		  
		 
	}
	
	private Image imagen;
} 