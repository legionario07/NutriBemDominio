package br.com.nutribem.dominio;

import java.io.Serializable;
import java.util.Date;

import br.com.nutribem.dominio.enums.SexoType;

public class Colaborador extends EntidadeDominio implements Serializable{

	private static final long serialVersionUID = 1861577597606714720L;
	private String nome;
	private Date dataDeNascimento;
	private String cpf;
	private Boolean isAtivo;
	private SexoType sexo;
	private Endereco endereco;
	private Contato contato;
	private Usuario usuario;
	
	public Colaborador(Long id, String nome, Date dataDeNascimento, 
			String cpf, Boolean isAtivo, SexoType sexo, Endereco endereco, 
			Contato contato, Usuario usuario){
		
		this(sexo, endereco, contato, usuario);
		this.setId(id);
		this.setNome(nome);
		this.setDataDeNascimento(dataDeNascimento);
		this.setCpf(cpf);
		this.setIsAtivo(isAtivo);
	}
	
	public Colaborador(SexoType sexo, Endereco endereco, Contato contato, 
			Usuario usuario){
		
		this();
		this.setSexo(sexo);
		this.setEndereco(endereco);
		this.setContato(contato);
		this.setUsuario(usuario);
		
	}
	
	public Colaborador(){
		this.endereco = new Endereco();
		this.contato = new Contato();
		this.usuario = new Usuario();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Boolean getIsAtivo() {
		return isAtivo;
	}
	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	public SexoType getSexo() {
		return sexo;
	}
	public void setSexo(SexoType sexo) {
		this.sexo = sexo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public String toString() {

		StringBuilder retorno = new StringBuilder();
		retorno.append("\nId - ");
		retorno.append(this.getId());
		retorno.append("\nNome - ");
		retorno.append(getNome());
		retorno.append("\nData de Nascimento - ");
		retorno.append(getDataDeNascimento());
		retorno.append("\nCPF - ");
		retorno.append(getCpf());
		retorno.append("\nSexo - ");
		retorno.append(getSexo());
		retorno.append(getEndereco());
		retorno.append(getContato());
		retorno.append(getUsuario());
		retorno.append("\nAtivo - ");
		retorno.append(isAtivo);
		
		return retorno.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colaborador other = (Colaborador) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	
	
}