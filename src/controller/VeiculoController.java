package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import model.ICliente;
import model.IVeiculo;
import model.Modelo;
import model.OrdemServico;
import model.Veiculo;

public class VeiculoController implements Serializable{
	private static final long serialVersionUID = -4141163349231416730L;
	
	private Map<String, IVeiculo> veiculos = new TreeMap<>();
	
	public Modelo criarModelo(String nomeModelo)
	{
		Modelo modelo = new Modelo(nomeModelo);		
		return modelo;		
	}
	
	public void addVeiculo(Modelo modelo, String chassi, int ano, String cor, String placa, ICliente proprietario)
	{
		IVeiculo veiculo = new Veiculo(modelo, chassi, ano, cor, placa);		
		((Veiculo)veiculo).setProprietario(proprietario);
		
		veiculos.put(placa, veiculo);		
		MainController.writeFile();
	}
	
	public boolean rmvVeiculo(String placa)
	{
		if (veiculos.containsKey(placa))
		{
			veiculos.remove(placa);
			MainController.writeFile();
			return true;
		}
		else
		{
			return false;
		}		
	}
	
	public StringBuilder getListarVeiculos()
	{		
		StringBuilder sb = new StringBuilder();
		
		int indice = 1;
		for (IVeiculo veiculo: veiculos.values())
		{
			sb.append("(" + indice + ")\n" + veiculo.toString() + "\n");
			++indice;
		}		
		return sb;	
	}		
	
	public List<String> getListarVeiculos2()
	{
		List<String> lista = new ArrayList<>();
		
		for (String veiculo: veiculos.keySet())
		{
			lista.add("Placa: " + veiculo + "\n");
		}		
		return lista;	
	}	

	public IVeiculo getVeiculoEspecifico(String placa)
	{
		return veiculos.get(placa);		
	}	
	
	public boolean addServico(String placa, OrdemServico os)
	{
		if (veiculos.containsKey(placa))
		{
			((Veiculo)(veiculos.get(placa))).adicionarServico(os);
			MainController.writeFile();
			return true;
		}
		else
		{
			return false;
		}		
	}
}
