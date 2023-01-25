package model;

import java.util.Date;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;  
import java.util.ArrayList;

public class OrdemServico implements Serializable
{
	private static final long serialVersionUID = 8793043115503745299L;
	
	private static int contadorNumero = 1;
	private final int numero;
	private final Date data;
	private String descricao;
	private int kmAtual;
	private IVeiculo veiculo;
	private ICliente cliente;	
	private IFuncionario consultor;	
	private ArrayList<ItemOS> itens = new ArrayList<ItemOS>();

	public OrdemServico(IVeiculo veiculo, int kmAtual)
	{
		this.numero = contadorNumero;
		OrdemServico.contadorNumero++;
		Date data = new Date();
		this.data = data;
		this.kmAtual = kmAtual;
		this.veiculo = veiculo;		
		this.cliente = this.veiculo.getProprietario();	
	}

	public int getNumero()
	{
		return numero;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao; 
	}

	public int getKmAtual() {
		return kmAtual;
	}

	public void setKmAtual(int kmAtual) {
		this.kmAtual = kmAtual;
	}

	public IFuncionario getConsultor() {
		return consultor;
	}

	public void setConsultor(IFuncionario consultor) {
		this.consultor = consultor;
	}

	public IVeiculo getVeiculo() {
		return veiculo;
	}
	
	public ICliente getCliente() {
		return cliente;
	}
		
	public void addItem(IItem item, int qtd)
	{
		ItemOS itemOS = new ItemOS(item, qtd);
		itens.add(itemOS);	
	}
	
	public void addItem(IItem item, int qtd, double preco)
	{
		ItemOS itemOS = new ItemOS(item, qtd, preco);
		itens.add(itemOS);
	}
	
	public void removeItem(int index)
	{
		itens.remove(index);
	}
	
	public double getTotalServicos()
	{
		double total = 0;
		for (int i =0; i < itens.size(); ++i)
		{
			if (itens.get(i).getTipo() == ETipoItem.SERVICO)
			{
				total += itens.get(i).getTotalItem();
			}
		}
		return total;
	}	

	public double getTotalPecas()
	{
		double total = 0;
		for (int i =0; i < itens.size(); ++i)
		{
			if (itens.get(i).getTipo() == ETipoItem.PECA)
			{
				total += itens.get(i).getTotalItem();
			}
		}
		return total;
	}
	
	public double getTotalOS()
	{
		return getTotalServicos() + getTotalPecas();
	}	
	
	public StringBuilder listarOS()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Numero: " + numero + "\n");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sb.append("Data: " + sdf.format(data) + "\n");
		sb.append("Descricao: " + descricao + "\n");
		sb.append("Quilometragem: " + getKmAtual() + "\n");
		sb.append("Consultor(Matricula): " + getConsultor().getMatricula() + "\n");
		sb.append("Veiculo(Placa): " + getVeiculo().getPlaca() + "\n");
		sb.append("Proprietario(CPF): " + getCliente().getCPF() + "\n");
		sb.append("Total Servicos: " + getTotalServicos() + "\n");
		sb.append("Total Pecas: " + getTotalPecas() + "\n");
		sb.append("Total da OS: " + getTotalOS() + "\n");		
		sb.append("~Itens~\n");
		for (int i = 0; i < itens.size(); ++i)
		{
			sb.append(itens.get(i).listarItem());
		}
		
		return sb;		
	}
	
	// Serializar o atributo estatico contadorCodigo
	private void writeObject(ObjectOutputStream obj) throws IOException {
		obj.defaultWriteObject();
		obj.writeObject(new Integer(contadorNumero));
	}

	// Desserializar o atributo estatico contadorCodigo
	private void readObject(ObjectInputStream obj) throws ClassNotFoundException, IOException {
		obj.defaultReadObject();
		contadorNumero = (Integer) obj.readObject();
	}
}