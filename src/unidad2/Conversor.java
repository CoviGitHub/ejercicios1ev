package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversor {

		public static void main(String[] args) throws IOException {
			
			  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			  
			  float euros;
			  
			  System.out.print("Euros: ");
			  String linea = in.readLine();
			  euros = Float.parseFloat(linea);
			 
			  float dolares;
			  dolares = euros * 1.11f;
			  
			  System.out.printf("Dolares: %.2f", dolares);  //especificadores de formato ej %

	}
}
