package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
		

public class Dado {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int nVeces = 0;
		int exc = 0;		
		int sumL1 = 0;
		int sumL2 = 0;
		int sumL3 = 0;
		int sumL4 = 0;
		int sumL5 = 0;
		int sumL6 = 0;

		System.out.print("Cuántas veces quieres lazar el dado? ");
				
		while(exc == 0) {
			try {
				in = new BufferedReader(new InputStreamReader(System.in));
				nVeces = Integer.parseInt(in.readLine());
				exc = 1;
			}catch(NumberFormatException ex) {
				System.out.println("No es un número entero, inténtalo de nuevo.");
				exc = 0;
			}
		}
				
		for(int i=0;i<nVeces;i++) {
			int alea = (int)(Math.random()*6+1);
			System.out.println(("rand "+alea));
			switch (alea) {
				case 1:
					sumL1++;
					break;
				case 2:
					sumL2++;
					break;
				case 3:
					sumL3++;
					break;
				case 4:
					sumL4++;
					break;
				case 5:
					sumL5++;
					break;
				case 6:
					sumL6++;
					break;
				default:
					break;
			}
		}
		System.out.print("\nLado 1 salió "+sumL1+" veces.\n");
		System.out.print("Lado 2 salió "+sumL2+" veces.\n");
		System.out.print("Lado 3 salió "+sumL3+" veces.\n");
		System.out.print("Lado 4 salió "+sumL4+" veces.\n");
		System.out.print("Lado 5 salió "+sumL5+" veces.\n");
		System.out.print("Lado 6 salió "+sumL6+" veces.\n");
	}

}