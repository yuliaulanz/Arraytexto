
public class ArrayTexto11 {

//¿Cuál es la cadena con más vocales y en qué posición está?

		static void encontrarMaxVocales(String[] cadenas) {
	       int maxVoc = 0;
	       String cadenaMax = "";
	       for (int i = 0; i < cadenas.length; i++) {
	           int vocalesActuales = 0;
	           for (int j = 0; j < cadenas[i].length(); j++) {
	               char letra = Character.toLowerCase(cadenas[i].charAt(j));
	               if ("aeiou".indexOf(letra) != -1) {
	                   vocalesActuales++;
	               }
	           }         
			            if (vocalesActuales > maxVoc) {
			                maxVoc = vocalesActuales;
			                cadenaMax = cadenas[i];
			            }
	       }
	       System.out.println("La cadena con más vocales es: " + cadenaMax);
	       System.out.println("Número de vocales: " + maxVoc);
	   }	
		public static void main(String[] args) {
		 String cadenas [] = {"Sue","Charlotte","Anna","Mike","William","Ed"};
	    encontrarMaxVocales(cadenas);
		}
	}
