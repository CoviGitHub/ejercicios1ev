package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args) throws IOException{
		
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 
		 String nombre;
		 long t0;
		 long t1;
		 float crono;
		 
		 System.out.print("Dime tu nombre: ");
		 t0 = System.currentTimeMillis(); // milisegundos desde el 1 de enero de 1970	
		 nombre = in.readLine();	
		 t1 = System.currentTimeMillis();

		 crono = (t1-t0)/1000f;
		 
		 System.out.println("Hola " + nombre);
		 System.out.printf("Has tardado %.3f segundos en decirme tu nombre",  crono); //especificadores de formato ej %

	}
}
