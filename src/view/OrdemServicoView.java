package view;

import controller.PessoaController;
import controller.VeiculoController;
import controller.CatalogoController;
import controller.MainController;
import controller.OrdemServicoController;
import model.IFuncionario;
import model.IItem;
import model.IVeiculo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class OrdemServicoView extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescricao;
	private JLabel lblKmAtual;
	private JTextField txtQuilometragem;
	private JLabel lblCriarOS;
	private JLabel lblListar;
	private JTextArea textListarOS;
	private JComboBox<String> comboBoxNumero;
	private JComboBox<String> comboBoxVeiculo;
	private JComboBox<String> comboBoxConsultor;
	private JLabel lblVeiculo;
	private JLabel lblConsultor;
	private JLabel lblAdicionarI;
	private JLabel lblOS2;
	private JComboBox<String> comboBoxNumero2;
	private JLabel lblItem;
	private JComboBox<String> comboBoxItem;
	private JLabel lblQuantidade;
	private JTextField txtQuantidade;
	private JButton btnAdicionarItem;
	private JLabel lblAdicionarItem;

	public OrdemServicoView() {
		setTitle("Ordens de Servico");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(180, 180, 743, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescricao = new JLabel("Descricao");
		lblDescricao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDescricao.setForeground(Color.BLACK);
		lblDescricao.setBounds(10, 52, 71, 14);
		contentPane.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(111, 52, 168, 15);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		lblKmAtual = new JLabel("Quilometragem");
		lblKmAtual.setForeground(Color.BLACK);
		lblKmAtual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKmAtual.setBounds(10, 79, 99, 14);
		contentPane.add(lblKmAtual);
		
		txtQuilometragem = new JTextField();
		txtQuilometragem.setColumns(10);
		txtQuilometragem.setBounds(111, 79, 168, 15);
		contentPane.add(txtQuilometragem);
		
		lblCriarOS = new JLabel("Criar OS");
		lblCriarOS.setForeground(Color.BLACK);
		lblCriarOS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCriarOS.setBounds(10, 166, 79, 14);
		contentPane.add(lblCriarOS);
		
		JButton btnCriarOS = new JButton("OK");
		btnCriarOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionCriarOS();
			}
		});
		btnCriarOS.setBounds(111, 164, 168, 20);
		contentPane.add(btnCriarOS);
		
		JScrollPane ListarOS = new JScrollPane();
		ListarOS.setBounds(307, 81, 358, 181);
		contentPane.add(ListarOS);
		
		textListarOS = new JTextArea();
		ListarOS.setViewportView(textListarOS);
		
		JLabel lblListarOS = new JLabel("Listar Ordens de Servico");
		lblListarOS.setHorizontalAlignment(SwingConstants.TRAILING);
		lblListarOS.setForeground(Color.BLACK);
		lblListarOS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblListarOS.setBounds(253, 52, 186, 14);
		contentPane.add(lblListarOS);
		
		JButton btnListarClientes = new JButton("OK");
		btnListarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListarOS();
			}
		});
		btnListarClientes.setBounds(497, 51, 168, 18);
		contentPane.add(btnListarClientes);
		
		JLabel lblOS = new JLabel("Ordem de Servico");
		lblOS.setForeground(Color.BLACK);
		lblOS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOS.setBounds(10, 287, 113, 14);
		contentPane.add(lblOS);
		
		JLabel lblRemoverOS = new JLabel("Remover OS");
		lblRemoverOS.setForeground(Color.BLACK);
		lblRemoverOS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRemoverOS.setBounds(10, 312, 89, 20);
		contentPane.add(lblRemoverOS);
		
		JButton btnRemoverOS = new JButton("OK");
		btnRemoverOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionRemoverOS();
			}
		});
		btnRemoverOS.setBounds(124, 313, 155, 20);
		contentPane.add(btnRemoverOS);
		
		JLabel lblCriar = new JLabel("- CRIAR -");
		lblCriar.setBounds(10, 27, 50, 14);
		contentPane.add(lblCriar);
		
		JLabel lblRemover = new JLabel("- REMOVER -");
		lblRemover.setBounds(10, 262, 71, 14);
		contentPane.add(lblRemover);
		
		lblListar = new JLabel("- LISTAR -");
		lblListar.setBounds(309, 27, 71, 14);
		contentPane.add(lblListar);
		
		comboBoxNumero = new JComboBox<String>();
		comboBoxNumero.setEditable(true);
		comboBoxNumero.setBounds(124, 286, 155, 19);
		contentPane.add(comboBoxNumero);
		
		comboBoxVeiculo = new JComboBox<String>();
		comboBoxVeiculo.setEditable(true);
		comboBoxVeiculo.setBounds(111, 109, 168, 16);
		contentPane.add(comboBoxVeiculo);
		
		comboBoxConsultor = new JComboBox<String>();
		comboBoxConsultor.setEditable(true);
		comboBoxConsultor.setBounds(111, 136, 168, 16);
		contentPane.add(comboBoxConsultor);
		
		lblVeiculo = new JLabel("Veiculo");
		lblVeiculo.setForeground(Color.BLACK);
		lblVeiculo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVeiculo.setBounds(10, 108, 71, 14);
		contentPane.add(lblVeiculo);
		
		lblConsultor = new JLabel("Consultor");
		lblConsultor.setForeground(Color.BLACK);
		lblConsultor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblConsultor.setBounds(10, 136, 71, 14);
		contentPane.add(lblConsultor);
		
		lblAdicionarI = new JLabel("- ADICIONAR ITEM -");
		lblAdicionarI.setBounds(10, 383, 113, 14);
		contentPane.add(lblAdicionarI);
		
		lblOS2 = new JLabel("Ordem de Servico");
		lblOS2.setForeground(Color.BLACK);
		lblOS2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOS2.setBounds(10, 412, 113, 14);
		contentPane.add(lblOS2);
		
		comboBoxNumero2 = new JComboBox<String>();
		comboBoxNumero2.setEditable(true);
		comboBoxNumero2.setBounds(124, 411, 155, 16);
		contentPane.add(comboBoxNumero2);
		
		lblItem = new JLabel("Item");
		lblItem.setForeground(Color.BLACK);
		lblItem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblItem.setBounds(10, 439, 71, 14);
		contentPane.add(lblItem);
		
		comboBoxItem = new JComboBox<String>();
		comboBoxItem.setEditable(true);
		comboBoxItem.setBounds(124, 439, 155, 16);
		contentPane.add(comboBoxItem);
		
		lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setForeground(Color.BLACK);
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuantidade.setBounds(10, 470, 71, 14);
		contentPane.add(lblQuantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setColumns(10);
		txtQuantidade.setBounds(124, 470, 155, 15);
		contentPane.add(txtQuantidade);
		
		btnAdicionarItem = new JButton("OK");
		btnAdicionarItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionAdicionarItem();
			}
		});
		btnAdicionarItem.setBounds(124, 496, 155, 20);
		contentPane.add(btnAdicionarItem);
		
		lblAdicionarItem = new JLabel("Adicionar Item");
		lblAdicionarItem.setForeground(Color.BLACK);
		lblAdicionarItem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdicionarItem.setBounds(10, 495, 89, 20);
		contentPane.add(lblAdicionarItem);
		
		// Iniciando as ComboBox
		renovarComboBox();
	} 
	
	public void actionComboBoxNumero()
	{
		OrdemServicoController controllerOS = MainController.getOrdemServicoController();
		List<String> lista = controllerOS.getListarOSS2();
		
		comboBoxNumero.removeAllItems();		
		comboBoxNumero.setSelectedItem("Selecionar Numero");	
		comboBoxNumero2.removeAllItems();		
		comboBoxNumero2.setSelectedItem("Selecionar Numero");	
		for (int i = 0; i < lista.size(); ++i)
		{
			comboBoxNumero.addItem(lista.get(i));			
			comboBoxNumero2.addItem(lista.get(i));
		}			
	}
	
	public void actionComboBoxVeiculo()
	{
		VeiculoController controllerVeiculo = MainController.getVeiculoController();
		List<String> lista = controllerVeiculo.getListarVeiculos2();
		
		comboBoxVeiculo.removeAllItems();		
		comboBoxVeiculo.setSelectedItem("Selecionar Placa");		
		for (int i = 0; i < lista.size(); ++i)
		{
			comboBoxVeiculo.addItem(lista.get(i));			
		}	
		
	}
	
	public void actionComboBoxConsultor()
	{
		PessoaController controllerPessoa = MainController.getPessoaController();
		List<String> lista = controllerPessoa.getListarFuncionarios2();
		
		comboBoxConsultor.removeAllItems();
		comboBoxConsultor.setSelectedItem("Selecionar Matricula");		
		for (int i = 0; i < lista.size(); ++i)
		{
			comboBoxConsultor.addItem(lista.get(i));			
		}	
	}
	
	public void actionComboBoxItem()
	{
		CatalogoController controllerCatalogo = MainController.getCatalogoController();
		List<String> lista = controllerCatalogo.getListarItens2();
		
		comboBoxItem.removeAllItems();
		comboBoxItem.setSelectedItem("Selecionar Codigo");		
		for (int i = 0; i < lista.size(); ++i)
		{
			comboBoxItem.addItem(lista.get(i));			
		}		
	}	

	public void renovarComboBox()
	{
		actionComboBoxNumero();
		actionComboBoxVeiculo();
		actionComboBoxConsultor();
		actionComboBoxItem();
	}
	
	private void actionCriarOS()
	{
		OrdemServicoController osController = MainController.getOrdemServicoController();
		VeiculoController veiculoController = MainController.getVeiculoController();
		PessoaController pessoaController = MainController.getPessoaController();
		
		String descricao = txtDescricao.getText();
		int kmAtual;
		IVeiculo veiculo;
		IFuncionario consultor;
		String placa;
		int matricula;
		
		try
		{
			kmAtual = Integer.parseInt(txtQuilometragem.getText());
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Quilometragem Invalida.");
			return;
		}	
		
		String cBoxVeiculo = comboBoxVeiculo.getSelectedItem().toString();
		if (cBoxVeiculo.equals("Selecionar Placa"))
		{
			JOptionPane.showMessageDialog(null, "Selecione o Veiculo.");
			return;						
		}		
		String[] cb = cBoxVeiculo.split(" ");		
		placa = cb[1];
		
		veiculo = veiculoController.getVeiculoEspecifico(placa);
		
		String cBoxConsultor = comboBoxConsultor.getSelectedItem().toString();
		if (cBoxConsultor.equals("Selecionar Matricula"))
		{
			JOptionPane.showMessageDialog(null, "Selecione o Consultor.");
			return;						
		}		
		cb = cBoxConsultor.split(" ");	
		matricula = Integer.valueOf(cb[1]);	
		
		veiculo = veiculoController.getVeiculoEspecifico(placa);
		consultor = pessoaController.getFuncionarioEspecifico(matricula);		
		
		osController.criarOS(veiculo, kmAtual, consultor, descricao);
		
		JOptionPane.showMessageDialog(null, "OS Criada.");
		renovarComboBox();	
		limpar();	
	}
	
	private void actionRemoverOS()
	{	
		OrdemServicoController osController = MainController.getOrdemServicoController();
		
		String cBoxNumero = comboBoxNumero.getSelectedItem().toString();
		if (cBoxNumero.equals("Selecionar Numero"))
		{
			JOptionPane.showMessageDialog(null, "Selecione a Ordem de Servico.");
			return;						
		}		
		String[] cb = cBoxNumero.split(" ");	
		int numero = Integer.valueOf(cb[1]);			
		
		boolean estado = osController.rmvOS(numero);
		if (estado)
			JOptionPane.showMessageDialog(null, "OS Removida.");
		else
			JOptionPane.showMessageDialog(null, "OS Inexistente.");
		
		
		limpar();
		renovarComboBox();		
	}
	
	private void actionAdicionarItem()
	{
		OrdemServicoController osController = MainController.getOrdemServicoController();
		CatalogoController catalogoController = MainController.getCatalogoController();
		
		String cBoxNumero2 = comboBoxNumero2.getSelectedItem().toString();
		if (cBoxNumero2.equals("Selecionar Numero"))
		{
			JOptionPane.showMessageDialog(null, "Selecione a Ordem de Servico.");
			return;						
		}		
		String[] cb = cBoxNumero2.split(" ");	
		int numero = Integer.valueOf(cb[1]);
		
		String cBoxItem = comboBoxItem.getSelectedItem().toString();
		if (cBoxNumero2.equals("Selecionar Codigo"))
		{
			JOptionPane.showMessageDialog(null, "Selecione o Item.");
			return;						
		}		
		cb = cBoxItem.split(" ");	
		int codigo = Integer.valueOf(cb[1]);
		
		int quantidade;	
		try
		{
			quantidade = Integer.parseInt(txtQuantidade.getText());
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Quantidade Invalida.");
			return;
		}	
		
		IItem item = catalogoController.getItemEspecifico(codigo);
		double preco = item.getPreco();
		boolean estado = osController.addItem(numero, item, quantidade, preco);
		if (estado)
			JOptionPane.showMessageDialog(null, "Item Adicionado.");
		else
			JOptionPane.showMessageDialog(null, "OS Inexistente.");		
		
		limpar2();
		renovarComboBox();
	}

	private void actionListarOS()
	{
		OrdemServicoController osController = MainController.getOrdemServicoController();
		
		StringBuilder sb = osController.getListarOSS();
		
		textListarOS.setText(sb.toString());	
		
		renovarComboBox();	
	}
	
	private void limpar() {
		txtDescricao.setText("");
		txtQuilometragem.setText("");		
	}
	
	private void limpar2() {
		txtQuantidade.setText("");		
	}
	
}
