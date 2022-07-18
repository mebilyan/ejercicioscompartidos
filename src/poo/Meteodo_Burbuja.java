package poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Meteodo_Burbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		int arreglo[],NElementos,aux;
		
		NElementos=Integer.parseInt(JOptionPane.showInputDialog("cantidad de datos"));
		
		arreglo=new int [NElementos];//cantidad de dastos ern la array
		
		for (int i=0;i<NElementos;i++) {
			
			System.out.print((i+1)+". digite un numero: ");
			
			arreglo[i]=entrada.nextInt();
			
			
		}
		
		// Metodo Burbuja
		
		for (int i=0; i<(NElementos-1);i++) {
			
			for (int j=0;j<(NElementos-1);j++) {
				
				if(arreglo[j]>arreglo[j+1]) {
					
					aux=arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]=aux;
					
				}
			}
		}
		
		//mostrar el arreglo ordenado en forma creciente
		
		System.out.println("\nArreglo ordenado en forma creciente: ");
		
		for (int i=0;i<NElementos;i++) {
			
			System.out.print(arreglo[i]+" - ");
		}

	}

}
