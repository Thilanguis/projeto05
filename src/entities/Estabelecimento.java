package entities;

public class Estabelecimento {

	private Integer idEstabeleciomento;
	private String nome;
	private String cnpj;

	public Estabelecimento() {
		// TODO Auto-generated constructor stub
	}

	public Estabelecimento(Integer idEstabeleciomento, String nome, String cnpj) {
		super();
		this.idEstabeleciomento = idEstabeleciomento;
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public Integer getIdEstabeleciomento() {
		return idEstabeleciomento;
	}

	public void setIdEstabeleciomento(Integer idEstabeleciomento) {
		this.idEstabeleciomento = idEstabeleciomento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Estabelecimento [idEstabeleciomento=" + idEstabeleciomento + ", nome=" + nome + ", cnpj=" + cnpj + "]";
	}

}