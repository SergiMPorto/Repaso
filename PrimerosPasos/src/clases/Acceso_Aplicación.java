package clases;
import javax.swing.*;


public class Acceso_Aplicación {

	public static void main(String[] args) {
		
		String clave="Polla";
		
		String pass="";
		
		
		while (clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Introduce la contraseña");
			
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");
				
				
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");
	

	}

}
