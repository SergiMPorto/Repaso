package clases;

public class manipula_cadena_II {

	public static void main(String[] args) {
		String frase="Hoy es un estupendo día para aprender a programar en Java";
		String frase_resumen=frase.substring(29, 47);
		String frase_resumen1=frase.substring(0, 29)+ " irnos a la playa y follar al sol...." + "y " + frase.substring(29,57);
		System.out.println(frase_resumen);
		System.out.println(frase_resumen1);

	}

}
