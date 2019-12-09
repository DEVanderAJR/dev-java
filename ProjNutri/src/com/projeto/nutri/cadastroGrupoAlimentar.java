
package com.projeto.nutri;

/**
 * @author DEVANDER
 *
 */
public class cadastroGrupoAlimentar extends cadastroClientes  {
	

	private int grupoAlimentar; //1 - CARBO, 2 - PROTEINA, 3 - GORDURAS
	private String nomeAlimento = "";
	private double porcao = 0.0;
	private double kal = 0.0;
	private double kalTotal = kalTotal();
	private double totKalimentos = 0; //total calorias dos alimentos relacionados;
	private int positionGrupo = 0;
		
/*
* CONSTRUTOR
 * */
public cadastroGrupoAlimentar() {	
	// System.out.println("Combinando Melhor dieta...");
	}

/*
 * ENCAPSULAMENTO
 * */
public void SetArrayList(cadastroGrupoAlimentar grupo) {
	
	//salvarListaGrupoAlimentar(grupo);	
}



public cadastroGrupoAlimentar GetArrayList() {
	
	//this.exibirListaGrupoAlimentar();
	
	return null;
		
}

public void SetgrupoAlimentar(int grupoAlimentar) {
	this.grupoAlimentar = grupoAlimentar;
}
public int GetgrupoAlimentar() {
		return this.grupoAlimentar;
}

public void SetnomeAlimento(String nomeAlimento) {
	this.nomeAlimento = nomeAlimento;
}
public String GetnomeAlimento() {
		return this.nomeAlimento;
}

public void Setporcao(Double porcao) {
	this.porcao = porcao;
}
public Double Getporcao() {
		return this.porcao;
}

public void SetpositionGrupo(int positionGrupo) {
		this.positionGrupo = positionGrupo;
}
public int GetpositionGrupo() {
		return this.positionGrupo;
}

public void Setkal(Double kal) {
		this.kal = kal;
}
public Double Getkal() {
		return this.kal;
}

public Double kalTotal() {
	
		return this.kal * this.porcao;
	
}

public void SettotKalimentos(double totKalimentos) {	
	
	this.totKalimentos = totKalimentos;		
}

public double GettotKalimentos() {		
		
	return this.totKalimentos;
		
}

}
