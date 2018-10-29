package com.concessionaria.domain;

public class Venda {
	private int id;
	private String nome;
	private String cpf;
	private Carro placa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Carro getPlaca() {
		return placa;
	}

	public void setPlaca(Carro placa) {
		this.placa = placa;
	}

}
