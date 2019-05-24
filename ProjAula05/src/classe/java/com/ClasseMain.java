package classe.java.com;

import java.util.Scanner;

public class ClasseMain {
	
	static int control = 0;
	
	public static void Menu(int x) {
		 
		if (x == 1) {
			System.out.println("\n|||||||||||||||-1- Pintar Casa.");
			System.out.println("|||||||||||||||-2- Abrir Garagem.");
			System.out.println("|||||||||||||||-3- Fechar Garagem.");
			System.out.println("|||||||||||||||-4- Contas a Pagar.");
			System.out.println("|||||||||||||||-5- Crédito.");
			System.out.println("|||||||||||||||-6- Débito.");
			System.out.println("|||||||||||||||-7- Saldo.");
			System.out.println("|||||||||||||||-8- Solicitar Emprestimo.");
			System.out.println("|||||||||||||||-0- Sair:\n");
		}
		else {
			System.out.println("\n|||||||||||||||-1- Pintar Casa.");
			System.out.println("|||||||||||||||-2- Abrir Garagem.");
			System.out.println("|||||||||||||||-3- Fechar Garagem.");
			System.out.println("|||||||||||||||-4- Contas a Pagar.");
			System.out.println("|||||||||||||||-5- Crédito.");
			System.out.println("|||||||||||||||-6- Débito.");
			System.out.println("|||||||||||||||-7- Saldo.");
			System.out.println("|||||||||||||||-6- Débitoo.");
			System.out.println("|||||||||||||||-7- Saldo.");
			System.out.println("|||||||||||||||-8- Solicitar Emprestimo.");
			System.out.println("|||||||||||||||-9- Quitar Emprestimo.");
			System.out.println("|||||||||||||||-10- Consultar Emprestimo.");
			System.out.println("|||||||||||||||-11- Alterar Limite de Crédito.");
			System.out.println("|||||||||||||||-0- Sair:\n");
			control++;
		}
			
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exit = 0;
		int menuEsc =0;
		Double x = 0.0;
		
		
		System.out.println("|||||||||||||||DIGITE O CODIGO PASS DE SUA HOUSE||||||||||||\n");
		Scanner in1 = new Scanner(System.in);
		
		
		ClasseHouse HouseOne = new ClasseHouse(in1.nextLine());
		
		//do {
		while(exit <= 0) {	
			
			if (!HouseOne.EmpAtivo) { Menu(1);
			menuEsc =1;
			control = 0;
			}
			else Menu(2);
			
			//Scanner in1 = new Scanner(System.in);
			
			
			switch(in1.nextLine()) {
				case "1":
					
					System.out.println("|||||||||||||||Escolha uma cor abaixo ||||||||||||");
					System.out.println("|||||||||||||||-1- Vermelho.");
					System.out.println("|||||||||||||||-2- Azul.");
					
					switch(in1.nextLine()) {											
					case "1":
						HouseOne.Color="red";
						HouseOne.PintarCasa();
						break;
					case"2":
						HouseOne.Color="blue";
						HouseOne.PintarCasa();
						break;							
						}	
					break;
				case "2":
						HouseOne.OpenGarage();
					break;
				case "3":
						HouseOne.CloseGarage();
					break;
				case "4":
					System.out.println("|||||||||||||||Escolha uma conta abaixo para Pgto ||||||||||||");
					System.out.println("|||||||||||||||-1- Luz.");
					System.out.println("|||||||||||||||-2- Hipoteca.");
				
					switch(in1.nextLine()) {											
						case "1":
							System.out.println("Digite o Valor da Conta:");
							HouseOne.ValueLuz = Double.valueOf(in1.nextLine());
							HouseOne.BillingExpense(2);
							
							break;
						case"2":
							System.out.println("Digite o Valor da Conta:");
							HouseOne.ValueHipo = Double.valueOf(in1.nextLine());
							HouseOne.BillingExpense(1);
							
							break;							
							}	
					break;			
				case "5":
					
					System.out.println("Digite o Valor para depósito:");
					HouseOne.InMoney(Double.valueOf(in1.nextLine()));
					HouseOne.ConsultaMoney();
										
					break;
				case "6":
					System.out.println("Digite o Valor para saque:");
					HouseOne.OutMoney(Double.valueOf(in1.nextLine()));
					HouseOne.ConsultaMoney();
					break;
				case "7":
					HouseOne.ConsultaMoney();
					break;
				case "8":
						System.out.println("Qual valor deseja solicitar? Limite atual:"+ HouseOne.LimiteEmprestimo);
						HouseOne.SolicitaEmprestimo(0.0,3);
						HouseOne.SolicitaEmprestimo(Double.valueOf(in1.nextLine()), 1 );
					break;
				case "9":
					
					if (control > 0) {
						
						System.out.println("Digite o Valor para Armotização:");
						HouseOne.SolicitaEmprestimo(Double.valueOf(in1.nextLine()), 2 );
						
					}
					
					
					break;
				case "10":
					
					if (control > 0) {
						
						HouseOne.SolicitaEmprestimo(0.0,3);				
						
					}
					
					break;
				case "11":
					
					if (control > 0) {						

						System.out.println("Como deseja alterar seu crédito atual? R$"+ HouseOne.LimiteEmprestimo);
						x = Double.valueOf(in1.nextLine());
						
						if(HouseOne.LimiteEmprestimo != x) {
							HouseOne.LimiteEmprestimo = x;	
						}
						
					}
					break;
				case "0":
					System.out.println("Até mais.");
					exit = 1;
					break;
				
				
			default: exit = 1 ;
			}
								
		
		}//while(exit> 0);
		
		
		
			
	}

}
