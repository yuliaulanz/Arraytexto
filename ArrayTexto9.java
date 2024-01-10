
public class ArrayTexto9 {

//¿En qué posición está la cadena con más caracteres?
		  static void encontrarMaxCaracteres(String[] cadenas) {
		   int maxCaracteres = 0;
		   String cadenaMax = "";
			    for (int i = 0; i < cadenas.length; i++) {
			        int longitudActual = cadenas[i].length();
			        if (longitudActual > maxCaracteres) {
			            maxCaracteres = longitudActual;
			            cadenaMax = cadenas[i];
			        }
			    }
			    System.out.println("La cadena con más caracteres es: " + cadenaMax);
			    System.out.println("Número de caracteres: " + maxCaracteres);
		   }
			public static void main(String[] args) {
		   String cadenas [] = {"Sue","Charlotte","Anna","Mike","William","Ed"};
			encontrarMaxCaracteres(cadenas);		
			}
		}

