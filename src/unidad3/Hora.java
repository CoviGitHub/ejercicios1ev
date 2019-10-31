package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hora {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce la hora");
		int hora = Integer.parseInt(in.readLine());
		while(hora<0||hora>23) {
			System.out.print("Introducción incorrecta, la hora ha de ser entre 0 y 23. Inténtalo de nuevo");
			hora = Integer.parseInt(in.readLine());
		}
		
		System.out.println("Introduce los minutos");
		int min = Integer.parseInt(in.readLine());		
		while(min<0||min>59) {
			System.out.print("No es correcto, los minutos han de ser entre 0 y 59. Inténtalo de nuevo");
			min = Integer.parseInt(in.readLine());
		}
		
		System.out.println("Introduce los segundos");		
		int seg = Integer.parseInt(in.readLine());
		while(seg<0||seg>59) {
			System.out.print("No es correcto, los segundos han de ser entre 0 y 59. Inténtalo de nuevo");
			seg = Integer.parseInt(in.readLine());
		}
		
		if (seg >= 59) {
			seg = 0;
			min = min+1;
			}else {
			seg=seg+1;
			}
		
		if(min > 59) {
			min = 0;
			hora = hora+1;
		}
		
		if(hora > 23) {
			hora = 0;
		}
		
		System.out.printf("Un segundo después son las %02.0f:%02.0f:%02.0f ",(float)hora,(float)min,(float)seg);
	}

}
