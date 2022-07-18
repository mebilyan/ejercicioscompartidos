import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//datos de tipi boolean solo pueden ser VERDADEROS O FALSOS
		
		int arroba=0;
		
		boolean punto=false;
				
		String mail=JOptionPane.showInputDialog("Introducce tu email");
		
		for(int i=0; i<mail.length();i++) {
			
		//los datos de tipo char van entre '' comillas simples
			
			if(mail.charAt(i)=='@') {
				
				arroba++;
			}
			
			if (mail.charAt(i)=='.') {
				
				punto=true;
			}
			
		}
		
		if(arroba==1&& punto==true){
			
			System.out.println("Es correcto");
		}
		
		else {
			System.out.println("No es correcto");
		}

	}

}
