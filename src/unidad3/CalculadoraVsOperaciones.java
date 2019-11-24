package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class CalculadoraVsOperaciones {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		char operacion = preguntar();
		float n1;
		float n2;
		float resultado;
		while (operacion != 's'){
			 
			n1 = pedirNumero("primero");
			n2 = pedirNumero("segundo");
			
			switch (operacion) {
			case '+':
				resultado = n1 + n2;
				break;
			case '-':
				resultado = n1 - n2;
				break;
			case '*':
				resultado = n1 * n2;
				break;
			default:
				resultado = n1 / n2;
				break;
			}
			System.out.println(n1 + " "+operacion +" "+ n2 + " = " + resultado);
			operacion =preguntar();
		}
	}

	static float pedirNumero(String orden) throws NumberFormatException, IOException {
		System.out.println("Dime el " + orden + " número: ");
		return Float.parseFloat(in.readLine());
	}

	static char preguntar() throws IOException {
		String r;
		char c=' ';
		boolean incorrecto;
		do {
			System.out.print("¿Que operación quieres hacer?");
			System.out.print("+=sumar,-=restar,*=multiplicar,/=dividir); s=salir");
			r = in.readLine();
			c = r.charAt(0);
			incorrecto = r.length() != 1 || (c != '+' && c != '-' && c != '*' && c != '/' && c != 's');
			if (incorrecto)
				System.out.println("Opción no válida");
		} while (incorrecto);
		return c;
	}

}
