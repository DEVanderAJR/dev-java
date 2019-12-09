/**
 * 
 */
package com.projeto.nutri;

/**
 * @author DEVANDER
 *
 */
public class cadastroClientes {

/*
 * ATRIBUTOS DE CLASSE
* */
	public  int     cod = 0;
	private String  nomeCliente = "";
	private String  enderecoCli = "";
	private String  telCli = "";
	private String  mailCli = "";
	private String  dataNasCliente = "";
/*
 * Construtor
 * */
public cadastroClientes() {	
	// System.out.println("Loading Clientes...");
	}

/*ENCAPSULAMENTO
 * */
public void Setcod(int cod) {
	this.cod = cod;
}
public int Getcod() {
		return this.cod;
}

public void SetnomeCliente(String Nome) {
	this.nomeCliente = Nome;
}
public String GetnomeCliente() {
		return this.nomeCliente;
}

public void SetenderecoCli(String enderecoCli) {
	this.enderecoCli = enderecoCli;
}
public String GetenderecoCli() {
		return this.enderecoCli;
}

public void SettelCli(String tel) {
	this.telCli = tel;
}
public String GettelCli() {
		return this.telCli;
}

public void SetmailCli(String mail) {
	this.mailCli = mail;
}
public String Getmail() {
		return this.mailCli;
}

public void SetdataNasCliente(String data) {
	this.dataNasCliente = data;
}
public String GetdataNasCliente() {
		return this.dataNasCliente;
}

/*MÉTODOS
 * */

public void cadastrarCliente(String nome,String ende, String tel, String mail, String dataN) {
		this.nomeCliente = nome;
		this.enderecoCli = ende;
		this.telCli = tel;
		this.mailCli = mail;
		this.dataNasCliente = dataN;
	}

public void exibirCliente() {		
	//A DEFINIR
}	

public void alterarCliente() {		
	//A DEFINIR
}	

public void excluirCliente() {		
	//A DEFINIR
	//NÃO É POSSÍVEL EXCLUIR CLIENTE SE EXISTE CONSULTA MARCADA PARA O MESMO
	//SERÁ ARMAZENADO UM HISTORICO DO CLIENTE, O MESMO SERÁ DELETADO APENAS DE FORMA LÓGICA;
}	
		
	
}
