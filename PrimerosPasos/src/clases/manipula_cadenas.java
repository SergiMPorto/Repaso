package clases;

public class manipula_cadenas {

	public static void main(String[] args) {
		
		String nombre="Sergio";
		
		System.out.println("Mi nombre es "+ nombre);
  System.out.println("Mi nombre tiene "+ nombre.length()+ " letras");
  
   System.out.println("La primera letra de mi nombre es "+ nombre.charAt(0));
   int ultima_letra;
  ultima_letra=nombre.length();
  
 System.out.println("Y la ultima letra es la "+ nombre.charAt(ultima_letra-1));
		  
	}

}
