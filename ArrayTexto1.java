
public class ArrayTexto1 {
	
//	Crea un array de enteros del mismo tamaño del array de cadenas de texto y guarda, en cada posición, la longitud de caracteres de cadena en la misma posición.

	  static void gurdarCantidad(String[] Array, int[] huecos) {
		  
				for(int i=0; i <Array.length; i++) {		
				 huecos[i] = Array[i].length();
				 System.out.println(Array[i] + " tiene  "  + huecos[i] + " caracteres");
				}
			}
			public static void main(String[] args) {
				String[] cadenas= {"Sue","Charlotte","Anna","Mike","William","Ed"};	
				int[] longitud= new int[cadenas.length]; 
					gurdarCantidad(cadenas, longitud);
			}	
		}
