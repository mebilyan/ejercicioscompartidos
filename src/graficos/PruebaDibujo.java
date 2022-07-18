package graficos;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConDibujos mimarco=new MarcoConDibujos();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}

class MarcoConDibujos extends JFrame{
	
	MarcoConDibujos(){
		 
		setTitle("prueba de Dibujo");
		
		setSize(400,400);
		
		setVisible(true);
		
		LaminaConFiguras milamina=new LaminaConFiguras();
		
		add(milamina);
	}
}

class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//g.drawRect(50, 50, 200, 200);
		
		//g.drawLine(100, 100, 300, 200);
		
		//g.drawArc(50, 100, 100, 200, 120, 150);
		
		Graphics2D g2=(Graphics2D) g;//importan hacer una refundicion de el objeto graphics en un 2D
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		
		  g2.draw(new Line2D.Double(100, 100, 300, 250));
		 
		 double CentroenX=rectangulo.getCenterX();
		  
		 double CentroenY=rectangulo.getCenterY();
		 
		 double radio=150;
		  
		 Ellipse2D circulo=new Ellipse2D.Double();
		  
		 circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio,
		 CentroenY+150);
		  
		 g2.draw(circulo);
		 
		 
	}
}