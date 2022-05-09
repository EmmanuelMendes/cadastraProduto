package br.com.cadastraProdutos;

public class produtos {
	private String id;
	private String descricao;
	private double valor;
	private double imposto;
	
	public produtos(String id, String descricao, double valor, double imposto) {
		this.setId(id);
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setImposto(imposto);
		
	}
	public produtos() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

}
