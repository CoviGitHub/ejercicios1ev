package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class Multiplicar {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		/*He intentado hacer excepciones para porbar, salen pero supongo que hay otras formas 
		  más prácticas de gestionarlas como algún método con parámetros u otro systema*/

			char resp=' ';
		do {
			int tabla=0;
			System.out.print("            TABLA DE MULTIPLICAR\n\nQué tabla quieres repasar del 1 al 9. La tabla del ");
			
			int exc1=0;
			while(exc1==0) {
				try {
					in = new BufferedReader(new InputStreamReader(System.in));
					tabla = Integer.parseInt(in.readLine());
					exc1=1;
				}catch(NumberFormatException ex) {
					System.out.println("No es un número, inténtalo de nuevo.");
					exc1=0;
				}
			}
			
			while(tabla<1||tabla>9){
				System.out.println("Debe ser entre 1 y 9, vuelve a intentarlo.");
				int exc2=0;
				while(exc2==0) {
					try {
						tabla = Integer.parseInt(in.readLine());
						exc2=1;
					}catch(NumberFormatException ex) {
						System.out.println("No es un número, inténtalo de nuevo.");
						exc2=0;
					}
				}
			}
						
			int result=-0;
			int errores = 0;
			for(int i = 1;i<=10;i++) {
				System.out.print(i+" * "+tabla+" = ");
				int exc3=0;
				while(exc3==0) {
					try {
						result = Integer.parseInt(in.readLine());
						exc3=1;
					}catch(NumberFormatException ex) {
						System.out.print("No es un número, inténtalo de nuevo: ");
						exc3=0;
					}
				}
				
				if(result!=i*tabla) {
					System.out.println("Es incorrecto, la respuesta es "+i*tabla);
					errores++;
				}	
			}
			
			if(errores<2) {
				System.out.println("\nTienes un aprobado :)\n");
			}else {
				System.out.println("\nTienes un suspenso :(\n");
			}

			int exc4=0;
			while(exc4==0) {
				try {
					System.out.print("Para empezar de nuevo pulsa 1, para salir pulsa cualquier otra tecla.\n");
					resp = (char) in.read();
					exc4 = 1;
				}catch(NumberFormatException ex) {
					System.out.print("Para empezar de nuevo pulsa 1, para salir pulsa cualquier otra tecla.\n");
					exc4 = 0;
				}
			}

		}while(resp =='1');
	}
}