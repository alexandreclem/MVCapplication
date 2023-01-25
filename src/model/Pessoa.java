package model;

import java.io.Serializable;

public class Pessoa implements IPessoa, Serializable
{	
	private static final long serialVersionUID = 7579371636733354562L;
	
	private final long cpf;
	private String nome;
	private long telefone;
	private String email;
	private Endereco endereco;
	
	public Pessoa(long cpf, String nome, long telefone, Endereco endereco)
	{
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {	
		this.email = email;
	}

	@Override
	public long getCPF() {		
		return cpf;
	}

	@Override
	public String getNome() {		
		return nome;
	}

	@Override
	public long getTelefone() {		
		return telefone;
	}

	@Override
	public String getEmail() {		
		return email;
	}

	@Override
	public Endereco getEndereco() {		
		return endereco;
	}
}