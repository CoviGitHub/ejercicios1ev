package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bisiesto {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un a�o cualquiera");
		int a�o = Integer.parseInt(in.readLine());
		
		if(a�o%4==0 && (a�o%100!=0 || a�o%400==0)) {
				System.out.print("Es bisiesto");
			}else {	
			System.out.print("No es bisiesto.");
		}
	}

}
