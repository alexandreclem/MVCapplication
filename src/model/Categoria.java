package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Categoria implements Serializable
{
	private static final long serialVersionUID = -6528521190278988462L;
	
	private final String nome;
	private ArrayList<IItem> itens = new ArrayList<IItem>();


	public Categoria(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void addItem(IItem item)
	{
		itens.add(item);
	}
	
	public void removeItem(IItem item)
	{
		itens.remove(item);
	}
	
	public boolean verificarItem(int codigo)
	{
		for (int i = 0; i < itens.size(); ++i)
		{
			if (((Item)itens.get(i)).getCodigo() == codigo)
			{
				return true;
			}			
		}
		return false;		
	}
	

	public int[] getCodigosItens()
	{
		int[] codigos = new int[itens.size()];
		
		for (int i = 0; i < itens.size(); ++i)
		{
			codigos[i] = ((Item)itens.get(i)).getCodigo();			
		}
		return codigos;
	}
	
	public StringBuilder listarItens()
	{
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < itens.size(); ++i)
		{
			sb.append("Codigo: " + ((Item)itens.get(i)).getCodigo() + "\n");					
		}
		return sb;
	}

	@Override
	public String toString() {
		return "Categoria: " + nome + "\n~Itens~\n" + listarItens();
	}	
}