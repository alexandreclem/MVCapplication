package model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Item implements IItem, Serializable
{
	private static final long serialVersionUID = 5046850914308832347L;
	
	private static int contadorCodigo = 1;
	private final ETipoItem tipo;
	private final int codigo;	
	private final String descricao;
	private double preco;

	public Item(ETipoItem tipo, String descricao)
	{
		this.codigo = contadorCodigo;
		Item.contadorCodigo++;
		this.tipo = tipo;		
		this.descricao = descricao;
	}
	
	public void setPreco(double preco)
	{
		this.preco = preco;
	}

	@Override
	public ETipoItem getTipo() {		
		return tipo;
	}

	@Override
	public int getCodigo() {		
		return codigo;
	}

	@Override
	public String getDescricao() {		
		return descricao;
	}

	@Override
	public double getPreco() {		
		return preco;
	}	

	@Override
	public String toString() {
		return "Tipo: " + tipo + "\nCodigo: " + codigo + "\nDescricao: " + descricao + "\nPreco: " + preco + "\n";
	}
	
	// Serializar o atributo estatico contadorCodigo
	private void writeObject(ObjectOutputStream obj) throws IOException {
		obj.defaultWriteObject();
		obj.writeObject(new Integer(contadorCodigo));
	}

	// Desserializar o atributo estatico contadorCodigo
	private void readObject(ObjectInputStream obj) throws ClassNotFoundException, IOException {
		obj.defaultReadObject();
		contadorCodigo = (Integer) obj.readObject();
	}	
}