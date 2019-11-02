package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class Operaciones {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		char rep=' ';
		
		do {
			float num1 = 0;
			float num2 = 0;
			int exc = 0;
			int opcion = 0;	
			
			System.out.println("      OPERACIONES\n\nElige una opción\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir");

			while(exc == 0) {
				try {
					in = new BufferedReader(new InputStreamReader(System.in));
					opcion = Integer.parseInt(in.readLine());
					exc = 1;
				}catch(NumberFormatException ex) {
					System.out.println("No es un número entero, inténtalo de nuevo.");
					exc = 0;
				}
			}
			exc = 0;

			switch(opcion) {
				case 1: //Suma
					while(exc == 0) {
						try {
							System.out.println("\nIntroduce un número");
							num1 = Float.parseFloat(in.readLine());
							exc = 1;
						}catch(NumberFormatException ex) {
							System.out.println("No es un número, inténtalo de nuevo.");
							exc = 0;
						}
					}exc = 0;				

					while(exc == 0) {
						try {
							System.out.println("Introduce otro número");
							num2 = Float.parseFloat(in.readLine());
							exc = 1;
						}catch(NumberFormatException ex) {
							System.out.println("No es un número, inténtalo de nuevo.");
							exc = 0;
						}
					}
					exc = 0;
					System.out.println(num1+" + "+num2+" = "+(num1+num2));
					break;
				case 2: //Resta
					while(exc == 0) {
						try {
							System.out.println("Introduce un número");
							num1 = Float.parseFloat(in.readLine());
							exc = 1;
						}catch(NumberFormatException ex) {
							System.out.println("No es un número, inténtalo de nuevo.");
							exc = 0;
						}
					}
					exc = 0;				

					while(exc == 0) {
						try {
							System.out.println("Introduce otro número");
							num2 = Float.parseFloat(in.readLine());
							exc = 1;
						}catch(NumberFormatException ex) {
							System.out.println("No es un número, inténtalo de nuevo.");
							exc = 0;
						}
					}
					exc = 0;
					
					System.out.println(num1+" - "+num2+" = "+(num1-num2));
					break;
				case 3: // Multiplicación
					while(exc == 0) {
						try {
							System.out.println("Introduce un número");
							num1 = Float.parseFloat(in.readLine());
							exc = 1;
						}catch(NumberFormatException ex) {
							System.out.println("No es un número, inténtalo de nuevo.");
							exc = 0;
						}
					}
					exc = 0;				

					while(exc == 0) {
						try {
							System.out.println("Introduce otro número");
							num2 = Float.parseFloat(in.readLine());
							exc = 1;
						}catch(NumberFormatException ex) {
							System.out.println("No es un número, inténtalo de nuevo.");
							exc = 0;
						}
					}
					exc = 0;
					System.out.println(num1+" * "+num2+" = "+(num1*num2));
					break;
				case 4: //División
					while(exc == 0) {
						try {
							System.out.println("Introduce un número");
							num1 = Float.parseFloat(in.readLine());
							exc = 1;
						}catch(NumberFormatException ex) {
							System.out.println("No es un número, inténtalo de nuevo.");
							exc = 0;
						}
					}
					exc = 0;				

					do {
						while(exc == 0) {
							try {
								System.out.println("Introduce otro número");
								num2 = Float.parseFloat(in.readLine());
								exc = 1;
							}catch(NumberFormatException ex) {
								System.out.println("No es un número, inténtalo de nuevo.");
								exc = 0;
							}
						}
						exc = 0;
						if (num2==0) {
							System.out.print("No se puede dividir por 0\n");
						}
					}while (num2 == 0);

					System.out.println(num1+" / "+num2+" = "+(num1/num2));
					break;
				case 5: //Salir
					System.exit(0);
					break;
				default:
					break;
			}
				
			while(exc == 0) {
				try {
					System.out.print("\nPara repetir pulsa s, para salir pulsa cualquier otra tecla.\n");
					rep = (char) in.read();
					exc = 1;
				}catch(NumberFormatException ex) {
					System.out.print("\nPara repetir pulsa s, para salir pulsa cualquier otra tecla.\n");
					exc = 0;
				}
			}
			
		}while(rep == 's'||rep == 'S');
	}
}
