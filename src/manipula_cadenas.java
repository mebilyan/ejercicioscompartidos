
public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre= "brayan";
		
		System.out.println("Mi nombre es "+ nombre);
		
		System.out.println("mi nombre tiene "+nombre.length()+" letras.");
		
		// el metodo charAt cuenta la primer caracter desde 0
		
		System.out.println("la primera letra de "+nombre+" es la "+nombre.charAt(0));
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		
		
		System.out.println("Y la ultima letra es la "+nombre.charAt(ultima_letra-1));

		//se debe poner -1 debido a que  length da el numero de caracteres y chartAt cuenta desde 0
	}

}
