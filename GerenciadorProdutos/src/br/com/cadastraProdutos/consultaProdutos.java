package br.com.cadastraProdutos;

import java.util.ArrayList;


public class consultaProdutos extends produtos{
	
	
	public consultaProdutos() {
		super();
		// TODO Auto-generated constructor stub
	}

	private ArrayList<produtos> listadeProdutos = new ArrayList<produtos>();
	
	

	public produtos getListadeProdutos(String id) {
		
		for(produtos prod: listadeProdutos) {
			if(prod.getId().equals(id)) {
				return prod;
			}
		}
		return null;
	}

	public void addProdutos(produtos produto) throws Exception{
		for(produtos prod: listadeProdutos) {
			if(prod.getId().equals(produto.getId())) {
				throw new Exception("item"+produto.getId()+"já está cadastrado");
			}
		}
		listadeProdutos.add(produto);
		
	}

	

}
