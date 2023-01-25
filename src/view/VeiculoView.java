package view;

import controller.PessoaController;
import controller.VeiculoController;
import controller.MainController;
import controller.OrdemServicoController;
import model.ICliente;
import model.Modelo;
import model.OrdemServico;

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


public class VeiculoView extends JFrame {

	private JPanel contentPane;
	private JTextField txtModelo;
	private JLabel lblChassi;
	private JLabel lblAno;
	private JLabel lblCor;
	private JTextField txtChassi;
	private JTextField txtAno;
	private JTextField txtCor;
	private JLabel lblCriarVeiculo;
	private JLabel lblListar;
	private JTextArea textListarVeiculos;
	private JLabel lblPlaca;
	private JLabel lblAddServico;
	private JLabel lblAdicionarServico1;
	private JLabel lblProprietario;
	private JComboBox<String> comboBoxProprietario;
	private JComboBox<String> comboBoxOrdemServico;
	private JLabel lblPlaca3;
	private JComboBox<String> comboBoxPlaca2;
	private JComboBox<String> comboBoxPlaca3;
	private JTextField txtPlaca;

	public VeiculoView() {
		setTitle("Veiculos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(180, 180, 743, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblModelo.setForeground(Color.BLACK);
		lblModelo.setBounds(10, 52, 50, 14);
		contentPane.add(lblModelo);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(91, 52, 168, 15);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		lblChassi = new JLabel("Chassi");
		lblChassi.setForeground(Color.BLACK);
		lblChassi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblChassi.setBounds(10, 77, 50, 14);
		contentPane.add(lblChassi);
		
		lblAno = new JLabel("Ano");
		lblAno.setForeground(Color.BLACK);
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAno.setBounds(10, 102, 50, 14);
		contentPane.add(lblAno);
		
		lblCor = new JLabel("Cor");
		lblCor.setForeground(Color.BLACK);
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCor.setBounds(10, 127, 50, 14);
		contentPane.add(lblCor);
		
		txtChassi = new JTextField();
		txtChassi.setColumns(10);
		txtChassi.setBounds(91, 78, 168, 15);
		contentPane.add(txtChassi);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		txtAno.setBounds(91, 102, 168, 15);
		contentPane.add(txtAno);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(91, 127, 168, 15);
		contentPane.add(txtCor);
		
		lblCriarVeiculo = new JLabel("Criar Veiculo");
		lblCriarVeiculo.setForeground(Color.BLACK);
		lblCriarVeiculo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCriarVeiculo.setBounds(10, 208, 79, 14);
		contentPane.add(lblCriarVeiculo);
		
		JButton btnCriarVeiculo = new JButton("OK");
		btnCriarVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionCriarVeiculo();
			}
		});
		btnCriarVeiculo.setBounds(91, 207, 168, 18);
		contentPane.add(btnCriarVeiculo);
		
		JScrollPane ListarVeiculos = new JScrollPane();
		ListarVeiculos.setBounds(307, 81, 358, 181);
		contentPane.add(ListarVeiculos);
		
		textListarVeiculos = new JTextArea();
		ListarVeiculos.setViewportView(textListarVeiculos);
		
		JLabel lblListarVeiculos = new JLabel("Listar Veiculos");
		lblListarVeiculos.setHorizontalAlignment(SwingConstants.TRAILING);
		lblListarVeiculos.setForeground(Color.BLACK);
		lblListarVeiculos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblListarVeiculos.setBounds(307, 52, 79, 14);
		contentPane.add(lblListarVeiculos);
		
		JButton btnListarVeiculos = new JButton("OK");
		btnListarVeiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListarVeiculos();
			}
		});
		btnListarVeiculos.setBounds(418, 51, 168, 18);
		contentPane.add(btnListarVeiculos);
		
		JLabel lblPlaca2 = new JLabel("Placa");
		lblPlaca2.setForeground(Color.BLACK);
		lblPlaca2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPlaca2.setBounds(10, 295, 71, 14);
		contentPane.add(lblPlaca2);
		
		JLabel lblRemoverVeiculo = new JLabel("Remover Veiculo");
		lblRemoverVeiculo.setForeground(Color.BLACK);
		lblRemoverVeiculo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRemoverVeiculo.setBounds(10, 321, 124, 20);
		contentPane.add(lblRemoverVeiculo);
		
		JButton btnRemoverVeiculo = new JButton("OK");
		btnRemoverVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionRemoverVeiculo();
			}
		});
		btnRemoverVeiculo.setBounds(118, 321, 141, 18);
		contentPane.add(btnRemoverVeiculo);
		
		JLabel lblCriar = new JLabel("- CRIAR -");
		lblCriar.setBounds(10, 11, 50, 14);
		contentPane.add(lblCriar);
		
		JLabel lblRemover = new JLabel("- REMOVER -");
		lblRemover.setBounds(10, 270, 71, 14);
		contentPane.add(lblRemover);
		
		lblListar = new JLabel("- LISTAR -");
		lblListar.setBounds(307, 11, 71, 14);
		contentPane.add(lblListar);
		
		lblPlaca = new JLabel("Placa");
		lblPlaca.setForeground(Color.BLACK);
		lblPlaca.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPlaca.setBounds(10, 154, 50, 14);
		contentPane.add(lblPlaca);
		
		lblAddServico = new JLabel("- ADICIONAR SERVICO -");
		lblAddServico.setBounds(10, 382, 138, 14);
		contentPane.add(lblAddServico);
		
		JLabel lblOrdemServico = new JLabel("Ordem de Servico");
		lblOrdemServico.setForeground(Color.BLACK);
		lblOrdemServico.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOrdemServico.setBounds(10, 439, 124, 14);
		contentPane.add(lblOrdemServico);
		
		lblAdicionarServico1 = new JLabel("Adicionar Servico");
		lblAdicionarServico1.setForeground(Color.BLACK);
		lblAdicionarServico1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdicionarServico1.setBounds(10, 463, 108, 20);
		contentPane.add(lblAdicionarServico1);
		
		lblProprietario = new JLabel("Proprietario");
		lblProprietario.setForeground(Color.BLACK);
		lblProprietario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblProprietario.setBounds(10, 179, 71, 14);
		contentPane.add(lblProprietario);
		
		comboBoxProprietario = new JComboBox<String>();
		comboBoxProprietario.setEditable(true);
		comboBoxProprietario.setBounds(91, 177, 168, 16);
		contentPane.add(comboBoxProprietario);		
		
		JButton btnAdicionarServico = new JButton("OK");
		btnAdicionarServico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionAdicionarServico();
			}
		});
		btnAdicionarServico.setBounds(118, 465, 141, 18);
		contentPane.add(btnAdicionarServico);
		
		comboBoxOrdemServico = new JComboBox<String>();
		comboBoxOrdemServico.setEditable(true);
		comboBoxOrdemServico.setBounds(118, 436, 141, 16);
		contentPane.add(comboBoxOrdemServico);
		
		lblPlaca3 = new JLabel("Placa");
		lblPlaca3.setForeground(Color.BLACK);
		lblPlaca3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPlaca3.setBounds(10, 414, 124, 14);
		contentPane.add(lblPlaca3);
		
		comboBoxPlaca2 = new JComboBox<String>();
		comboBoxPlaca2.setEditable(true);
		comboBoxPlaca2.setBounds(118, 295, 141, 16);
		contentPane.add(comboBoxPlaca2);
		
		comboBoxPlaca3 = new JComboBox<String>();
		comboBoxPlaca3.setEditable(true);
		comboBoxPlaca3.setBounds(117, 412, 142, 16);
		contentPane.add(comboBoxPlaca3);
		
		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		txtPlaca.setBounds(91, 154, 168, 15);
		contentPane.add(txtPlaca);
		
		// Iniciando as ComboBox
		renovarComboBox();
	}	
	
	public void actionComboBoxPlacas()
	{
		VeiculoController controllerVeiculo = MainController.getVeiculoController();
		List<String> lista = controllerVeiculo.getListarVeiculos2();
		comboBoxPlaca2.removeAllItems();
		comboBoxPlaca3.removeAllItems();
		comboBoxPlaca2.setSelectedItem("Selecionar Placa");
		comboBoxPlaca3.setSelectedItem("Selecionar Placa");
		for (int i = 0; i < lista.size(); ++i)
		{
			comboBoxPlaca2.addItem(lista.get(i));
			comboBoxPlaca3.addItem(lista.get(i));			
		}	
		
	}
	
	public void actionComboBoxProprietario()
	{
		PessoaController controllerPessoa = MainController.getPessoaController();
		List<String> lista = controllerPessoa.getListarClientes2();
		
		comboBoxProprietario.removeAllItems();		
		comboBoxProprietario.setSelectedItem("Selecionar Proprietario");
		for (int i = 0; i < lista.size(); ++i)
		{
			comboBoxProprietario.addItem(lista.get(i));
		}	
	}
	
	public void actionComboBoxOrdemServico()
	{
		OrdemServicoController controllerOS = MainController.getOrdemServicoController();
		List<String> lista = controllerOS.getListarOSS2();
		
		comboBoxOrdemServico.removeAllItems();		
		comboBoxOrdemServico.setSelectedItem("Selecionar Numero");
		for (int i = 0; i < lista.size(); ++i)
		{
			comboBoxOrdemServico.addItem(lista.get(i));
		}	
	}
	
	public void renovarComboBox()
	{
		actionComboBoxProprietario();
		actionComboBoxOrdemServico();
		actionComboBoxPlacas();
	}
	
	private void actionCriarVeiculo()
	{
		VeiculoController controllerVeiculo = MainController.getVeiculoController();		
		PessoaController controllerPessoa = MainController.getPessoaController();
		
		String nomeModelo = txtModelo.getText();
		Modelo modelo = controllerVeiculo.criarModelo(nomeModelo);
		
		ICliente proprietario;		
		String chassi = txtChassi.getText();
		String cor = txtCor.getText();
		String placa = txtPlaca.getText();
		int ano;
		long cpfCliente;
		
		try
		{
			ano = Integer.parseInt(txtAno.getText());
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Ano Invalido.");
			return;
		}	
		
		String cBoxProprietario = comboBoxProprietario.getSelectedItem().toString();
		if (cBoxProprietario.equals("Selecionar Proprietario"))
		{
			JOptionPane.showMessageDialog(null, "Selecione o Proprietario.");
			return;						
		}		
		String[] cb = cBoxProprietario.split(" ");
		
		cpfCliente = Long.valueOf(cb[1]);		
		proprietario = controllerPessoa.getClienteEspecifico(cpfCliente);
		controllerVeiculo.addVeiculo(modelo, chassi, ano, cor, placa, proprietario);		
		
		JOptionPane.showMessageDialog(null, "Veiculo Criado.");		
		renovarComboBox();
		limpar();		
	}
	
	private void actionRemoverVeiculo()
	{
		VeiculoController controllerVeiculo = MainController.getVeiculoController();
		
		String cBoxPlaca2 = comboBoxPlaca2.getSelectedItem().toString();
		if (cBoxPlaca2.equals("Selecionar Placa"))
		{
			JOptionPane.showMessageDialog(null, "Selecione a Placa.");
			return;						
		}		
		String[] cb = cBoxPlaca2.split(" ");			
		String placa = cb[1];
		
		boolean estado = controllerVeiculo.rmvVeiculo(placa);
		if (estado)
			JOptionPane.showMessageDialog(null, "Veiculo Removido.");
		else
			JOptionPane.showMessageDialog(null, "Veiculo Inexistente.");
		
		renovarComboBox();	
	}

	private void actionListarVeiculos()
	{
		VeiculoController controllerVeiculo = MainController.getVeiculoController();
		
		StringBuilder sb = controllerVeiculo.getListarVeiculos();
		
		textListarVeiculos.setText(sb.toString());	
		
		renovarComboBox();
	}
	
	public void actionAdicionarServico()
	{
		VeiculoController controllerVeiculo = MainController.getVeiculoController();
		OrdemServicoController controllerOS = MainController.getOrdemServicoController();
		
		String cBoxPlaca3 = comboBoxPlaca3.getSelectedItem().toString();
		if (cBoxPlaca3.equals("Selecionar Placa"))
		{
			JOptionPane.showMessageDialog(null, "Selecione a Placa.");
			return;						
		}		
		String[] cb = cBoxPlaca3.split(" ");			
		String placa = cb[1];
		
		OrdemServico servico;
		int numeroOS;
		
		String cBoxOrdemServico = comboBoxOrdemServico.getSelectedItem().toString();
		if (cBoxOrdemServico.equals("Selecionar Numero"))
		{
			JOptionPane.showMessageDialog(null, "Selecione a OS.");
			return;						
		}		
		cb = cBoxOrdemServico.split(" ");			
		numeroOS = Integer.parseInt(cb[1]);		
		
		servico = controllerOS.getOSEspecifica(numeroOS);
		
		boolean estado = controllerVeiculo.addServico(placa, servico);
		
		if (estado)
			JOptionPane.showMessageDialog(null, "Servico Adicionado.");
		else
			JOptionPane.showMessageDialog(null, "Veiculo Inexistente.");
		
		renovarComboBox();		
	}
	
	private void limpar() {
		txtModelo.setText("");
		txtChassi.setText("");
		txtAno.setText("");
		txtCor.setText("");
		txtPlaca.setText("");
	}
}
