package unidad3;

public class TrianguloFloyd {

	public static void main(String[] args){

		int cont = 1;
		for (int i = 0;i<4;i++) {
			for (int j = 0;j<=i;j++) {
				System.out.print(cont);
				cont++;
			}
			System.out.println();
		}

	}

}
