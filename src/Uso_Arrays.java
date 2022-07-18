
public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//las dos nomenglaturas para declarar variables son validad
		//int mi_matriz2 []=new int[5];
		
		/*int [] mi_matriz=new int[5];
		
		
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=71;*/
		
		
		int [] mi_matriz= {5,38,-15,92,72,95,85,65,25,14,78,85,65,12,45,78,78,95,23};
		
		
		
		for(int i=0;i<mi_matriz.length;i++) {
			
			System.out.println("Valor del indice "+i+" = "+mi_matriz[i]);
		}
	}

}
