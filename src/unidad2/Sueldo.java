package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sueldo {

	public static void main(String[] args) throws IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce tu sueldo base");
		float sb = Float.parseFloat(in.readLine());
		float ventas []= new float[3];
		float comisiones=0;
		
		System.out.println("Introduce tus ventas");
		for (int i=0;i<ventas.length;i++) {
			float venta = Float.parseFloat(in.readLine());
			ventas[i]=venta;
			comisiones+=(ventas[i]*0.1);
		}
		
		System.out.println("Salario: "+sb+"€");
		System.out.println("Comisiones: "+comisiones+"€");
		System.out.print("Total a percibir: "+(sb+comisiones)+"€");
	}
}
