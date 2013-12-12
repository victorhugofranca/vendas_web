package br.com.secomp.vendasweb;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Named("produtoAction")
public class ProdutoAction {

	private List<Produto> produtos;

	@PersistenceContext
	private EntityManager entityManager;

	private String descricao;

	public void criarProduto() {
		Produto produto = new Produto();
		produto.setAtivo("S");
		produto.setCodigo("001");
		produto.setDescricao(descricao);
		produto.setValor(BigDecimal.TEN);

		entityManager.persist(produto);

		String sql = new String("select produto from Produto produto");
		produtos = entityManager.createQuery(sql).getResultList();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
