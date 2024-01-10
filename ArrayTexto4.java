
public class ArrayTexto4 {

//	¿Cuántas tienen más letras mayúsculas que minúsculas?

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
			String cadenas [] = {"Sue","Charlotte","Anna","Mike","William","Ed"};	
		   	for (int i = 0; i < cadenas.length; i++) {
		   		int contarMinusculas =0;
		   		int contadorMayusculas = contarMayusculas(cadenas[i]);
		   		contarMinusculas= cadenas[i].length()- contadorMayusculas; 
		   		if (contadorMayusculas > contarMinusculas) {
		   		System.out.println("Hay mayor cantidad de mayúsculas en la posición " + i +
		   				" con : " + contadorMayusculas + " Mayusculas y " + contarMinusculas +
		   				 " minúsculas");
		   		} else if (contadorMayusculas < contarMinusculas) {
		               System.out.println("Hay mayor cantidad de minúsculas en la posición " + i +
		       				" con  : " + contarMinusculas + " minúsculas y " + contadorMayusculas +
		      				 " mayúsculas");
		           } else {
		               System.out.println("Hay la misma cantidad de mayúsculas (" + contadorMayusculas +
		               		") como minúsculas (" + contarMinusculas + ") en la posición " + i );
		           }
		   	}
			}
		}