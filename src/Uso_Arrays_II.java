import javax.swing.JOptionPane;

public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String[] paises= {"Mexico","España","Colombia","Peru","Chile","Argentina","Ecuador","Venezuela"};
		for(int i=0;i<paises.length;i++) {
			
			System.out.println("Pais"+(i+1)+"="+paises[i]);
		}*/
		
		String [] paises=new String[8];
		
		for(int i=0;i<8;i++){
			
			paises[i]=JOptionPane.showInputDialog("Introduce pais "+(i+1));
		}
		
		
		
		for(String elemento:paises){
			
			System.out.println("Pais: "+elemento);
		}

	}

}
