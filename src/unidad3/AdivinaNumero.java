
package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdivinaNumero {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int nAdiv = 0;
		int exc = 0;
		char rep = ' ';
		
		//Visualizo los valores de Random para comprobar :)
		int n = (int)(Math.random()*(100000-1000)+1000);
		System.out.println(("n "+n));
		int rand = (int) (Math.random()*n+1);
		System.out.println("rand "+rand+"\n");
		System.out.println("He pensado un número entre 1 y "+n+", adivina cuál es: ");
		
		do {

			while(exc == 0) {
				try {
					in = new BufferedReader(new InputStreamReader(System.in));
					nAdiv = Integer.parseInt(in.readLine());
					exc = 1;
				}catch(NumberFormatException ex) {
					System.out.println("No es un número entero, inténtalo de nuevo.");
					exc = 0;
				}
			}
			exc = 0;
			
			if(nAdiv==rand) {
			System.out.print("Has acertado.");
			System.exit(0);
			}else if (nAdiv>rand){
				System.out.print("No has acertado, tu número es mayor que Random.\n");
			}else {
				System.out.print("No has acertado, tu número es menor que Random.\n");
			}
			
			// Entre esos valores se tardaría mucho en acertar por lo que opto a que el usuario decida si quiere salir o seguir intentándolo.			
			while(exc == 0) {
				try {
					System.out.print("\nPulsa\n 1 para seguir intentándolo.\n Cualquier otra tecla para salir.\n");
					rep = (char) in.read();
					exc = 1;
				}catch(NumberFormatException ex) {
					System.out.print("\nNo es una entrada válida, inténtalo de nuevo\n");
					exc = 0;
				}
			}
			exc = 0;
			if(rep != '1') {
				System.exit(0);
			}else {
				System.out.println("A ver si aciertas esta vez, mi número está entre 1 y "+n+".");		
			}
			
		}while(nAdiv!=rand);
		
	}

}