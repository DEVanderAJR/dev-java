package com.projeto.ope.relacionais;

public class operadoresRelacionais {
	
	public static void tipoOperador(String operador) {
		
		//char operador =' ';
		boolean tf = false;
		double contas = 0.0;
		
		System.out.println("Este é operando é um: " + operador);
		
		//contas = 2 + operador + 2;		
		
	}	
	
	
	public static void main(String[] args) {
		// Utilizaremos Operadores Relacionais e lógicos;
		
		//bollean
		// < = > || && >= <= ==0
		
		tipoOperador("<");
		tipoOperador(">");
		tipoOperador(">=");
		tipoOperador("=<");
		tipoOperador("!=");
		tipoOperador("&&");
		tipoOperador("||");
		tipoOperador("=");
		tipoOperador("==");
	}

}
