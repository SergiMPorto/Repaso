package clases;

public class Uso_Arrays_II {

	public static void main(String[] args) {
		
		String [] paises=new String[8];
		
		paises[0]="España";
				paises[0]="Noruega";
				paises[1]="Estados Unidos";
				paises[2]="India";
				paises[3]="Argentina";
				paises[4]="Nueva Zelanda";
				paises[5]="Australia";
				paises[6]="Tailandia";
				paises[7]="Rumania";
				
				/*for(int i=0;i<paises.length;i++) {
					System.out.println(  paises[i]);
				}*/
				
				for(String elemento: paises) {
					System.out.println(elemento);
					
				}
				

	}

}
