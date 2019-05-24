package com.aulajava.heranca;

public class Helicoptero extends Veiculos {

/*Atributos especificos
 * */
	
private int QtdHelices = 0;
private Double AlturaMaxVoo = 0.0;
private Double AlturaMinVoo = 0.0;

/*
 * Construtor
 * */
public Helicoptero() {	
 this.SetNome("Helicoptero A280");
 this.SetTipo("Aéreo");
 this.SetCor("Branco");
 this.SetQtdTripulantes(4);
 this.SetTamanho(10.0);
 this.SetPeso(700.00);
 this.SetTipoCombustivel("Disel");
 this.SetPotencia(30000.00);
 this.SetVelocidadeHora(150.00);
 System.out.println(this.GetNome());
}

public void SetQtdHelices(int Qtd) {
	this.QtdHelices = Qtd;
}
public int GetQtdHelices() {
	return this.QtdHelices;
}

public void SetAlturaMaxVoo(Double Amax) {
	this.AlturaMaxVoo = Amax;
}
public Double GetAlturaMaxVoo() {
	return this.AlturaMaxVoo;
}
public void SetAlturaMinVoo(Double Amin) {
	this.AlturaMinVoo = Amin;
}
public Double GetAlturaMinVoo() {
	return this.AlturaMinVoo;
}


/*sobreescrevendo método da classe super;
 * */ 
public void ChecarSeguranca() {
	super.ChecarSeguranca();
	System.out.println(this.GetNome() +" - OK!");
	}

public void Voar() {	
	this.Deslocar();
}

public void Pousar() {
	this.Parar();
	
}

}
