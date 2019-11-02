package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangulo {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		float l1 = 0;
		float l2 = 0;
		float l3 = 0;
		int exc = 0;
		
		System.out.print("      TRIANGULO\n\nIntroduce un lado del triángulo. ");
		while(exc == 0) {
			try {
				l1 = Float.parseFloat(in.readLine());
				exc = 1;
			}catch(NumberFormatException ex) {
				System.out.println("No es un número entero, inténtalo de nuevo.");
				exc = 0;
			}
		}
		exc = 0;
		
		System.out.print("\nel segundo lado del triángulo. ");	
		while(exc == 0) {
			try {
				l2 = Float.parseFloat(in.readLine());
				exc = 1;
			}catch(NumberFormatException ex) {
				System.out.println("No es un número entero, inténtalo de nuevo.");
				exc = 0;
			}
		}
		exc = 0;
		System.out.print("\nel tercer lado del triángulo. ");	
		while(exc == 0) {
			try {
				l3 = Float.parseFloat(in.readLine());
				exc = 1;
			}catch(NumberFormatException ex) {
				System.out.println("No es un número entero, inténtalo de nuevo.");
				exc = 0;
			}
		}
		exc = 0;
		
		if((l3<(l1+l2))&&(l2<(l1+l3))&&(l1<(l2+l3))) {
			if (l1!=l2&&l2!=l3&&l1!=l3) {
				System.out.println("\nEs Escaleno.");
			}else if (l1==l2&&l1==l3) {
				System.out.println("\nEs Equilatero.");	
			}else {
				System.out.println("\nEs Isosceles.");	
			} 
		}else {
			System.out.println("\nLos datos introducidos no son longitudes de los lados de un triángulo");
		}
	}
}
