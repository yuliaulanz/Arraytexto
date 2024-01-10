
public class ArrayTexto10 {

//	¿Hay cadenas repetidas?

		static int contarRepetidas(String[] Array) {
		    int C = 0;
		    for (int i = 0; i < Array.length; i++) {
		        for (int j = i + 1; j < Array.length; j++) { 
		            if (Array[i].equalsIgnoreCase(Array[j])) {
		                C++;
		                System.out.println(Array[i] + " " + Array[j]);
		            }
		        }
		    }
		    return C;
		}
		public static void main(String[] args) {
	       String cadenas[] = {"Sue","Charlotte","Anna","Mike","William","Ed"};
		        int CRep= contarRepetidas(cadenas);
		        System.out.println("Hay " +
		        CRep + " palabras repetidas");
		}
	}
