
public class ArrayTexto8 {

//	¿Cuántas cadenas comienzan por la letra ‘A’, bien en mayúsculas o bien en minúsculas?


	  static boolean verificacion(String palabra) {
		if (palabra.startsWith("a") || palabra.startsWith("A")) {
			return true;	
		}
		return false;
	  }
		public static void main(String[] args) {
		String cadenas [] = {"Sue","Charlotte","Anna","Mike","William","Ed"};
			int cantidad =0;
			for (int i = 0; i<cadenas.length;i++) {
				if (verificacion(cadenas[i])) {
					cantidad ++;
					System.out.println(cadenas[i]);
				}
			}
			System.out.println("Se han encontrado  " + cantidad + " palabras que empiezan por a");
		}
     }
	
