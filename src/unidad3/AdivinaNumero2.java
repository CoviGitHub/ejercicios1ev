package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero2 {
	static  Scanner in = new Scanner(System.in);


	public static void main(String[] args) {
		boolean respuesta = preguntar("¿Quieres jugar a las adivinanzas?");
		while(respuesta) {
			jugar();
			respuesta = preguntar("¿Quieres volver a jugar");
		}

	}
	
	static void jugar() {
		Random r = new Random();
		int max;
		max = r.nextInt(99001) + 1000;
		int n;
		n = r.nextInt(max) + 1;
		int nu;
		
		do {
			System.out.printf("¿Qué número estoy pensando entre 1 y %d? %d ", max, n);
			nu = in.nextInt();
			in.nextLine();
			if (n > nu)
				System.out.println("El número que estoy pensando es mayor");
			else if (n < nu)
				System.out.println("El número que estoy pensando es menor");
		} while (n != nu);
		System.out.println("Felicidades, has acertado.");
	}
	
	static boolean preguntar(String pregunta) {
		String jugar;
		boolean respuestaAfirmativa;
		boolean respuestaNegativa;
		boolean respuestaErronea;
		do {
			System.out.println(pregunta +" (si/no)");
			jugar = in.nextLine();
			respuestaAfirmativa = jugar.contentEquals("si");
			respuestaNegativa = jugar.contentEquals("no");//Se quitaría esta sentencia si hago la línea 48
			respuestaErronea = !respuestaAfirmativa &&!respuestaNegativa;
			// 	respuestaErronea = !(respuestaAfirmativa || jugar.contentEquals("no") o respuestaNegativa);
			if (respuestaErronea)
				System.out.println("Respuesta incorrecta");
		} while (respuestaErronea);
//		return respuestaAfirmativa; o
		return !respuestaNegativa;
	}

}
