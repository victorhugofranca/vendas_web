package br.com.secomp.vendasweb;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cad_produto_especial")
@SequenceGenerator(name = "sq_cad_produto", allocationSize = 1)
public class Produto {

	private Integer idProduto;
	private String ativo;
	private String codigo;
	private String descricao;
	private BigDecimal valor;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_cad_produto")
	@Basic(optional = false)
	@Column(name = "id_produto")
	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	@Column(name = "sn_ativo")
	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	@Column(name = "ds_codigo")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "ds_descricao")
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "vl_preco")
	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
