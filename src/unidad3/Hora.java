package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hora {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce la hora");
		int hora = (int) Long.parseLong(in.readLine());
		while(hora<0||hora>24) {
			System.out.print("Introducci�n incorrecta, la hora ha de ser entre 0 y 23. Int�ntalo de nuevo");
			hora = (int) Long.parseLong(in.readLine());
		}
		
		System.out.println("Introduce los minutos");
		int min = (int) Long.parseLong(in.readLine());		
		while(min<0||min>60) {
			System.out.print("No es correcto, los minutos han de ser entre 0 y 59. Int�ntalo de nuevo");
			min = (int) Long.parseLong(in.readLine());
		}
		
		System.out.println("Introduce los segundos");		
		int seg = (int) Long.parseLong(in.readLine());
		while(seg<0||seg>60) {
			System.out.print("No es correcto, los segundos han de ser entre 0 y 59. Int�ntalo de nuevo");
			seg = (int) Long.parseLong(in.readLine());
		}
		
		if (seg > 59) {
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
		
		System.out.printf("Un segundo despu�s son las %02.0f:%02.0f:%02.0f ",(float)hora,(float)min,(float)seg);
	}

}
