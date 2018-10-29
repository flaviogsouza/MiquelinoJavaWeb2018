package com.concessionaria.domain;

public class Carro {
	
	private String placa;
	private String cor;
	private String modelo;
	private String ano;
	private Double preco;
	private Servico cod_servico;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Servico getCod_servico() {
		return cod_servico;
	}

	public void setCod_servico(Servico cod_servico) {
		this.cod_servico = cod_servico;
	}

}
