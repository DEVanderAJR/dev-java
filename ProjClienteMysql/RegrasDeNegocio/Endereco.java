package RegrasDeNegocio;

public class Endereco {
	private String logradouro;
	private String bairro;
	private int numero;
	private String complemento;
	private String cidade;
	private String pais;
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCidade() {
		return cidade;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getPais() {
		return pais;
	}
	
}
