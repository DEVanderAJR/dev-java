package com.aulajava.heranca;

public class Veiculos {
	
/*
* Defini��o de atributos da super classe ve�culo
* 
* */
private String Nome = "";
private String Tipo = "";
private String Cor ="";
private String TipoCombustivel = "";
private int QtdTripulantes = 0;
private Double Tamanho = 0.0;
private Double Peso = 0.0;
private Double Potencia = 0.0;
private Double VelocidadeHora = 0.0;

/*
 * Defini��o do Construtor da super Classe
 * 
 */

public Veiculos () {
	
	System.out.println("Classe Ve�culos");
	
}

/*
 * Defini��o de Getters e Setters
 * 
 * */

public void SetNome(String Nome) {
	this.Nome = Nome;	
}

public String GetNome() {

	return this.Nome;
	
}

public void SetTipo(String Tipo) {
	this.Tipo = Tipo;	
}

public String GetTipo() {
	
	return this.Tipo;
	
}

public void SetCor(String Cor) {
	this.Cor = Cor;	
}

public String GetCor() {
	
	return this.Cor;
	
}

public void SetTipoCombustivel(String TipoCombustivel) {
	this.TipoCombustivel = TipoCombustivel;	
}

public String GetTipoCombustivel() {
	
	return this.TipoCombustivel;
	
}

public void SetQtdTripulantes(int QtdTripulantes) {
	this.QtdTripulantes = QtdTripulantes;	
}

public int GetQtdTripulantes() {
	
	return this.QtdTripulantes;
	
}


public void SetTamanho(Double Tamanho) {
	this.Tamanho = Tamanho;	
}

public Double GetTamanho() {
	
	return this.Tamanho;
	
}

public void SetPeso(Double Peso) {
	this.Peso = Peso;	
}

public Double GetPeso() {
	
	return this.Peso;
	
}

public void SetPotencia(Double Potencia) {
	this.Potencia = Potencia;	
}

public Double GetPotencia() {
	
	return this.Potencia;
	
}

public void SetVelocidadeHora(Double VelocidadeHora) {
	this.VelocidadeHora = VelocidadeHora;	
}

public Double GetVelocidadeHora() {
	
	return this.VelocidadeHora;
	
}

	
/* Defini��o de m�todos da super classe ve�culo
* 
*/
public void Deslocar() {
	
	System.out.println("Iniciando trajeto. Ve�culo em movimento.");
	
}

public void Parar() {
	
	System.out.println("Fim do trajeto. Ve�culo em repouso.");
	
}

public void Abastecer() {
	
	System.out.println("Ve�culo abastecido.");
}

public void ChecarSeguranca() {
	
	System.out.println("Ve�culo em manuten��o.");
	
}
			
	

}
