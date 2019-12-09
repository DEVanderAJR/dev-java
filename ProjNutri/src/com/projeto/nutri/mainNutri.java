package com.projeto.nutri;

import java.util.ArrayList;
import java.util.Scanner;

public class mainNutri {

	public static int count = 0, control = 0, contlista = 0;
    static	ArrayList<cadastroClientes> listaCliAll = new ArrayList<cadastroClientes>(); // ARRAY DE CADASTRO DE CLIENTES
    static	ArrayList<consultas> listaConArray = new ArrayList<consultas>(); // ARRA DE CADASTRO DE CONSULTAS
    static  ArrayList<cadastroGrupoAlimentar> listaglimentar4 = new ArrayList<cadastroGrupoAlimentar>(); //ARRAY DE CADASTRO DE GRUPO ALIMENTARRES
    static  ArrayList<dietas> listaDietas = new ArrayList<dietas>(); // ARRAY DE DIETAS

    private static boolean modoTeste = false;
    static cadastroClientes listaCli = new cadastroClientes();
	static consultas listaConsultas = new consultas();
	static cadastroGrupoAlimentar grupoAlimentar = new cadastroGrupoAlimentar();
	static dietas dietas = new dietas();
	 
  
public static void menu() {
		
		System.out.println("\n|-------------SYSTEM NUTRI - DIGITE O NUM CORRESPONDENTE---------|");		
		System.out.println("||-0- Cadastrar Cliente.");
		System.out.println("||-1- Consultar Cliente.");
		System.out.println("||||-2- Criar Consulta.");
		System.out.println("||||-3- Ver Consultas.");
		System.out.println("||||||-4- Criar Grupo Alimentar.");
		System.out.println("||||||-5- Visualizar Grupos Alimentares.");
		System.out.println("||-6- Definir Dieta.");
		System.out.println("||-7- Visualizar Dieta.");
		System.out.println("||-8- Visualizar Combinação de Alimentos.");
		System.out.println("|||||||||-9- Ativar/Desativar Modo Teste.");			
		System.out.println("|||||||||-10- Sair.");
		System.out.println("--------------------------SYSTEM NUTRI-------------------------|");
		
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
int exit = 0;
int exit1 = 1;
	

	Scanner inp = new Scanner(System.in);		
	menu();
		
	while(exit <= 0) {
		
			switch(inp.nextLine()) {
			case "0":
				
					Scanner in1 = new Scanner(System.in);		
					Scanner in2 = new Scanner(System.in);
					Scanner in3 = new Scanner(System.in);
					Scanner in4 = new Scanner(System.in);
					Scanner in5 = new Scanner(System.in);
					Scanner in6 = new Scanner(System.in);
					Scanner in616 = new Scanner(System.in);					
				
					do {
						if(modoTeste == false) {
							listaCli = new cadastroClientes();
							
						
							System.out.println("NOME CLIENTE:\n");	
								 listaCli.SetnomeCliente(in1.nextLine());
							System.out.println("ENDEREÇO:\n");	
								 listaCli.SetenderecoCli(in2.nextLine());
							System.out.println("TEL:\n");	
								 listaCli.SettelCli(in3.nextLine());
							System.out.println("MAIL:\n");	
								 listaCli.SetmailCli(in4.nextLine());
							System.out.println("DATA NASC:\n");	
								 listaCli.SetdataNasCliente(in5.nextLine());					
								 	
								 listaCliAll.add(listaCli);
								 
							System.out.println("CADASTRADO - DIGITE - 0 - PARA ENCERRAR OU - 1 -PARA CONTINUAR INSERINDO:\n");
												
							
							exit1 = (in6.nextInt());
						}else {
							//listaCli = new cadastroClientes();
							criaClienteAutomatico();
							System.out.println("CADASTRADO - DIGITE - 0 - PARA ENCERRAR OU - 1 -PARA CONTINUAR INSERINDO:\n");
							exit1 = (in616.nextInt());
						}
							
					}while(exit1 == 1);
				menu();
			break;	
			
			case "1":				
				viewclientes(-2);
				menu();
			break;
			
			case "2":	
				String value1 = "";	
			
				listaConsultas = new consultas();
				
				if ( listaCliAll.size()>0) {
					
						System.out.println("DIGITE O NOME DO USUARIO PARA MARCAR CONSULTA:\n");
						Scanner in7 = new Scanner(System.in);
						value1 = (in7.nextLine());
						
					for(int x= 0; x <  listaCliAll.size(); x++) {
						if(value1.toString().equals( listaCliAll.get(x).GetnomeCliente().toString())){	
							control = x;
							System.out.println("\n\n\n Olá: "+value1.toString());	
								
							listaConsultas.Setcod(control);
							listaConsultas.SetnomeCliente(listaCliAll.get(x).GetnomeCliente());
									
							System.out.println("DATA CONSULTA:\n");	
								Scanner in8 = new Scanner(System.in);
								listaConsultas.SetdataAgen(in8.nextLine());
							System.out.println("HORARIO:\n");	
								Scanner in9 = new Scanner(System.in);
								listaConsultas.SethorarioAge(in9.nextLine());
							System.out.println("PESO - EX: 67.0:\n");	
								Scanner in10 = new Scanner(System.in);
								listaConsultas.SetpesoCli(Double.valueOf(in10.nextLine()));
							System.out.println("ALTURA: EX: 1.70\n");	
								Scanner in11 = new Scanner(System.in);
								listaConsultas.Setaltura(Double.valueOf(in11.nextLine()));						
							System.out.println("% GORDURA CORPORAL: EX: 5.5\n");	
								Scanner in12 = new Scanner(System.in);
								listaConsultas.SetgorduraCorp(Double.valueOf(in12.nextLine()));
							System.out.println("SENSACAO ATUAL:\n");	
								Scanner in13 = new Scanner(System.in);
								listaConsultas.SetsensacaoAtual(in13.nextLine());
							System.out.println("RESTRIÇÃO ALIMENTAR:\n");	
								Scanner in14 = new Scanner(System.in);
								listaConsultas.SetrestricaoAlimen(in14.nextLine());
							System.out.println("META CALORICA: EX: 1500 \n");	
								Scanner in15 = new Scanner(System.in);
								listaConsultas.SetmetaCalorica(Double.valueOf(in15.nextLine()));
								
								listaConArray.add(listaConsultas);
								
			
							System.out.println("**************************************************************************");	
							System.out.println("**************************************************************************");
							System.out.println("CONSULTA CADASTRADA PARA: "+ listaConArray.get(contlista).GetnomeCliente()+" DIA: "+listaConArray.get(contlista).GetdataAgen());
							System.out.println("**************************************************************************");
							System.out.println("**************************************************************************");
     						contlista++;
											
						} else {
							System.out.println("\n\n\n LOADING....");
							try { Thread.sleep (1000); } catch (InterruptedException ex)  {System.out.println("Ops algo errado. Comece novamente.");}
							
							if(x >= listaCliAll.size()) {
								
								System.out.println("\n\n\n NOME NÃO CONSTA - PESQUISE NOVAMENTE...");
								try { Thread.sleep (1000); } catch (InterruptedException ex)  {System.out.println("Ops algo errado. Comece novamente.");}
								menu();
							}
						}
					}						
				}else {
					
					System.out.println("**************************************************************************");							
					System.out.println("*********************SEM CLIENTES CADASTRADOS.****************************");
					System.out.println("**************************************************************************");				
					
					menu();	}
				control++;
				menu();
			break;
			case "3":
						if(listaConArray.size()> 0) {
							viewConsultas(-2);		
						}
						else {
							System.out.println("**************************************************************************");				
							System.out.println("**************************************************************************");							
							System.out.println("********************SEM CONSULTAS CADASTRADAS.****************************");
							System.out.println("**************************************************************************");				
							menu();
						}
			break;
			
			case "4":
				double y = 1;				
				System.out.println("CADASTRE OS ALIMENTOS DENTRO DOS GRUPOS.");
				
				do {					
					if(modoTeste == false) {
						grupoAlimentar = new cadastroGrupoAlimentar(); //instanciando classe do tipo grupo alimentar
						System.out.println("GRUPO ALIMENTAR - 1 PARA CARBO, 2 PARA PROTEINA, 3 PARA GORDURAS ATUAL:\n");					
							Scanner in166 = new Scanner(System.in);
							grupoAlimentar.SetgrupoAlimentar(in166.nextInt());
						System.out.println("NOME ALIMENTO:\n");					
							Scanner in17 = new Scanner(System.in);
							grupoAlimentar.SetnomeAlimento(in17.nextLine());
						System.out.println("PORÇÃO:\n");					
							Scanner in18 = new Scanner(System.in);
							grupoAlimentar.Setporcao(Double.valueOf(in18.nextLine()));
						System.out.println("Kal:\n");					
							Scanner in19 = new Scanner(System.in);
							grupoAlimentar.Setkal(Double.valueOf(in19.nextLine()));
							
							grupoAlimentar.kalTotal();	
							
							listaglimentar4.add(grupoAlimentar);
							
							System.out.println("**************************************************************************");				
							System.out.println("**************************************************************************");							
							System.out.println("***********************ALIMENTO CADASTRADO.*******************************");
							System.out.println("**************************************************************************");				
							System.out.println("**************************************************************************");
						
							
							System.out.println("CADASTRADO - DIGITE - 0 - PARA ENCERRAR OU - 1 -PARA CONTINUAR INSERINDO:\n");
							Scanner in20 = new Scanner(System.in);					
							y = Double.valueOf(in20.nextLine());
							
						}else {
							
							do {
								
								grupoAlimentar = new cadastroGrupoAlimentar(); //instanciando classe do tipo grupo alimentar
								
								criaGrupoAutomatico(grupoAlimentar);
								
								System.out.println("CADASTRADO - DIGITE - 0 - PARA ENCERRAR OU - 1 -PARA CONTINUAR INSERINDO:\n");
								Scanner in20 = new Scanner(System.in);					
								y = Double.valueOf(in20.nextLine());
								
							}while( y == 1);
							
						}								
				}while( y == 1);
				menu();
							
			break;
			
			case "5":
				grupoAlimentar = new cadastroGrupoAlimentar(); 
				dietas.viewDietasCombina(listaglimentar4);
				exibirListaGrupoAlimentar();
				menu();
			break;
			case "6":
				String value2 = "";	
				String valor3 ="" ;
				String valor4 = "";
				
					if(modoTeste == false) {
						dietas = new dietas(); //instanciando classe do tipo grupo alimentar
						
						if(listaCliAll.size() >0 && listaConArray.size()> 0) { // Verifica a existencia de clientes e consultas.
							
							System.out.println("DIGITE O NOME DO USUARIO PARA DEFINIR DIETA:\n");
							Scanner in77 = new Scanner(System.in);
							value2 = (in77.nextLine());
							
								for(int x= 0; x <  listaCliAll.size(); x++) {
									if(value2.toString().equals( listaCliAll.get(x).GetnomeCliente().toString())){	//match
										
										for(int p = 0 ; p <listaConArray.size();p++) {
												if(listaCliAll.get(x).GetnomeCliente().equals(listaConArray.get(p).GetnomeCliente())) { //Verifica se existe Consulta para esse cliente
													
													valor3 = listaConArray.get(p).GetnomeCliente().toString();
													dietas.Setcod(listaConArray.get(p).Getcod());
													dietas.SetnomeCliente(listaCliAll.get(x).GetnomeCliente());
													dietas.SetcodDieta(listaConArray.get(p).Getcod()+listaCliAll.get(x).GetnomeCliente());
													dietas.SetsituacaoCalorica(listaConArray.get(p).GetmetaCalorica());
													dietas.criaDieta(valor3,dietas.GetsituacaoCalorica(), listaglimentar4 );
													
													System.out.println("DIGITE O COD DA DIETA ESCOLHIDA PARA O PACIENTE:\n");
													Scanner in777 = new Scanner(System.in);
													valor4 = in777.nextLine();
														
													dietas.SettipoDieta(valor4);
													
													viewCombDietas(valor4);
													
													listaDietas.add(dietas);
												
													System.out.println("DEFININDO DIETA...:\n");	
											}
										}
									}
								}
										
					}else {
						System.out.println("**************************************************************************");							
						System.out.println("**************SEM CLIENTE OU SEM CONSULTA*********************************");
						System.out.println("**************************************************************************");				
										
					}
				}
					menu();
			break;
			case "7":
				viewDietas();
				menu();
			break;
			
			case "8":
				if(listaDietas.size()> 0 && listaglimentar4.size() >0 ) {
					System.out.println("DIGITE O COD DA DIETA ESCOLHIDA PARA O PACIENTE. OU 0 PARA TODAS:\n");
					Scanner in888 = new Scanner(System.in);				 		
					viewCombDietas(in888.nextLine());
					}else System.out.println("CADASTRE UM GRUPO ALIMENTAR - CONSULTA DO CLIENTE E DEPOIS A DIETA PARA O CLIENTE:\n");
				menu();
			break;
			
			case "9":
				if(modoTeste == false){ modoTeste = true; System.out.println("Modo Teste Automatico Ativado.\n");	}
				else { modoTeste = false;System.out.println("Modo Teste Automático Desativado:\n");	}	
				menu();
			break;	
			
			case "10":
				System.out.println("Logout.");
				
				exit = 1;				
			break;
			
		}
	}
}

/*
 * VISUALIZA  CLIENTES CADASTRADOS, SE POSSUEM CONSULTA E DIETAS.
 * */
public static void viewclientes(int cod) {

	
	if(cod < 0) {
		System.out.println("CLIENTES EXISTENTES NO SISTEMA: " + listaCliAll.size());
		for(int x = 0; x < listaCliAll.size(); x++) {						
			//if(this.listaCliAll.size() != null) {			
				//control = i;
				System.out.println("CODCLI" + x );
				System.out.println("**************************************************************************");				
				System.out.println("Nome    :.:" + listaCliAll.get(x).GetnomeCliente());
				System.out.println("Endereço:.:" + listaCliAll.get(x).GetenderecoCli());
				System.out.println("Tel     :.:" + listaCliAll.get(x).GettelCli());
				System.out.println("Mail    :.:" + listaCliAll.get(x).Getmail());
				System.out.println("Dt Nas  :.:" + listaCliAll.get(x).GetdataNasCliente());				
		for(int y = 0 ; y <listaConArray.size();y++) {
				if(listaCliAll.get(x).GetnomeCliente().equals(listaConArray.get(y).GetnomeCliente())) { //Verifica se existe Consulta para esse cliente
					
					System.out.println("[Existe Consulta para o Cliente.]");
					System.out.println("COD:" +listaConArray.get(y).Getcod()+"-"+listaConArray.get(y).GetnomeCliente());
					System.out.println("Data:"+listaConArray.get(y).GetdataAgen());
					System.out.println("Horario: "+listaConArray.get(y).GethorarioAge());
					//System.out.println("*********************[EXISTE AGENDAMENTO]***************************");
					
					for(int j = 0 ; j <listaDietas.size();j++) {
						if(listaCliAll.get(x).GetnomeCliente().equals(listaDietas.get(j).GetnomeCliente())) { //Verifica se existe dieta para esse cliente x consulta;
							
							System.out.println("[Existe Dieta para o Cliente.]");
							System.out.println("COD:" +listaDietas.get(j).Getcod());
							System.out.println("CodDIETA:"+listaDietas.get(j).GetcodDieta());
							System.out.println("Situação Calórica: "+listaDietas.get(j).GetsituacaoCalorica());
							//System.out.println("Grupo de Alimento Permitido: "+listaDietas.get(j).GetdietasAll());
							
							//System.out.println("*********************[EXISTE AGENDAMENTO]***************************");
							
						}
					}
					
					
				}
				
		}
		
			System.out.println("**************************************************************************");
				
		}	
	}else {		
			//control = i;
			System.out.println("CODCLI" + cod );
			System.out.println("**************************************************************************");				
			System.out.println("Nome    :.:" + listaCliAll.get(cod).GetnomeCliente());
			System.out.println("Endereço:.:" + listaCliAll.get(cod).GetenderecoCli());
			System.out.println("Tel     :.:" + listaCliAll.get(cod).GettelCli());
			System.out.println("Mail    :.:" + listaCliAll.get(cod).Getmail());
			System.out.println("Dt Nas  :.:" + listaCliAll.get(cod).GetdataNasCliente());
			
			System.out.println("**************************************************************************");
			
			}
	}

/*
 * VISUALIZA  CONSULTAS CADASTRADASS, E SE  POSSUEM DIETAS RELACIONADAS.
 * */
public static void viewConsultas(int cod) {
	
	if(cod < 0) {
		String value2 = "";
		
		System.out.println("Digite o Nome do Cliente ou (T) para todos:\n");	
		Scanner in16 = new Scanner(System.in);
		value2 = in16.nextLine();
		if(value2.equals("T")) {
			for(int x = 0; x < listaConArray.size(); x++) {		
				
				
				System.out.println("*****************CONSULTAS********************************************************");			
				System.out.println("Cod       :.:" + listaConArray.get(x).Getcod());
				System.out.println("Nome      :.:" + listaConArray.get(x).GetnomeCliente());
				System.out.println("Data Ag   :.:" + listaConArray.get(x).GetdataAgen());
				System.out.println("Horario Ag:.:" + listaConArray.get(x).GethorarioAge());
				System.out.println("Peso Cli  :.:" + listaConArray.get(x).GetpesoCli());
				System.out.println("Altura Cli:.:" + listaConArray.get(x).Getaltura());
				System.out.println("%Gor Corp :.:" + listaConArray.get(x).GetgorduraCorp());
				System.out.println("Sensação  :.:" + listaConArray.get(x).GetsensacaoAtual());
				System.out.println("Restr.Alim:.:" + listaConArray.get(x).GetrestricaoAlimen());
				System.out.println("Meta Calori.:" + listaConArray.get(x).GetmetaCalorica());
				
			for(int j = 0 ; j <listaDietas.size();j++) {
					if(listaCliAll.get(x).GetnomeCliente().equals(listaDietas.get(j).GetnomeCliente())) { //Verifica se existe dieta para esse cliente x consulta;
						
						System.out.println("[Existe Dieta definida para esta Consulta.]");
						System.out.println("COD:" +listaDietas.get(j).Getcod());
						System.out.println("CodDIETA:"+listaDietas.get(j).GetcodDieta());
						System.out.println("Situação Calórica: "+listaDietas.get(j).GetsituacaoCalorica());
						//System.out.println("Grupo de Alimento Permitido: "+listaDietas.get(j).GetdietasAll());
						
						//System.out.println("*********************[EXISTE AGENDAMENTO]***************************");
					}
			}				
				System.out.println("**************************************************************************");				
			}
		}else {
			
			for(int p= 0; p <  listaConArray.size(); p++) {
				if(value2.equals(listaConArray.get(p).GetnomeCliente())) {
					
					if(p == 0) {
						System.out.println("*****************CONSULTAS: "+listaConArray.get(p).GetnomeCliente()+" - ********************************************************");			
					}
						System.out.println("Cod       :.:" + listaConArray.get(p).Getcod());
						System.out.println("Nome      :.:" + listaConArray.get(p).GetnomeCliente());
						System.out.println("Data Ag   :.:" + listaConArray.get(p).GetdataAgen());
						System.out.println("Horario Ag:.:" + listaConArray.get(p).GethorarioAge());
						System.out.println("Peso Cli  :.:" + listaConArray.get(p).GetpesoCli());
						System.out.println("Altura Cli:.:" + listaConArray.get(p).Getaltura());
						System.out.println("%Gor Corp :.:" + listaConArray.get(p).GetgorduraCorp());
						System.out.println("Sensação  :.:" + listaConArray.get(p).GetsensacaoAtual());
						System.out.println("Restr.Alim:.:" + listaConArray.get(p).GetrestricaoAlimen());
						System.out.println("Meta Calori.:" + listaConArray.get(p).GetmetaCalorica());
						
					for(int j = 0 ; j <listaDietas.size();j++) {
						if(listaCliAll.get(p).GetnomeCliente().equals(listaDietas.get(j).GetnomeCliente())) { //Verifica se existe dieta para esse cliente x consulta;
							
							System.out.println("[Existe Dieta definida para esta Consulta.]");
							System.out.println("COD:" +listaDietas.get(j).Getcod());
							System.out.println("CodDIETA:"+listaDietas.get(j).GetcodDieta());
							System.out.println("Situação Calórica: "+listaDietas.get(j).GetsituacaoCalorica());
							//System.out.println("Grupo de Alimento Permitido: "+listaDietas.get(j).GetdietasAll());
							
							//System.out.println("*********************[EXISTE AGENDAMENTO]***************************");
						}
				}
					
					System.out.println("---");
					
				}
				else {
					
					System.out.println("Cliente digitado não encontrado. Tente novamente"); menu();
					
				}
			}value2 = "";;
			
		}
		
		
		}else {		
				
			System.out.println("*****************CONSULTAS********************************************************");			
			System.out.println("Cod       :.:" + listaConArray.get(cod).Getcod());
			System.out.println("Nome      :.:" + listaConArray.get(cod).GetnomeCliente());
			System.out.println("Data Ag   :.:" + listaConArray.get(cod).GetdataAgen());
			System.out.println("Horario Ag:.:" + listaConArray.get(cod).GethorarioAge());
			System.out.println("Peso Cli  :.:" + listaConArray.get(cod).GetpesoCli());
			System.out.println("Altura Cli:.:" + listaConArray.get(cod).Getaltura());
			System.out.println("%Gor Corp :.:" + listaConArray.get(cod).GetgorduraCorp());
			System.out.println("Sensação  :.:" + listaConArray.get(cod).GetsensacaoAtual());
			System.out.println("Restr.Alim:.:" + listaConArray.get(cod).GetrestricaoAlimen());
			System.out.println("Meta Calori.:" + listaConArray.get(cod).GetmetaCalorica());
			
			System.out.println("**************************************************************************");
				
				}
	menu();
	}

/*
 * ADICIONA GRUPOS E ALIMENTOS AUTOMATICAMENTE NO MODO DE TESTE
 * */
public static void criaGrupoAutomatico(cadastroGrupoAlimentar grupoAlimentar2) {


	grupoAlimentar2 = new cadastroGrupoAlimentar(); 	
	grupoAlimentar2.SetgrupoAlimentar(1);
	grupoAlimentar2.SetnomeAlimento("Pão");
	grupoAlimentar2.Setporcao(2.0);
	grupoAlimentar2.Setkal(120.0); 
	grupoAlimentar2.kalTotal();	
	
	listaglimentar4.add(grupoAlimentar2);
	
	grupoAlimentar2 = new cadastroGrupoAlimentar(); 
	grupoAlimentar2.SetgrupoAlimentar(1);
	grupoAlimentar2.SetnomeAlimento("Biscoito Integral");
	grupoAlimentar2.Setporcao(3.0);
	grupoAlimentar2.Setkal(150.0);
	grupoAlimentar2.kalTotal();		

	listaglimentar4.add(grupoAlimentar2);
	
	grupoAlimentar2 = new cadastroGrupoAlimentar(); 
	grupoAlimentar2.SetgrupoAlimentar(2);
	grupoAlimentar2.SetnomeAlimento("Carne de Frango");
	grupoAlimentar2.Setporcao(3.0);
	grupoAlimentar2.Setkal(120.0);
	grupoAlimentar2.kalTotal();	
	
	listaglimentar4.add(grupoAlimentar2);
	grupoAlimentar2 = new cadastroGrupoAlimentar(); 
	grupoAlimentar2.SetgrupoAlimentar(2);
	grupoAlimentar2.SetnomeAlimento("Leite Integral");
	grupoAlimentar2.Setporcao(3.0);
	grupoAlimentar2.Setkal(95.0);
	grupoAlimentar2.kalTotal();	
								
	listaglimentar4.add(grupoAlimentar2);
	
	grupoAlimentar2 = new cadastroGrupoAlimentar(); 
	grupoAlimentar2.SetgrupoAlimentar(3);
	grupoAlimentar2.SetnomeAlimento("Abacate Fresco");
	grupoAlimentar2.Setporcao(3.0);
	grupoAlimentar2.Setkal(150.0);
	grupoAlimentar2.kalTotal();	
	
	listaglimentar4.add(grupoAlimentar2);
	
	grupoAlimentar2 = new cadastroGrupoAlimentar(); 
	grupoAlimentar2.SetgrupoAlimentar(3);
	grupoAlimentar2.SetnomeAlimento("Sementes Oleaginosas");
	grupoAlimentar2.Setporcao(5.0);
	grupoAlimentar2.Setkal(55.0);
	grupoAlimentar2.kalTotal();	
	
	listaglimentar4.add(grupoAlimentar2);	
}

/*
 * ADICIONA CLIENTES AUTOMATICAMENTE NO MODO DE TESTE
 * */
public static void criaClienteAutomatico() {
	
	 listaCli = new cadastroClientes();
		 listaCli.SetnomeCliente("VANDERLEI JR");
		 listaCli.SetenderecoCli("RUA MARIA , N 999. BAIRRO. CIDADE. MG - BRASIL");
		 listaCli.SettelCli("(31) 9 9950-5050");
		 listaCli.SetmailCli("teste@teste.com");
		 listaCli.SetdataNasCliente("15/12/2000");		
	 listaCliAll.add(listaCli);
	 
	listaCli = new cadastroClientes();
		 listaCli.SetnomeCliente("ANA PAULA");
		 listaCli.SetenderecoCli("RUA PEDRO , N 1000. BAIRRO. CIDADE. MG - BRASIL");
		 listaCli.SettelCli("(31) 9 1015-5050");
		 listaCli.SetmailCli("OK@teste.com");
		 listaCli.SetdataNasCliente("31/01/1970");		
	 listaCliAll.add(listaCli);
	 	
	 listaCli = new cadastroClientes();
		 listaCli.SetnomeCliente("ALINE SANTOS");
		 listaCli.SetenderecoCli("RUA MEGA , N 15. BAIRRO. CIDADE. MG - BRASIL");
		 listaCli.SettelCli("(31) 9 8011-5050");
		 listaCli.SetmailCli("nina@teste.com");
		 listaCli.SetdataNasCliente("01/01/2001");		
	listaCliAll.add(listaCli);
	 	
	modoTeste = false;	
}

/*
 * EXIBE GRUPOS E ALIMENTOS
 * */
public static void exibirListaGrupoAlimentar() {	

	if(listaglimentar4.size()> 0) {
		for(int x =0; x <listaglimentar4.size(); x++ ) {
			switch(listaglimentar4.get(x).GetgrupoAlimentar())
			{
				case 1:
					System.out.println("*****************GRUPO CARBO -1"+listaglimentar4.get(x).GetgrupoAlimentar()+"********************************************************");
					System.out.println("GrupoAlimentar :.:" + listaglimentar4.get(x).GetgrupoAlimentar());
					System.out.println("Alimento      :.:" + listaglimentar4.get(x).GetnomeAlimento());
					System.out.println("porcaoAli   :.:" + listaglimentar4.get(x).Getporcao());
					System.out.println("Kal:.:" + listaglimentar4.get(x).Getkal());
					System.out.println("Kal Total  :.:"+ listaglimentar4.get(x).kalTotal());						
					System.out.println("**************************************************************************");
				break;
				case 2:
					System.out.println("*****************GRUPO PROTEIN - 2 "+listaglimentar4.get(x).GetgrupoAlimentar()+"********************************************************");
					System.out.println("GrupoAlimentar :.:" + listaglimentar4.get(x).GetgrupoAlimentar());
					System.out.println("Alimento      :.:" + listaglimentar4.get(x).GetnomeAlimento());
					System.out.println("porcaoAli   :.:" + listaglimentar4.get(x).Getporcao());
					System.out.println("Kal:.:" + listaglimentar4.get(x).Getkal());
					System.out.println("Kal Total  :.:"+ listaglimentar4.get(x).kalTotal());						
					System.out.println("**************************************************************************");
				break;
				case 3:
					System.out.println("*****************GRUPO GORDURAS - 3 "+listaglimentar4.get(x).GetgrupoAlimentar()+"********************************************************");
					System.out.println("GrupoAlimentar :.:" + listaglimentar4.get(x).GetgrupoAlimentar());
					System.out.println("Alimento      :.:" + listaglimentar4.get(x).GetnomeAlimento());
					System.out.println("porcaoAli   :.:" + listaglimentar4.get(x).Getporcao());
					System.out.println("Kal:.:" + listaglimentar4.get(x).Getkal());
					System.out.println("Kal Total  :.:"+ listaglimentar4.get(x).kalTotal());						
					System.out.println("**************************************************************************");
				break;
				}
				
		}
	}else {System.out.println("GRUPO VAZIO****************");}
	
	
}

public static void viewDietas() {
	
	
	if(listaDietas.size()>0) {
		for(int j = 0 ; j <listaDietas.size();j++) {
				
				System.out.println("-------------------DIETAS CADASTRADAS------------------------------");
				System.out.println("NOME CLIENTE:" +listaDietas.get(j).GetnomeCliente());
				System.out.println("COD:" +listaDietas.get(j).Getcod());
				System.out.println("CodDIETA:"+listaDietas.get(j).GetcodDieta());
				System.out.println("Situação Calórica: "+listaDietas.get(j).GetsituacaoCalorica());
				System.out.println("COD - Tipo Dieta: "+listaDietas.get(j).GettipoDieta());
				viewCombDietas(listaDietas.get(j).GettipoDieta());
				System.out.println("-----------------------[EXISTE DIETA]------------------------------");
		}
		
	}else System.out.println("*********************[NÃO EXISTE DIETA]***************************");
}

public static void viewCombDietas(String cod) {
	
	 int i = Integer.parseInt(cod);
	 double a,b,c,d =0;
	
if(i == 0) {
	for(int x =0; x <listaglimentar4.size(); x++ ) {
		
		System.out.println("-------------------DIETAS CADASTRADAS------------------------------");
		System.out.println("NOME CLIENTE: " + listaglimentar4.get(x).GetnomeCliente());
		System.out.println("COD CLI: " + listaglimentar4.get(x).Getcod());
		System.out.println("GRUPO ALIMENTAR: " + listaglimentar4.get(x).GetgrupoAlimentar());
		System.out.println("ALIMENTO: " + listaglimentar4.get(x).GetnomeAlimento());
		System.out.println("KAL x PORÇÃO: "+ listaglimentar4.get(x).Getkal());
		System.out.println("TOTAL Kal: "+ listaglimentar4.get(x).GettotKalimentos());
		System.out.println("-------------------------------------------------------------------");
		
	}
	
	}else {
		/*Ajustando entrada de dados*/
		 int p = Integer.parseInt(cod.substring(0,1));
	//	 System.out.println(p);
		 int q = Integer.parseInt(cod.substring(1,2));
		// System.out.println(q);
		 int r = Integer.parseInt(cod.substring(2,3));
	//	 System.out.println(r);
		 
		 	a = Double.valueOf(listaglimentar4.get(p).kalTotal());
			b = Double.valueOf(listaglimentar4.get(q).kalTotal());
			c = Double.valueOf(listaglimentar4.get(r).kalTotal());
			d= a + b + c;
			
		 	System.out.println("|TIPO DIETA: " + p + q + r + " |");
			System.out.println("********************************************************************");
			System.out.println("ALIMENTOS X KAL TOTAL:                                     *******");
			System.out.println("POSITION: "+ p + q+ r+ "**************************************************************");																
			System.out.println("GRUPO ALIMENTAR  :.: " + listaglimentar4.get(p).GetgrupoAlimentar());
			System.out.println("Alimento  :.: " + listaglimentar4.get(p).GetnomeAlimento()+"- KalxPorcao :.:" + listaglimentar4.get(p).kalTotal());
			System.out.println("GRUPO ALIMENTAR  :.: " + listaglimentar4.get(q).GetgrupoAlimentar());
			System.out.println("Alimento  :.: " + listaglimentar4.get(q).GetnomeAlimento()+"- KalxPorcao :.:" + listaglimentar4.get(q).kalTotal());
			System.out.println("GRUPO ALIMENTAR  :.: " + listaglimentar4.get(r).GetgrupoAlimentar());
			System.out.println("Alimento  :.: " + listaglimentar4.get(r).GetnomeAlimento()+"- KalxPorcao :.:" + listaglimentar4.get(r).kalTotal());
			System.out.println("*****************************************************************");
			System.out.println("TOTAL Kal: "                           + (d) +" kals.    *********");
			System.out.println("*********************************************************************");
		
		}
	}
}
	



