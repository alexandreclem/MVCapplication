package model;

import java.io.Serializable;

public class Endereco implements Serializable
{
	private static final long serialVersionUID = 5482792275497570635L;
	
	private String logradouro;
	private int numero;
	private String bairro;
	private Cidade cidade;
	
	public Endereco(String logradouro, int numero, String bairro, Cidade cidade)
	{
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}	

	public String getLogradouro()
	{
		return logradouro; 
	}
	
	public void setLogradouro(String logradouro)
	{
		this.logradouro = logradouro;
	}

	public int getNumero()
	{
		return numero;
	}
	
	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public String getBairro()
	{
		return bairro;
	}
	
	public void setBairro(String bairro)
	{
		this.bairro = bairro;
	}

	public Cidade getCidade()
	{
		return cidade;
	}
	
	public void setCidade(Cidade cidade)
	{
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Logradouro: " + logradouro + "\nNumero: " + numero + "\nBairro: " + bairro + "\nCidade: " + cidade.getNome()
				+ "\n";
	}
}