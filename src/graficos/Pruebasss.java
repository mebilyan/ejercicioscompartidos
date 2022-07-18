package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class Pruebasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fuente=JOptionPane.showInputDialog("introducce fuente");
		
		boolean estalafuente=false;
		
		String [] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombredelafuente:nombresDeFuentes) {
			

			System.out.println(nombredelafuente);
			
			if(nombredelafuente.equals(fuente)) {
				
				estalafuente=true;
				
			}
		}
		
		if(estalafuente) {
			
			System.out.println("esta la fuente instalada");
			
			
			
		}else {
			
			System.out.println("no esta la fuente instalada");
		}


	}

}
