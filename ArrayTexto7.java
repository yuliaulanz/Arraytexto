
public class ArrayTexto7 {

//}¿Cuántas de las cadenas contienen la subcadena “zar”?

	     static boolean verificar(String palabra, String cosa) {
		      palabra = palabra.toLowerCase();	
		       for(int i = 0; i < palabra.length(); i++) {	    	  
			    	if(palabra.contains(cosa)) {
			        return true;		       
			    	}	    	 
		       }
			return false;     	 
	     }
	 public static void main(String[] args) {
	 String cadenas [] = {"Sue","Charlotte","Anna","Mike","William","Ed"};
	 int resultado = 0;
		 for(int i = 0; i < cadenas.length; i++) {
			 if (verificar(cadenas[i], "zar")) {
				resultado++;
			    System.out.println("Se ha encontrado una palabra que contiene la subcadena zar " +
				" y está en  " + i + " y es " + cadenas[i]);
			 }else System.out.println("En la cadena " + i + " no se ha encontrado la subcadena zar");			
		 }System.out.println("En total se han encontrado " + resultado + " palabras que tienen la subcadena zar");
	 }
	}
