
public class ArrayTexto5 {

//	Mostrar en pantalla todas las cadenas convertidas a letras mayúsculas.

	static String convertirMayuscula(String palabra) {
		String resultado = "";
		for (int i = 0; i < palabra.length(); i++) {
			char caracter;
	         caracter = palabra.charAt(i);
	        if (Character.isLowerCase(caracter)) {
	           caracter= Character.toUpperCase(caracter);        
	        }
	        resultado += caracter;
	    }
		return resultado;	    	
	}
	public static void main(String[] args) {
	String cadenas [] = {"Sue","Charlotte","Anna","Mike","William","Ed"};
		for (int i = 0; i < cadenas.length; i++) {
		String resultado=convertirMayuscula(cadenas[i]);
		System.out.println(resultado);	
		}
	}
}