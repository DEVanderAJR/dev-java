package com.projeto.ope.relacionais;

import java.util.Scanner;

public class operadoresRelacionais {

	private static String control[]={"",""};
	
	public static void lDados() {

		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		
		System.out.println("Digite Valor 1:");
		control[0]= n1.nextLine();
		System.out.println("Digite Valor 2:");
		control[1] = n2.nextLine();

	}

	public static void tipoOcase(String operador) {

		boolean tf = false;
		
		System.out.println("\nEste operando é um: " + operador);

		switch (operador) {
			case "<":
				tf = Double.valueOf(control[0]) <  Double.valueOf(control[1]);
				System.out.println("Resultado: " + control[0] +operador+ control[1]+"? | "+tf);			
				break;
				
			case ">":
				tf = Double.valueOf(control[0]) >  Double.valueOf(control[1]);
				System.out.println("Resultado: " + control[0] +operador+ control[1]+"? | "+tf);
				break;
				
			case ">=":
				tf = Double.valueOf(control[0]) >=  Double.valueOf(control[1]);
				System.out.println("Resultado: " + control[0] +operador+ control[1]+"? | "+tf);			
				break;
				
			case "<=":
				tf = Double.valueOf(control[0]) <=  Double.valueOf(control[1]);
				System.out.println("Resultado: " + control[0] +operador+ control[1]+"? | "+tf);
				break;
				
			case "!=":
				tf = Double.valueOf(control[0]) != Double.valueOf(control[1]);
				System.out.println("Resultado: " + control[0] +operador+ control[1]+"? | "+tf);
				break;
				
			case "&&":
				if(Double.valueOf(control[0]) > 0  && Double.valueOf(control[1]) > 0) { tf = true;}
				System.out.println("Resultado - Ambos maior que 0: " + control[0] +operador+ control[1]+"? | "+tf);			
				break;
				
			case "||":
				if(Double.valueOf(control[0]) > 10  || Double.valueOf(control[1]) > 10) { tf = true;}
				System.out.println("Resultado - Algum maior que 10: " + control[0] +operador+ control[1]+"? | "+tf);			
				break;
				
			case "==":
				tf = Double.valueOf(control[0]) ==  Double.valueOf(control[1]);
				System.out.println("Resultado: " + control[0] +operador+ control[1]+"? |"+tf);
			
				break;
			}
	}

	public static void main(String[] args) {
		// Utilizando Operadores Relacionais e lógicos;
		String operandos[]= {">","<","<=",">=","!=","&&","||","=="};
		int x = operandos.length -1;
		int y = 0;
		
		lDados(); //dados do teclado;
		
		while(x >= y) { 
			tipoOcase(operandos[x]);
			x--;
		}
		
	}

}
