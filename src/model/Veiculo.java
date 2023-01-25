package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Veiculo implements IVeiculo, Serializable
{
	private static final long serialVersionUID = -628633089098644395L;
	
	private final String chassi;
	private final int ano;
	private String cor;
	private String placa;	
	private Modelo modelo;
	private ICliente proprietario;		
	ArrayList<OrdemServico> servicos = new ArrayList<OrdemServico>();

	public Veiculo(Modelo modelo, String chassi, int ano, String cor)
	{
		this.modelo = modelo;
		this.chassi = chassi;
		this.ano = ano;
		this.cor = cor;
	}

	public Veiculo(Modelo modelo, String chassi, int ano, String cor, String placa)
	{
		this.modelo = modelo;
		this.chassi = chassi;
		this.ano = ano;
		this.cor = cor;
		this.placa = placa; 
	}
	
	public void setCor(String cor)
	{
		this.cor = cor;
	}
	
	public void setPlaca(String placa)
	{
		this.placa = placa;
	}
	
	public void setProprietario(ICliente cliente)
	{
		this.proprietario = cliente;		
	}
	
	public void adicionarServico(OrdemServico os)
	{
		servicos.add(os);
	}

	public StringBuilder listarServicos()
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < servicos.size(); ++i)
		{
			sb.append("OS n°: " + servicos.get(i).getNumero() + "\n");
			
		}
		return sb;
	}

	@Override
	public Modelo getModelo() {		
		return modelo;
	}

	@Override
	public String getChassi() {		
		return chassi;
	}

	@Override
	public int getAno() {		
		return ano;
	}

	@Override
	public String getCor() {		
		return cor;
	}

	@Override
	public String getPlaca() {		
		return placa;
	}

	@Override
	public ICliente getProprietario() {		
		return proprietario;
	}	

	@Override
	public String toString() {
		return "Chassi: " + chassi + "\nAno: " + ano + "\nCor: " + cor + "\nPlaca: " + placa + "\nModelo: " + modelo.getNome()
				+ "\nProprietario(CPF): " + proprietario.getCPF() + "\n~Servicos~\n" + listarServicos();
	}
}