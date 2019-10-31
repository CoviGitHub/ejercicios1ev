package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Colores {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int rgb [][] = new int[3][3];
		
		System.out.println();
		for (int i=0;i<rgb.length;i++) {

			switch(i){
				case 0: System.out.print("Para 'y' ");
					break;
				case 1: System.out.print("Para 'i' ");
					break;
				case 2: System.out.print("Para 'q'");
					break;
				default:
					break;
			}
			
			for(int j = 0;j < 3;j++) {
				switch(j){
					case 0: System.out.print("Introduce la componente RGB rojo: ");
						break;
					case 1: System.out.print("verde: ");
						break;
					case 2: System.out.print("y azul: ");
						break;
					default:
						break;
				}
				
				int componenteRGB = Integer.parseInt(in.readLine());
				rgb[i][j] = componenteRGB;
			} 
			
			System.out.println();
		}
		System.out.println("y = 0,299*"+rgb[0][0]+" + 0.587*"+rgb[0][1]+" + 0.114*"+rgb[0][2]+" = "+((rgb[0][0]*0.299)+(rgb[0][1]*0.587)+(rgb[0][2]*0.114)));
		System.out.println("\ni = 0,596*"+rgb[1][0]+" - 0.275*"+rgb[1][1]+" - 0.321*"+rgb[1][2]+" = "+((rgb[1][0]*0.596)-(rgb[1][1]*0.275)-(rgb[1][2]*0.321)));
		System.out.print("\nq = 0,212*"+rgb[2][0]+" - 0.528*"+rgb[2][1]+" + 0.311*"+rgb[2][2]+" = "+((rgb[2][0]*0.212)-(rgb[2][1]*0.528)+(rgb[2][2]*0.311)));		
	}
}
