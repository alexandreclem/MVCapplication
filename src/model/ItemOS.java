package model;

import java.io.Serializable;

public class ItemOS implements Serializable
{
	private static final long serialVersionUID = -4183296912431238591L;
	
	private int qtd;
	private double preco;
	private IItem item;

	public ItemOS(IItem item, int qtd)
	{
		this.item = item;
		this.qtd = qtd;
	}
	
	public ItemOS(IItem item, int qtd, double preco)
	{
		this.item = item;
		this.qtd = qtd;
		this.preco = preco;		
	}
	
	public ETipoItem getTipo()
	{
		return item.getTipo(); 
	}
	
	public int getQtde()
	{
		return qtd;
	}
	
	public void setQtde(int qtde)
	{
		qtd = qtde;
	}
	
	public double getPreco()
	{
		return preco;
	}
	

	public void setPreco(double preco)
	{
		this.preco = preco;
	}
	
	public double getTotalItem()
	{
		return qtd * preco;
		
	}

	public String listarItem()
	{
		return "Codigo: " + item.getCodigo() + " | Quantidade: " + qtd + "\n";
	}
}