package br.com.Produtos;

import br.com.cadastraProdutos.consultaProdutos;
import br.com.cadastraProdutos.produtos;

public class classePrincipal {
	public static void main(String[] args) throws Exception {
		consultaProdutos produto = new consultaProdutos();
		produto.addProdutos(new produtos("1", "arroz", 2.25, 1.25));
		produto.getListadeProdutos("1");
		System.out.println(produto);
	}
	
}
