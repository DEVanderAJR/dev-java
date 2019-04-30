package RegrasDeNegocio;
import java.sql.ResultSet;

import AcessoADados.*;
public class PessoaFisica extends Pessoa{

	private String cpf;

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	public static boolean alterar(String cpfantigo, String nome, String cpf, String logradouro, String bairro, String numero, String complemento,String cidade, String pais)
	{
		try {
			return Cliente.alterar(cpfantigo, nome, cpf, logradouro, bairro, numero, complemento, cidade, pais);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	public static boolean excluir(String cpf)
	{
		try {
			return Cliente.excluir(cpf);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public static ResultSet consultar(String cpf)
	{
		try {
			return Cliente.consultar(cpf);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean cadastrar(String nome, String cpf, String logradouro, String bairro, String numero, String complemento,String cidade, String pais)
	{
		this.setNome(nome);
		this.cpf = cpf;
		this.getEnd().setLogradouro(logradouro);
		this.getEnd().setBairro(bairro);
		this.getEnd().setNumero(Integer.parseInt(numero));
		this.getEnd().setCidade(cidade);
		this.getEnd().setComplemento(complemento);
		this.getEnd().setPais(pais);
		
		try {
			return Cliente.cadastrar(nome, cpf, logradouro, bairro, numero, complemento, cidade, pais);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
		
	}
}
