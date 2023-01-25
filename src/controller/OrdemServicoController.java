package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import model.IFuncionario;
import model.IItem;
import model.IVeiculo;
import model.OrdemServico;

public class OrdemServicoController implements Serializable{
	
	private static final long serialVersionUID = 5202641326644511337L;
	
	private Map<Integer, OrdemServico> oss = new TreeMap<>();
	
	public void criarOS(IVeiculo veiculo, int kmAtual, IFuncionario funcionario, String descricao)
	{
		OrdemServico os = new OrdemServico(veiculo, kmAtual);
		os.setConsultor(funcionario);
		os.setDescricao(descricao);
		oss.put(os.getNumero(), os);
		
		MainController.writeFile();					
	}
	
	public boolean rmvOS(int numero)
	{
		if (oss.containsKey(numero))
		{
			oss.remove(numero);
			MainController.writeFile();
			return true;
		}
		else
		{
			return false;
		}		
	}
	
	public StringBuilder getListarOSS()
	{		
		StringBuilder sb = new StringBuilder();
		
		int indice = 1;
		for (OrdemServico os: oss.values())
		{
			sb.append("(" + indice + ")\n" + os.listarOS() + "\n");
			++indice;
		}		
		return sb;	
	}		
	
	public List<String> getListarOSS2()
	{
		List<String> lista = new ArrayList<>();
		
		for (Integer os: oss.keySet())
		{
			lista.add("Numero: " + os + "\n");
		}		
		return lista;	
	}	

	public OrdemServico getOSEspecifica(int numero)
	{
		return oss.get(numero);		
	}	
	
	public boolean addItem(int numero, IItem item, int quantidade, double preco)
	{
		if (oss.containsKey(numero))
		{
			oss.get(numero).addItem(item, quantidade, preco);
			MainController.writeFile();
			return true;
		}
		else
		{
			return false;
		}		
	}
}
