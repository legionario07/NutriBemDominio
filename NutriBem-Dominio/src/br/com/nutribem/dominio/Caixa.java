package br.com.nutribem.dominio;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class Caixa extends EntidadeDominio{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal valor;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	private String identificacao;
	
	public Caixa(Long id, BigDecimal valor, Date data, String identificacao){
		this(valor, data);
		this.setId(id);
		this.setIdentificacao(identificacao);
		
	}
	
	public Caixa(BigDecimal valor, Date data){
		this();
		this.valor = valor;
		this.data = data;
	}
	
	public Caixa(){
		
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificao) {
		this.identificacao = identificao;
	}

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {

		StringBuilder retorno = new StringBuilder();
		retorno.append("Id - ");
		retorno.append(this.getId());
		retorno.append("\tValor - ");
		retorno.append(this.getValor());
		retorno.append("\nData - ");
		retorno.append(this.getData());
		
		return retorno.toString();
	}
}
