package RegrasDeNegocio;

public abstract class Pessoa {

	private Endereco end = new Endereco();
	private String nome;
	private int id;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public int getId() {
		return id;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	public Endereco getEnd() {
		return end;
	}
	
}
