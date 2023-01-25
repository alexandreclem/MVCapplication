package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import model.Cidade;
import model.Cliente;
import model.Endereco;
import model.Funcionario;
import model.ICliente;
import model.IFuncionario;

public class PessoaController implements Serializable{
	private static final long serialVersionUID = -4141163349231416730L;
	
	private Map<Long, ICliente> clientes = new TreeMap<>();
	private Map<Integer, IFuncionario> funcionarios = new TreeMap<>();
	
	public Endereco criarEndereco(String logradouro, int numero, String bairro, String nomeCidade, String UF)
	{
		Cidade cidade = new Cidade(nomeCidade, UF);		
		Endereco endereco = new Endereco(logradouro, numero, bairro, cidade);
		
		return endereco;
	}
	
	public void addCliente(long cpf, String nome, String email, long telefone, boolean platinum, Endereco endereco)
	{
		ICliente cliente = new Cliente(cpf, nome, telefone, endereco);		
		((Cliente)cliente).setEmail(email);
		((Cliente)cliente).setPlatinum(platinum);		
		
		clientes.put(cpf, cliente);
		MainController.writeFile(); 
	}	

	public void addFuncionario(long cpf, String nome, String email, long telefone, Endereco endereco)
	{
		IFuncionario funcionario = new Funcionario(cpf, nome, telefone, endereco);
		((Funcionario)funcionario).setEmail(email);
		
		funcionarios.put(((Funcionario)funcionario).getMatricula(), funcionario);
		MainController.writeFile();
	}
	
	public boolean rmvCliente(long cpf)
	{
		if (clientes.containsKey(cpf))
		{
			clientes.remove(cpf);
			MainController.writeFile();
			return true;
		}
		else
		{
			return false;
		}		
	}
	
	public boolean rmvFuncionario(int matricula)
	{
		if (funcionarios.containsKey(matricula))
		{
			funcionarios.remove(matricula);
			MainController.writeFile();
			return true;
		}
		else
		{
			return false;
		}			
	}	
	
	public StringBuilder getListarClientes()
	{		
		StringBuilder sb = new StringBuilder();
		
		int indice = 1;
		for (ICliente cliente: clientes.values())
		{
			sb.append("(" + indice + ")\n" + cliente.toString() + "\n");
			++indice;
		}		
		return sb;	
	}		

	public StringBuilder getListarFuncionarios()
	{
		StringBuilder sb = new StringBuilder();
		
		int indice = 1;
		for (IFuncionario funcionario: funcionarios.values())
		{
			sb.append("(" + indice + ")\n" + funcionario.toString() + "\n");
			++indice;
		}		
		return sb;	
	}	
	
	public List<String> getListarClientes2()
	{
		List<String> lista = new ArrayList<>();
		
		for (Long cliente: clientes.keySet())
		{
			lista.add("CPF: " + cliente + "\n");
		}		
		return lista;
	}		

	public List<String> getListarFuncionarios2()
	{
		List<String> lista = new ArrayList<>();
		
		for (Integer funcionario: funcionarios.keySet())
		{
			lista.add("Matricula: " + funcionario + "\n");
		}		
		return lista;
	}	

	public ICliente getClienteEspecifico(long cpf)
	{
		return clientes.get(cpf);		
	}	

	public IFuncionario getFuncionarioEspecifico(int matricula)
	{
		return funcionarios.get(matricula);		
	}
}
