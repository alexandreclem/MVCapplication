package model;

import java.io.Serializable;

public class Cliente extends Pessoa implements ICliente, Serializable
{		
	private static final long serialVersionUID = -7092201510522989830L;
	
	private boolean platinum = false;

	public Cliente(long cpf, String nome, long telefone, Endereco endereco)
	{
		super(cpf, nome, telefone, endereco);
	}

	public void setPlatinum(boolean platinum) {
		this.platinum = platinum;
	}

	@Override
	public boolean isPlatinum() {		
		return platinum;
	}
	
	@Override
	public String toString() {
		return  "CPF: " + getCPF() + "\nNome: " + getNome()
				+ "\nTelefone: " + getTelefone() + "\nEmail: " + getEmail() + "\n~Endereco~\n" + getEndereco().toString() + "Platinum: " + platinum
				+ "\n";
	}

}