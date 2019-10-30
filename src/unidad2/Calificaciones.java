package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) throws IOException{
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.print("Nota de matemáticas: ");
		 float notaM = Float.parseFloat(in.readLine());
		 System.out.print("Nota de la primera tarea: ");
		 float notaT1M = Float.parseFloat(in.readLine());
		 System.out.print("Nota de la segunda tarea: ");
		 float notaT2M = Float.parseFloat(in.readLine());
		 System.out.print("Nota de la tercera tarea: ");
		 float notaT3M = Float.parseFloat(in.readLine()); 
		 float mediaM = (notaM * 0.9f) +((notaT1M + notaT2M+ notaT3M)/3)*0.1f;
		 System.out.print("media: "+mediaM);

	}

}
