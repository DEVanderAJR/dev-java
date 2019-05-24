package com.aulajava.heranca;

public class Carro extends Veiculos{

/*Atributos
 * */
private int QtdRodas = 0;
private String TipoMotor = "";
private String TecnologiaCambio ="";
private String TipoTracao = "";

	
/*Construtor
 * */
public Carro() {
	 this.SetNome("Honda Civic");
	 this.SetTipo("Terrestre");
	 this.SetCor("Prata");
	 this.SetQtdTripulantes(6);
	 this.SetTamanho(6.0);
	 this.SetPeso(300.00);
	 this.SetTipoCombustivel("Flex");
	 this.SetPotencia(1500.00);
	 this.SetVelocidadeHora(15.00);
	 System.out.println(this.GetNome());
	
}


/*Getters e Setters
 * */

public void SetQtdRodas(int Qtd) {
	this.QtdRodas = Qtd;
	
}

public int GetQtdRodas() {
	return this.QtdRodas;
	
}

public void SetTipoMotor(String TpMotor) {
	this.TipoMotor = TpMotor;
	
}


public String GetTipoMotor() {
	return this.TipoMotor;
	
}

public void SetTecnologiaCambio(String TecCam) {
	this.TecnologiaCambio = TecCam;	
	
}

public String GetTecnologiaCambio() {
	return this.TecnologiaCambio;
}

public void SetTipoTracao(String TpTracao) {
	this.TipoTracao = TpTracao;
}

public String GetTipoTracao() {
	return this.TipoTracao;
}
	
/*Métodos
 * */

public void ChecarSeguranca() {
	super.ChecarSeguranca();
	System.out.println(this.GetNome() +" - OK!");
	}

public void Arrancar() {
	this.Deslocar();
	
}

public void Estacionar() {
	this.Parar();
	
}


	
	
}
