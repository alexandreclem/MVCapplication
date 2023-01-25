package view;

import controller.PessoaController;
import controller.MainController;
import model.Endereco;
import model.EmailException;
import java.util.regex.Pattern;

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

public class ClienteView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JLabel lblEmail;
	private JLabel lblTelefone;
	private JLabel lblCPF;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtCPF;
	private JLabel lblCriarCliente;
	private JLabel lblPlatinum;
	private JTextField txtPlatinum;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JLabel lblListar;
	private JLabel lblUF;
	private JTextField txtUF;
	private JTextArea textListarClientes;
	private JComboBox<String> comboBoxCPF;

	public ClienteView() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(180, 180, 743, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setForeground(Color.BLACK);
		lblNome.setBounds(10, 52, 50, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(91, 52, 168, 15);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(10, 77, 50, 14);
		contentPane.add(lblEmail);
		
		lblTelefone = new JLabel("Telefone");
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefone.setBounds(10, 102, 50, 14);
		contentPane.add(lblTelefone);
		
		lblCPF = new JLabel("CPF");
		lblCPF.setForeground(Color.BLACK);
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCPF.setBounds(10, 127, 50, 14);
		contentPane.add(lblCPF);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(91, 78, 168, 15);
		contentPane.add(txtEmail);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(91, 102, 168, 15);
		contentPane.add(txtTelefone);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(91, 127, 168, 15);
		contentPane.add(txtCPF);
		
		lblCriarCliente = new JLabel("Criar Cliente");
		lblCriarCliente.setForeground(Color.BLACK);
		lblCriarCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCriarCliente.setBounds(10, 302, 79, 14);
		contentPane.add(lblCriarCliente);
		
		JButton btnCriarCliente = new JButton("OK");
		btnCriarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionCriarCliente();
			}
		});
		btnCriarCliente.setBounds(91, 300, 168, 20);
		contentPane.add(btnCriarCliente);
		
		JScrollPane ListarClientes = new JScrollPane();
		ListarClientes.setBounds(307, 81, 358, 181);
		contentPane.add(ListarClientes);
		
		textListarClientes = new JTextArea();
		ListarClientes.setViewportView(textListarClientes);
		
		JLabel lblListarClientes = new JLabel("Listar Clientes");
		lblListarClientes.setHorizontalAlignment(SwingConstants.TRAILING);
		lblListarClientes.setForeground(Color.BLACK);
		lblListarClientes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblListarClientes.setBounds(301, 52, 79, 14);
		contentPane.add(lblListarClientes);
		
		JButton btnListarClientes = new JButton("OK");
		btnListarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListarClientes();
			}
		});
		btnListarClientes.setBounds(418, 51, 168, 18);
		contentPane.add(btnListarClientes);
		
		lblPlatinum = new JLabel("Platinum(S/N)");
		lblPlatinum.setForeground(Color.BLACK);
		lblPlatinum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPlatinum.setBounds(10, 152, 79, 14);
		contentPane.add(lblPlatinum);
		
		txtPlatinum = new JTextField();
		txtPlatinum.setColumns(10);
		txtPlatinum.setBounds(91, 153, 168, 15);
		contentPane.add(txtPlatinum);
		
		JLabel lblLogradouro = new JLabel("Logradouro");
		lblLogradouro.setForeground(Color.BLACK);
		lblLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLogradouro.setBounds(10, 177, 71, 14);
		contentPane.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(91, 177, 168, 15);
		contentPane.add(txtLogradouro);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setForeground(Color.BLACK);
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumero.setBounds(10, 202, 71, 14);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(91, 202, 168, 15);
		contentPane.add(txtNumero);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setForeground(Color.BLACK);
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairro.setBounds(10, 227, 71, 14);
		contentPane.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(91, 227, 168, 15);
		contentPane.add(txtBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setForeground(Color.BLACK);
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidade.setBounds(10, 252, 71, 14);
		contentPane.add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(91, 252, 168, 15);
		contentPane.add(txtCidade);
		
		JLabel lblCPF2 = new JLabel("CPF");
		lblCPF2.setForeground(Color.BLACK);
		lblCPF2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCPF2.setBounds(10, 414, 71, 14);
		contentPane.add(lblCPF2);
		
		JLabel lblRemoverCliente = new JLabel("Remover Cliente");
		lblRemoverCliente.setForeground(Color.BLACK);
		lblRemoverCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRemoverCliente.setBounds(10, 439, 89, 20);
		contentPane.add(lblRemoverCliente);
		
		JButton btnRemoverCliente = new JButton("OK");
		btnRemoverCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionRemoverCliente();
			}
		});
		btnRemoverCliente.setBounds(104, 440, 155, 20);
		contentPane.add(btnRemoverCliente);
		
		JLabel lblCriar = new JLabel("- CRIAR -");
		lblCriar.setBounds(10, 11, 50, 14);
		contentPane.add(lblCriar);
		
		JLabel lblRemover = new JLabel("- REMOVER -");
		lblRemover.setBounds(10, 377, 71, 14);
		contentPane.add(lblRemover);
		
		lblListar = new JLabel("- LISTAR -");
		lblListar.setBounds(307, 11, 71, 14);
		contentPane.add(lblListar);
		
		lblUF = new JLabel("UF");
		lblUF.setForeground(Color.BLACK);
		lblUF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUF.setBounds(10, 277, 71, 14);
		contentPane.add(lblUF);
		
		txtUF = new JTextField();
		txtUF.setColumns(10);
		txtUF.setBounds(91, 277, 168, 15);
		contentPane.add(txtUF);
		
		comboBoxCPF = new JComboBox<String>();
		comboBoxCPF.setEditable(true);
		comboBoxCPF.setBounds(104, 414, 155, 19);
		contentPane.add(comboBoxCPF);
		
		// Iniciando as ComboBox
		renovarComboBox();
	} 
	
	public void actionComboBoxCPF()
	{
		PessoaController controllerPessoa = MainController.getPessoaController();
		List<String> lista = controllerPessoa.getListarClientes2();
		comboBoxCPF.removeAllItems();
		comboBoxCPF.setSelectedItem("Selecionar CPF");		
		for (int i = 0; i < lista.size(); ++i)
		{
			comboBoxCPF.addItem(lista.get(i));			
		}	
	}
	
	public void renovarComboBox()
	{
		actionComboBoxCPF();
	}
	
	private void actionCriarCliente()
	{
		PessoaController controllerPessoa = MainController.getPessoaController();		
		
		// Dados do Cliente
		String nome = txtNome.getText();
		String email = txtEmail.getText();		
		long telefone;
		long cpf;
		String platinum = txtPlatinum.getText();	
		Endereco endereco;
		
		String emailRegex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(emailRegex);
		
		try
		{
			if (!pattern.matcher(email).matches())
			{
				throw new EmailException();
			}

		}
		catch(EmailException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
			return;
		}	
	
		try
		{
			telefone = Integer.parseInt(txtTelefone.getText());
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Telefone Invalido.");
			return;
		}
		
		try
		{
			cpf = Long.parseLong(txtCPF.getText());
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "CPF Invalido.");
			return;
		}		
		
		if (!platinum.equals("S") && !platinum.equals("N"))
		{
			JOptionPane.showMessageDialog(null, "Platinum Invalido. Digite 'S' se sim e 'N' se nao.");
			return;			
		}
		
		boolean plat;

	    if (platinum.equals("S"))
		{
			plat = true;
		}
		else
		{
			plat = false;
		}		
	    
	    // Dados do Endereco
		String nomeCidade = txtCidade.getText();
		String uf = txtUF.getText();
		String logradouro = txtLogradouro.getText();
		String bairro = txtBairro.getText();
		int numero;

		try
		{
			numero = Integer.parseInt(txtNumero.getText());
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Numero Invalido.");
			return;
		}		
		endereco = controllerPessoa.criarEndereco(logradouro, numero, bairro, nomeCidade, uf);
		
		controllerPessoa.addCliente(cpf, nome, email, telefone, plat, endereco);		
		JOptionPane.showMessageDialog(null, "Cliente Criado.");
		
		renovarComboBox();	
		limpar();	
	}
	
	private void actionRemoverCliente()
	{
		PessoaController controllerPessoa = MainController.getPessoaController();
		long cpf;	
		
		String cBoxCPF = comboBoxCPF.getSelectedItem().toString();
		if (cBoxCPF.equals("Selecionar CPF"))
		{
			JOptionPane.showMessageDialog(null, "Selecione o CPF.");
			return;						
		}		
		String[] cb = cBoxCPF.split(" ");		
		cpf = Long.parseLong(cb[1]);	
		
		boolean estado = controllerPessoa.rmvCliente(cpf);
		if (estado)
			JOptionPane.showMessageDialog(null, "Cliente Removido.");
		else
			JOptionPane.showMessageDialog(null, "Cliente Inexistente.");		
		
		renovarComboBox();		
	}

	private void actionListarClientes()
	{
		PessoaController controllerPessoa = MainController.getPessoaController();
		
		StringBuilder sb = controllerPessoa.getListarClientes();
		
		textListarClientes.setText(sb.toString());
		
		renovarComboBox();	
	}
	
	private void limpar() {
		txtNome.setText("");
		txtEmail.setText("");
		txtTelefone.setText("");
		txtCPF.setText("");
		txtPlatinum.setText("");
		txtLogradouro.setText("");
		txtNumero.setText("");
		txtBairro.setText("");
		txtCidade.setText("");
		txtUF.setText("");
	}
}
