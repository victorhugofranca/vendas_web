package br.com.secomp.vendasweb;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ProdutoAction {

	@PersistenceContext
	private EntityManager entityManager;

	public void criarProduto() {
		Produto produto = new Produto();
		produto.setAtivo("S");
		produto.setCodigo("001");
		produto.setDescricao("Sabão em pó");
		produto.setValor(BigDecimal.TEN);
	}

}
