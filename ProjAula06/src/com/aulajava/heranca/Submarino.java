package com.aulajava.heranca;

public class Submarino extends Veiculos {
	
/*Atributos
 * */
/*Construtores
 * */
public Submarino() {
	 this.SetNome("SUB-CIVIL-0109");
	 this.SetTipo("Maritimo");
	 this.SetCor("Verde Oliva");
	 this.SetQtdTripulantes(40);
	 this.SetTamanho(80.00);
	 this.SetPeso(10000.00);
	 this.SetTipoCombustivel("Outros");
	 this.SetPotencia(20000.00);
	 this.SetVelocidadeHora(30.00);
	 System.out.println(this.GetNome());
	
	
	
}
/*Getters e Setters
 * */
/*Métodos
 * */
public void Submergir() {
	this.Deslocar();
	
}

public void Emergir() {
	this.Parar();
}

}