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
	private Boolean Quitado = true;
	private Double Saldo = 0.0;
	private boolean MoneyTerc = false;
	private Double ControlEmprestimo = 0.0; 
	

/*
 * Comportamentos e m�todos
 * */
	
public void ConsultaMoney() {			
	
		System.out.println("Saldo: R$" + this.Saldo);
		
		if(this.ControlEmprestimo > 0.0) {
			System.out.println("Empr�stimo: R$" + this.ControlEmprestimo);
		}
	}
	
	
	public void InMoney(double x) {		
		
		this.Saldo += x;
		System.out.println("+ R$"+ x);
	}
	
	public void OutMoney(double y) {		
		
		while((this.Saldo <= y) && this.ControlEmprestimo <= this.LimiteEmprestimo) {
			
			this.SolicitaEmprestimo(100, 1);	
			this.MoneyTerc = true;
			this.EmpAtivo = this.MoneyTerc;			
						
		}	
		
		if(this.Saldo >= y) {
			this.Saldo -= y;
			System.out.println("- R$"+ y);
		}
		else System.out.println("Sem recursos no momento, solicite um emprestimo. Op��o 11.");
		
	}
	
	public void SolicitaEmprestimo(double y, int x) {
		
	switch(x) {
		case 1: //Solicita;			
			if(this.ControlEmprestimo <= this.LimiteEmprestimo) {	
					this.InMoney(y);
					this.ControlEmprestimo += y;
			}
			else {
				
				System.out.println("Voc� atingiu seu limite de Cr�dito: R$"+this.LimiteEmprestimo+"\n. Solicite mais cr�dito na op��o 11.");				
			}
					
			break;
		case 2: // Abate parcialmente;
			
			if(( this.ControlEmprestimo - y) == 0 ) {
					
				this.OutMoney(this.ControlEmprestimo);					
				this.ControlEmprestimo = 0.0;
				System.out.println("Situa��o de Empr�stimo atual: R$"+ this.ControlEmprestimo +"\n");
				this.MoneyTerc = false;
				this.EmpAtivo = this.MoneyTerc;
			}
			else if((this.ControlEmprestimo -y) < 0) {		
						
				this.OutMoney(this.ControlEmprestimo);//quita emprestimo
				
				if( this.ControlEmprestimo > 0.0) {
					System.out.println("Devolu��o de excedentes: R$"+ (y - this.ControlEmprestimo));
					this.InMoney(y - this.ControlEmprestimo);//estorna valor excedente;
				}
				
				this.ControlEmprestimo = 0.0;
				this.MoneyTerc = false;
				this.EmpAtivo = this.MoneyTerc;
				
				System.out.println("Situa��o de Empr�stimo atual: R$"+ this.ControlEmprestimo +"\n");
				
			}		
			
			else if((this.ControlEmprestimo -y)> 0) {	
				
				this.ControlEmprestimo -= y;				
				
				this.OutMoney(y);//abate emprestimo
				
				System.out.println("Situa��o de Empr�stimo atual: R$"+ this.ControlEmprestimo +"\n");
				this.MoneyTerc = false;
				this.EmpAtivo = this.MoneyTerc;
			}
			break;
		case 3:
			System.out.println("Situa��o de Empr�stimo atual: R$"+ this.ControlEmprestimo +"\n Saldo atual �:" + this.Saldo);
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
