
public class ArrayTexto2 {

//	¿Cúal de las cadenas de texto es alfabéticamente la primera? ¿En qué posición está? Con los datos del ejemplo la respuesta sería: Anna, en posición 2.

	static int posicionAlfabetica(String Array[]) {
			for(int i=0; i<= Array.length -1; i++) {
			  if ( Array[i].toLowerCase().startsWith("a")) {
				  return i;	
			  }  		
			}
			return -1; 	
		}
		public static void main(String[] args) {
		 String[] cadenas= {"Sue","Charlotte","Anna","Mike","William","Ed"};		
		   int posicion = posicionAlfabetica(cadenas);
			  if (posicion != -1) {
		       System.out.println("La cadena encontrada en orden alfabético se encuentra en la posición " + posicion);
		     } else {
		       System.out.println("No hay ninguna cadena que cumpla la condición.");
		       }
		}
		}