
public class ArrayTexto6 {

//	¿Cuántas de las cadenas son palíndromos (capicúa)? Por ejemplo: “anna” lo es.
	   static boolean polindromo(String palabra) {
		    palabra = palabra.toLowerCase();	       
			    int longitud = palabra.length();
			    for (int i = 0; i < longitud / 2; i++) {
			        if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
			            return false;
			        }
			    }
		     return true;
		   }
			public static void main(String[] args) {
			String cadenas [] = {"Sue","Charlotte","Anna","Mike","William","Ed"};
				for (int i = 0; i < cadenas.length; i++) {
			        if (polindromo(cadenas[i])) {
			            System.out.println(cadenas[i] + " es un palíndromo");
			        } else {
			            System.out.println(cadenas[i] + " no es un palíndromo");
			          }
			    }
			}
		}
