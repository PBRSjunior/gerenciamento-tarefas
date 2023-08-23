package br.com.testecrja.gerenciamentotarefas.entidades;

public class Tarefa {

	private Long id;
	private String Titulo;
	private String Descricao;
	private String Prazo;
	private String Departamento;
	private String Duracao;
	private String PessoaAlocada;
	private String Finalizado;

	private Pessoas pessoas;

	public Tarefa() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getPrazo() {
		return Prazo;
	}

	public void setPrazo(String prazo) {
		Prazo = prazo;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	public String getDuracao() {
		return Duracao;
	}

	public void setDuracao(String duracao) {
		Duracao = duracao;
	}

	public String getPessoaAlocada() {
		return PessoaAlocada;
	}

	public void setPessoaAlocada(String pessoaAlocada) {
		PessoaAlocada = pessoaAlocada;
	}

	public String getFinalizado() {
		return Finalizado;
	}

	public void setFinalizado(String finalizacao) {
		Finalizado = finalizacao;
	}

	public Pessoas getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoas pessoas) {
		this.pessoas = pessoas;
	}

}
