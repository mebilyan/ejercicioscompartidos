package graficos;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;

public class CreandoMarcosCentrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado mimarco=new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado(){
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit(); //getdefaul devuelve el medio donde se ejecuta el programa
		
		Dimension tamanoPantalla=mipantalla.getScreenSize();//getscreensize proporciona el tamaño de la pantalla
		
		int alturaPantalla=tamanoPantalla.height;//con este campo de clase se obtiene el alta de la pantalla
				
		int anchoPantalla=tamanoPantalla.width;//con este se obtiene el ancho
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("marcoCentrado");
		
		//la ubicacion de la imagen se debe partir desde la raiz de la carpeta del proyecto
		
		Image miIcono=mipantalla.getImage("src/graficos/icono.jpg");
		
		setIconImage(miIcono);
		
	}
	
}
