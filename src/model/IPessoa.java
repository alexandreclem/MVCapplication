package model;

public interface IPessoa
{
	public long getCPF();
	public String getNome();
	public long getTelefone();
	public String getEmail();	
	public Endereco getEndereco();
}