package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import model.Categoria;
import model.ETipoItem;
import model.IItem;
import model.Item;

public class CatalogoController implements Serializable {

	private static final long serialVersionUID = -2676384335563218170L;
	
	private Map<String, Categoria> categorias = new TreeMap<>();
	private Map<Integer, IItem> itens = new TreeMap<>();

	public void addCategoria(String nomeCategoria) {

		categorias.put(nomeCategoria, new Categoria(nomeCategoria));
		MainController.writeFile();
	}
	
	public void addItem(String nomeCategoria, ETipoItem tipo, String descricao, double preco)
	{
		Categoria categoria = categorias.get(nomeCategoria);
		IItem item = new Item(tipo, descricao);
		((Item)item).setPreco(preco);
		categoria.addItem(item);		
		itens.put(item.getCodigo(), item);
		
		MainController.writeFile();		
	}
	
	public boolean rmvCategoria(String nomeCategoria)
	{
		if (categorias.containsKey(nomeCategoria))
		{					
			int[] codigos = categorias.get(nomeCategoria).getCodigosItens();
			
			for (int i = 0; i < codigos.length; ++i)
			{
				itens.remove(codigos[i]);
			}
			categorias.remove(nomeCategoria);
			MainController.writeFile();
			return true;
		}
		else
		{
			return false;
		}		
	}
	
	public boolean rmvItem(int codigo)
	{
		if (itens.containsKey(codigo))
		{				
			for (Categoria categoria: categorias.values())
			{
				if (categoria.verificarItem(codigo))
				{
					categoria.removeItem(itens.get(codigo));
				}				
			}	
			itens.remove(codigo);
			MainController.writeFile();
			return true;
		}
		else
		{
			return false;
		}	
	}

	public StringBuilder getListarCategorias()
	{		
		StringBuilder sb = new StringBuilder();
		
		int indice = 1;
		for (Categoria categoria: categorias.values())
		{
			sb.append("(" + indice + ")\n" + categoria.toString() + "\n");
			++indice;
		}		
		return sb;	
	}	
	
	public StringBuilder getListarItens()
	{		
		StringBuilder sb = new StringBuilder();
		
		int indice = 1;
		for (IItem item: itens.values())
		{
			sb.append("(" + indice + ")\n" + item.toString() + "\n");
			++indice;
		}		
		return sb;	
	}	
	
	public List<String> getListarCategorias2()
	{
		List<String> lista = new ArrayList<>();
		
		for (String categoria: categorias.keySet())
		{
			lista.add("Nome: " + categoria + "\n");
		}		
		return lista;	
	}	
	
	public List<String> getListarItens2()
	{
		List<String> lista = new ArrayList<>();
		
		for (Integer item: itens.keySet())
		{
			lista.add("Codigo: " + item + "\n");
		}		
		return lista;	
	}	
	
	public IItem getItemEspecifico(int codigo)
	{
		return itens.get(codigo);		
	}	
}
