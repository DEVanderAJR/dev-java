package projeto.com.operadoresb;

import java.util.Scanner;

public class operadoresBasicos {

	public static double mainOperador(double valor1, double valor2, String opera) {

		System.out.println("Cálculo..." + valor1 + " " + opera + " " + valor2);

		char[] opConvert = opera.toCharArray();

		if (opConvert[0] == '+')

			return valor1 + valor2;

		else if (opConvert[0] == '-')

			return valor1 - valor2;

		else if (opConvert[0] == '*')

			return valor1 * valor2;

		else if (opConvert[0] == '/') {

			if (valor2 == 0) {
				System.out.println("Valor não divisível por zero.");
				return 0.0;
			}

			return valor1 / valor2;

		}

		else if (opConvert[0] == '%') {

			if (valor1 % valor2 == 0.0)
				System.out.println("Este mod traduz em número par.");
			else
				System.out.println("Este mod traduz em número impar.");

			return valor1 % valor2;

		}

		return -0.00;
	}
	
	public static void main(String[] args) {

		// Aqui eremos utilizar todos operadores basicos no JAVA

		double valor1 = 0.0;
		double valor2 = 0.0;
		String operando = "";
		double monitor = 1;

		Scanner in4 = new Scanner(System.in);
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner in3 = new Scanner(System.in);
		

		do {
			System.out.println("Digite valor1: ");
			valor1 = Double.valueOf(in1.nextLine());

			System.out.println("Digite operador:");
			operando = in3.nextLine();

			System.out.println("Digite valor2:");
			valor2 = Double.valueOf(in2.nextLine());

			System.out.println(mainOperador(valor1, valor2, operando));

			/*
			 * System.out.println("Este é a soma de dois números: "+
			 * mainOperador(1.2,2.4,"+"));
			 * System.out.println("Este é a subtração de dois números: "+
			 * mainOperador(1.2,2.4,"-"));
			 * System.out.println("Este ? a nultiplição de dois números: "+
			 * mainOperador(1.2,2.4,"*"));
			 * System.out.println("Este ? a divisão de dois números:" +
			 * mainOperador(8.0,0.0,"/"));
			 * System.out.println("Este ? a divisão de dois números:" +
			 * mainOperador(16.0,8.0,"/"));
			 * System.out.println("Este ? um mod % entre dois números:"+
			 * mainOperador(34.0,2.0,"%"));
			 */

			System.out.println("Digite 1 para continuar ou 0 para sair:");
			monitor = Double.valueOf(in4.nextLine());

		} while (monitor != 0);
		
}
}
