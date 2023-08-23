package br.com.testecrja.gerenciamentotarefas.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pessoas")
public class Pessoas {

	private Long id;
	private String nome;
	private String Departemento;
	private String ListaDeTarefas;

	public Pessoas() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartemento() {
		return Departemento;
	}

	public void setDepartemento(String departemento) {
		Departemento = departemento;
	}

	public String getListaDeTarefas() {
		return ListaDeTarefas;
	}

	public void setListaDeTarefas(String listaDeTarefas) {
		ListaDeTarefas = listaDeTarefas;
	}

}
