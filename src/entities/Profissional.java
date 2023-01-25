package entities;

import java.util.List;

/*
 * Collections: São um conjunto de interfaces e classes do Java utilizadas para manipulação de coleções de objetos. As principais são:
 * 1 - List: Interface de Collections para implementação de listas de objetos. É o tipo de coleção mais utilizada no dia a dia.
 * 2 - Queue: Interface de Collections para implementação de FILAS de objetos. É o tipo de coleção utilizado parta regras de FIRST IN FIRST OUT (FIFO).
 * 3 - Set Interface de Collections para implementação de listas que não permitem valores repetidos. Em um Set não podemos adicionar objetos iguais, 
 * se um objeto é adicionado em uma collection set e depois tentamos adicionar outro igual este segundo é descartado.
 * 4 - Map Interface para armazenamento de dados utilizando coockies, sessão!
	CHAVE / VALOR, Exemplo:
	CHAVE | VALOR
	“CLI01” | “SERGIO DA SILVA”
	“CLI02” | “RODRIGO VARELA”
 */

public class Profissional {

	private Integer idProfissional;
	private String nome;
	private String telefone;
	private Estabelecimento estabelecimento;
	private List<Servico> servico;
//	private Map<Integer, Servico> servico;
//	private Queue<Servico> servico;
//	private Set<Servico> servico;
//	private Servico[] servico;

	public Profissional() {
		// TODO Auto-generated constructor stub
	}

	public Profissional(Integer idProfissional, String nome, String telefone, Estabelecimento estabelecimento,
			List<Servico> servico) {
		super();
		this.idProfissional = idProfissional;
		this.nome = nome;
		this.telefone = telefone;
		this.estabelecimento = estabelecimento;
		this.servico = servico;
	}

	public Integer getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Integer idProfissional) {
		this.idProfissional = idProfissional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public List<Servico> getServico() {
		return servico;
	}

	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}

	@Override
	public String toString() {
		return "Profissional [idProfissional=" + idProfissional + ", nome=" + nome + ", telefone=" + telefone
				+ ", estabelecimento=" + estabelecimento + ", servico=" + servico + "]";
	}

}