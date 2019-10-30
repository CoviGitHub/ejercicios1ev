package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bisiesto {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un año cualquiera");
		int año = (int) Long.parseLong(in.readLine());
		
		if(año%4==0 && (año%100!=0 || año%400==0)) {
				System.out.print("Es bisiesto");
			}else {	
			System.out.print("No es bisiesto.");
		}
	}

}
