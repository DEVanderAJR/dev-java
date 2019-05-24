package classe.java.com;

public class ClasseHouse {
	
/*
 * Atributos
 * */
	String Color ="";
	Double Size = 0.0;
	String Locator ="";
	Double Price = 0.0;
	Double ValueHipo =0.0;
	Double ValueLuz =0.0;
	Double LimiteEmprestimo = 1000.0;
	boolean	EmpAtivo = false;
	private String NumHouse = "";
	private Boolean Quitado = true;
	private Double Saldo = 0.0;
	private boolean MoneyTerc = false;
	private Double ControlEmprestimo = 0.0; 
	
	/*
	 * CONSTRUTOR
	 * É INVOCADO QUANDO SE INSTANCIA UMA CLASSE
	 * Responsável pela inicialização do objeto;
	 * Deve sempre possuir o mesmo nome da classe;
	 * Não permite retorno de valor;
	 * Não obrigatório;
	 * */
	
public ClasseHouse(String CodUser) {
	
	this.NumHouse = (CodUser);
	System.out.println("\nInstanciando Sistema House. Cod:" + this.NumHouse);	
	System.out.println("|||||||||||||||Bem vindo ao Sistema House - O que deseja fazer? ||||||||||||");
	
}

/*
 * Comportamentos e métodos
 * */

public void ConsultaMoney() {			
	
		System.out.println("Saldo: R$" + this.Saldo);
		
		if(this.ControlEmprestimo > 0.0) {
			System.out.println("Empréstimo: R$" + this.ControlEmprestimo);
		}
	}
	
	
	public void InMoney(double x) {		
		
		this.Saldo += x;
		System.out.println("+ R$"+ x);
	}
	
	public void OutMoney(double y) {		
		
		
		/*if(this.Saldo <= this.LimiteEmprestimo || this.ControlEmprestimo <= this.LimiteEmprestimo) { */
			this.Saldo -= y;
			System.out.println("- R$"+ y);
		//}
	//	else System.out.println("Sem recursos no momento, solicite um emprestimo. Opção 11.");
		
	}
	
	public void SolicitaEmprestimo(double y, int x) {
		
		
	switch(x) {
		case 1: //Solicita;			
			if(y <= this.LimiteEmprestimo && y > 0.0) {	
					this.InMoney(y);
					this.ControlEmprestimo += y;
					this.MoneyTerc = true;
					this.EmpAtivo = this.MoneyTerc;
			}
			else {
				
				System.out.println("Você atingiu seu limite de Crédito: R$"+this.LimiteEmprestimo+"\n. Solicite mais crédito na opção 11.");				
			}
					
			break;
		case 2: // Abate parcialmente;
			
			if(( this.ControlEmprestimo - y) == 0 ) {
					
				this.OutMoney(this.ControlEmprestimo);					
				this.ControlEmprestimo = 0.0;
				System.out.println("Situação de Empréstimo atual: R$"+ this.ControlEmprestimo +"\n");
				this.MoneyTerc = false;
				this.EmpAtivo = this.MoneyTerc;
			}
			else if((this.ControlEmprestimo -y) < 0) {		
						
				this.OutMoney(this.ControlEmprestimo);//quita emprestimo
				System.out.println("Valor de Amortização superior ao Crédito ativo.\n Será debitado7 apenas o valor devido.R$"+ (this.ControlEmprestimo));
			//	if( this.ControlEmprestimo > 0.0) {
				//	System.out.println("Devolução de excedentes: R$"+ (y - this.ControlEmprestimo));
				//	this.InMoney(y - this.ControlEmprestimo);//estorna valor excedente;
			//	}
				
				this.ControlEmprestimo = 0.0;
				if(this.ControlEmprestimo == 0) {
					this.MoneyTerc = false;
					this.EmpAtivo = this.MoneyTerc;
				}
				
				System.out.println("Situação de Empréstimo atual: R$"+ this.ControlEmprestimo +"\n");
				
			}		
			
			else if((this.ControlEmprestimo -y)> 0) {	
				
				this.ControlEmprestimo -= y;				
				
				this.OutMoney(y);//abate emprestimo
				
				System.out.println("Situação de Empréstimo atual: R$"+ this.ControlEmprestimo +"\n");
				if(this.ControlEmprestimo == 0) {
					this.MoneyTerc = false;
					this.EmpAtivo = this.MoneyTerc;
				}
			}
			break;
		case 3:
			System.out.println("Situação de Empréstimo atual: R$"+ this.ControlEmprestimo +"\n Saldo atual é:" + this.Saldo);
			if(this.ControlEmprestimo > 0.0) {
				
				this.MoneyTerc = true;
				this.EmpAtivo = this.MoneyTerc;
			}
			break;
	}
	
	}
	
	public void OpenGarage() {		
				
		System.out.println("Garagem aberta!");
	}
	
	public  void CloseGarage() {
		
		System.out.println("Garagem Fechada!");
	}
	
	public  void PintarCasa() {
		
		System.out.println(this.Color);
	}
	
	public boolean BillingExpense(int q) {		
		
		if( q == 1) {
				
			this.Quitado = this.CheckHipoteca();
		
		}
				
		else if(q == 2) {
			
			this.Quitado = this.CheckLuz();
		}
				
		
	return this.Quitado;
		
	}
	
	private boolean CheckHipoteca() {
		
		if (this.ValueHipo != 0) {
			
			System.out.println("Fatura de Hipoteca em aberto no valor de: R$"+ this.ValueHipo);
			this.OutMoney(this.ValueHipo);
			this.ValueHipo = 0.0;	
		
			return true;
		}
		
		System.out.println("Fatura de Hipoteca em dia: R$"+ this.ValueHipo);
		
	return false;
		
	}
	
private boolean CheckLuz() {
		
		if (this.ValueLuz != 0) {
			
			System.out.println("Fatura de Luz em aberto no valor de: R$"+ this.ValueLuz);
			this.OutMoney(this.ValueLuz);
			this.ValueLuz = 0.0;	
		
			return true;
		}
		
		System.out.println("Fatura de Luz em dia: R$"+ this.ValueLuz);
		
	return false;
		
	}
		
	
}
