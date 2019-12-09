package com.projeto.nutri;

/**
 * @author DEVANDER
 *
 */
public class consultas extends cadastroClientes {
	
	
	private String  dataAgen = "";
	private String  horarioAge = "";
	private double  pesoCli = 0.0;
	private double	altura = 0.0;
	private double  gorduraCorp =0.0;
	private String  sensacaoAtual = "";
	private String  restricaoAlimen="";
	private double  metaCalorica = 0.0;
	
/*
 * Construtor
 * */
public consultas() {	
	// System.out.println("Loading Consultas...");
	}

/*ENCAPSULAMENTO
 * */
public void SetdataAgen(String dataAgen) {
	this.dataAgen = dataAgen;
}
public String GetdataAgen() {
		return this.dataAgen;
}

public void SethorarioAge(String horarioAge) {

	this.horarioAge = horarioAge;
}
public String GethorarioAge() {
return this.horarioAge;
}

public void Setaltura(double altura) {
	this.altura = altura;
}
public double Getaltura() {
		return this.altura;
}

public void SetpesoCli(double pesoCli) {
	this.pesoCli = pesoCli;
}
public double GetpesoCli() {
		return this.pesoCli;
}

public void SetgorduraCorp(double gorduraCorp) {
	this.gorduraCorp = gorduraCorp;
}
public double GetgorduraCorp() {
return this.gorduraCorp;
}

public void SetsensacaoAtual(String sensacaoAtual) {
	this.sensacaoAtual = sensacaoAtual;
}
public String GetsensacaoAtual() {
		return this.sensacaoAtual;
}

public void SetrestricaoAlimen(String restricaoAlimen) {
	this.restricaoAlimen = restricaoAlimen;
}
public String GetrestricaoAlimen() {
		return this.restricaoAlimen;
}

public void SetmetaCalorica(double metaCalorica) {
	this.metaCalorica = metaCalorica;
}
public double GetmetaCalorica() {
		return this.metaCalorica;
}
}

/*MÉTODOS
 * */
