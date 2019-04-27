package projeto.com.operadoresb;

import java.util.Scanner;

public class operadoresBasicos {

	public static double mainOperador(double valor1, double valor2, String opera) {

		System.out.println("C?lculo..." + valor1 + " " + opera + " " + valor2);

		char[] opConvert = opera.toCharArray();

		if (opConvert[0] == '+')

			return valor1 + valor2;

		else if (opConvert[0] == '-')

			return valor1 - valor2;

		else if (opConvert[0] == '*')

			return valor1 * valor2;

		else if (opConvert[0] == '/') {

			if (valor2 == 0) {
				System.out.println("Valor n?o divis?vel por zero.");
				return 0.0;
			}

			return valor1 / valor2;

		}

		else if (opConvert[0] == '%') {

			if (valor1 % valor2 == 0.0)
				System.out.println("Este mod traduz em n?mero par.");
			else
				System.out.println("Este mod traduz em n?mero impar.");

			return valor1 % valor2;

		}

		return -0.00;
	}

		// Aqui eremos utilizar todos operadores basicos no JAVA

		double valor1 = 0.0;
		double valor2 = 0.0;
		String operando = "";
		double monitor = 1;

		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner in3 = new Scanner(System.in);
		Scanner in4 = new Scanner(System.in);

		do {
			System.out.println("Digite valor1: ");
			valor1 = Double.valueOf(in1.nextLine());

			System.out.println("Digite operador:");
			operando = in3.nextLine();

			System.out.println("Digite valor2:");
			valor2 = Double.valueOf(in2.nextLine());

			System.out.println(mainOperador(valor1, valor2, operando));

			/*
			 * System.out.println("Este ? a soma de dois n?meros: "+
			 * mainOperador(1.2,2.4,"+"));
			 * System.out.println("Este ? a subtra??o de dois n?meros: "+
			 * mainOperador(1.2,2.4,"-"));
			 * System.out.println("Este ? a nultiplica??o de dois n?meros: "+
			 * mainOperador(1.2,2.4,"*"));
			 * System.out.println("Este ? a divis?o de dois n?meros:" +
			 * mainOperador(8.0,0.0,"/"));
			 * System.out.println("Este ? a divis?o de dois n?meros:" +
			 * mainOperador(16.0,8.0,"/"));
			 * System.out.println("Este ? um mod % entre dois n?meros:"+
			 * mainOperador(34.0,2.0,"%"));
			 */

			System.out.println("Digite 1 para continuar ou 0 para sair:");
			monitor = Double.valueOf(in4.nextLine());

		} while (monitor != 0);

	}

}
