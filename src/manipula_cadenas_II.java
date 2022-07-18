
public class manipula_cadenas_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="Hoy es un estupendo dia para aprender a programar en Java";
		
				
	    String frase_resumen=frase.substring(0,29)+" irnos a la playa y olvidarnos de todo...."+
	    " y "+frase.substring(29, 57);
		
	    /*este metodo es string extra el primer valor contando desde 0 y y la segunda es la 
	     * que no quiero extraer
	     */
	    
	    System.out.println(frase_resumen);

	}

}
