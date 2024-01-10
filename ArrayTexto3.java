
public class ArrayTexto3 {

//¿Cuántas letras mayúsculas hay en cada posición del array? Para que puedas comprobarlo mejor cambia las mayúsculas y minúsculas de la muestra de datos.
	 public static int contarMayusculas(String palabra) {
		    int contador = 0;
		    for (int i = 0; i < palabra.length(); i++) {
		        char caracter = palabra.charAt(i);
		        if (Character.isUpperCase(caracter)) {
		               contador++;
		        }
		    }
		       return contador;
		 }
			public static void main(String[] args) {
				String[] cadenas= {"Sue","Charlotte","Anna","Mike","William","Ed"};	
		       for (int i = 0; i < cadenas.length; i++) {
		           int contadorMayusculas = contarMayusculas(cadenas[i]);
		           System.out.println("Cantidad de mayúsculas en la posición " + i +
		           ": " + contadorMayusculas);
		       }
		   		
			}
		}
