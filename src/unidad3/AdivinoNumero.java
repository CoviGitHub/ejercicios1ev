package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AdivinoNumero {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int miNum = 0;
		int valorMax = 0;
		int valorMin = 0;
		int numOrd;
		int exc = 0;
		String miResp;

		System.out.println("Introduzco mi número");
		while (exc == 0) {
			try {
				in = new BufferedReader(new InputStreamReader(System.in));
				miNum = Integer.parseInt(in.readLine());
				exc = 1;
			} catch (NumberFormatException ex) {
				System.out.println("No es un número entero, inténtalo de nuevo.");
				exc = 0;
			}
		}
		exc = 0;

		System.out.println("Cuál es el valor máximo?");
		while (exc == 0) {
			try {
				in = new BufferedReader(new InputStreamReader(System.in));
				valorMax = Integer.parseInt(in.readLine());
				valorMax = valorMax + 1;//Para incluir el valor máximo al iniciar Random línea 50.
				exc = 1;
			} catch (NumberFormatException ex) {
				System.out.println("No es un número entero, inténtalo de nuevo.");
				exc = 0;
			}
		}
		exc = 0;

		Random alea = new Random();
		// incluyo el 0 en la búsqueda.
		do {
			numOrd = alea.nextInt(valorMax) + valorMin;

			if (numOrd == miNum) {
				System.out.println(numOrd);
				System.out.println("Ord: He acertado?");
				System.out.println("Usu: tu número es ");
				miResp = in.readLine();
				if (miResp.contentEquals("si")==false) {
					System.out.println("Ord: !!!Anda ya, fíjate bien¡¡¡");
				}
				System.out.println("Usu: Fenómeno, has acertado con tu número (" + numOrd + ")");

			} else if (numOrd < miNum && numOrd > valorMin) {
				System.out.println(numOrd);
				System.out.println("Ord: He acertado?");
				System.out.println("Usu: tu número es ");
				miResp = in.readLine();
				if (miResp.contentEquals("menor") == false) {
					System.out.println("Ord: !!!Estás un poco despistado¡¡¡");
				}
				System.out.println("Usu: Tu número (" + numOrd + ") es menor que el mío, inténtalo de nuevo\n");
				valorMin = numOrd;

			} else if (numOrd > miNum && numOrd < valorMax) {
				System.out.println(numOrd);
				System.out.println("Ord: He acertado?");
				System.out.println("Usu: tu número es ");
				miResp = in.readLine();
				if (miResp.contentEquals("mayor")==false) {
					System.out.println("Ord: !!!Estate atento, te equivocas¡¡¡");
				}
				System.out.println("Usu: Tu número (" + numOrd + ") es mayor que el mío, inténtalo de nuevo\n");
				valorMax = numOrd;
			}

		} while (miNum != numOrd);
	}
}