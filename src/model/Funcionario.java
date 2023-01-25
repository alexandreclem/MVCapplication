package model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Funcionario extends Pessoa implements IFuncionario, Serializable
{	private static final long serialVersionUID = 4349137522485245674L;
	
	private static int contadorMatricula = 1;
	private final int matricula;

	public Funcionario(long cpf, String nome, long telefone, Endereco endereco)
	{
		super(cpf, nome, telefone, endereco);
		matricula = Funcionario.contadorMatricula;
		Funcionario.contadorMatricula++;
	}	

	@Override
	public int getMatricula() {
		// TODO Auto-generated method stub
		return matricula;
	}

	@Override
	public String toString() {
		return  "Matricula: " + matricula + "\nCPF: " + getCPF() + "\nNome: " + getNome()
				+ "\nTelefone: " + getTelefone() + "\nEmail: " + getEmail() + "\n~Endereco~\n" + getEndereco().toString();
	}
	
	// Serializar o atributo estatico contadorCodigo
	private void writeObject(ObjectOutputStream obj) throws IOException {
		obj.defaultWriteObject();
		obj.writeObject(new Integer(contadorMatricula));
	}

	// Desserializar o atributo estatico contadorCodigo
	private void readObject(ObjectInputStream obj) throws ClassNotFoundException, IOException {
		obj.defaultReadObject();
		contadorMatricula = (Integer) obj.readObject();
	}
}