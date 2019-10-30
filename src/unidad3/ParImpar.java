package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ParImpar {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce un número");
		int num = (int) Long.parseLong(in.readLine());

		
		if(num%2 == 0) {
			System.out.print("Es par");
		}else {
			System.out.print("Es impar");
		}

	}

}
