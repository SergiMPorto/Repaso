package clases;

public class Uso_Arrays {

	public static void main(String[] args) {
		
		/*int [] mi_matriz=new int[5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=35;
		mi_matriz[2]=27;
		mi_matriz[3]=-56;
		mi_matriz[4]=78;*/
		
		int [] mi_matriz= {5,35,27,-56,78,56,58,32,8,45,21,27};
		
		System.out.println(mi_matriz[4]);
		
		for(int i=0;i<mi_matriz.length;i++) {
			System.out.println(mi_matriz[i]);
		}
		

	}

}
