package clases;

import javax.swing.*;
import java.util.*;

public class Areas_figuras {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);
		System.out.println("Elige una opción ª \n1: Cuadrado  \n2: Rectángulo \n3: Triángulo \n4: Círculo"); //saltos de linea 
		
		int figura=entrada.nextInt();
				
				switch(figura) {
				case 1: 
					
					int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado"));
					System.out.println("El área del cuadraro es "+ Math.pow(lado, 2));
					
					break;
					
				case 2:
					int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
					int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
					System.out.println("El área del rectángulo es "+ base*altura);
					
					break;
					
				case 3: 
					int base1=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
					altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura")); //Utilizo la 
					System.out.println("El área de un triángulo es " + base1*altura/2);
					
					break;
					
				case 4:
					int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el rádio"));
					final double PI=3.1416;
			        System.out.println("El área de un circulo es "+ 2*PI*radio);
				}

	}

}
