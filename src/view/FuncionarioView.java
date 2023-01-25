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

public class FuncionarioView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JLabel lblEmail;
	private JLabel lblTelefone;
	private JLabel lblCPF;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtCPF;
	private JLabel lblCriarFuncionario;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JLabel lblListar;
	private JLabel lblUF;
	private JTextField txtUF;
	private JTextArea textListarFuncionarios;
	private JComboBox<String> comboBoxMatricula;

	public FuncionarioView() {
		setTitle("Funcionarios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(180, 180, 743, 560);
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
		txtNome.setBounds(101, 52, 168, 15);
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
		txtEmail.setBounds(101, 77, 168, 15);
		contentPane.add(txtEmail);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(101, 102, 168, 15);
		contentPane.add(txtTelefone);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(101, 127, 168, 15);
		contentPane.add(txtCPF);
		
		lblCriarFuncionario = new JLabel("Criar Funcionario");
		lblCriarFuncionario.setForeground(Color.BLACK);
		lblCriarFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCriarFuncionario.setBounds(10, 286, 89, 14);
		contentPane.add(lblCriarFuncionario);
		
		JButton btnCriarFuncionario = new JButton("OK");
		btnCriarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionCriarFuncionario();
			}
		});
		btnCriarFuncionario.setBounds(101, 284, 168, 20);
		contentPane.add(btnCriarFuncionario);
		
		JScrollPane ListarFuncionarios = new JScrollPane();
		ListarFuncionarios.setBounds(307, 81, 358, 181);
		contentPane.add(ListarFuncionarios);
		
		textListarFuncionarios = new JTextArea();
		ListarFuncionarios.setViewportView(textListarFuncionarios);
		
		JLabel lblListarFuncionarios = new JLabel("Listar Funcionarios");
		lblListarFuncionarios.setHorizontalAlignment(SwingConstants.TRAILING);
		lblListarFuncionarios.setForeground(Color.BLACK);
		lblListarFuncionarios.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblListarFuncionarios.setBounds(301, 52, 107, 14);
		contentPane.add(lblListarFuncionarios);
		
		JButton btnListarFuncionarios = new JButton("OK");
		btnListarFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListarFuncionarios();
			}
		});
		btnListarFuncionarios.setBounds(418, 51, 168, 18);
		contentPane.add(btnListarFuncionarios);
		
		JLabel lblLogradouro = new JLabel("Logradouro");
		lblLogradouro.setForeground(Color.BLACK);
		lblLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLogradouro.setBounds(10, 152, 71, 14);
		contentPane.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(101, 152, 168, 15);
		contentPane.add(txtLogradouro);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setForeground(Color.BLACK);
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumero.setBounds(10, 177, 71, 14);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(101, 179, 168, 15);
		contentPane.add(txtNumero);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setForeground(Color.BLACK);
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairro.setBounds(10, 202, 71, 14);
		contentPane.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(101, 203, 168, 15);
		contentPane.add(txtBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setForeground(Color.BLACK);
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidade.setBounds(10, 227, 71, 14);
		contentPane.add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(101, 227, 168, 15);
		contentPane.add(txtCidade);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setForeground(Color.BLACK);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMatricula.setBounds(10, 399, 71, 14);
		contentPane.add(lblMatricula);
		
		JLabel lblRemoverFuncionario = new JLabel("Remover Funcionario");
		lblRemoverFuncionario.setForeground(Color.BLACK);
		lblRemoverFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRemoverFuncionario.setBounds(10, 424, 118, 20);
		contentPane.add(lblRemoverFuncionario);
		
		JButton btnRemoverFuncionario = new JButton("OK");
		btnRemoverFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionRemoverFuncionario();
			}
		});
		btnRemoverFuncionario.setBounds(127, 425, 142, 20);
		contentPane.add(btnRemoverFuncionario);
		
		JLabel lblCriar = new JLabel("- CRIAR -");
		lblCriar.setBounds(10, 11, 50, 14);
		contentPane.add(lblCriar);
		
		JLabel lblRemover = new JLabel("- REMOVER -");
		lblRemover.setBounds(10, 364, 71, 14);
		contentPane.add(lblRemover);
		
		lblListar = new JLabel("- LISTAR -");
		lblListar.setBounds(307, 11, 71, 14);
		contentPane.add(lblListar);
		
		lblUF = new JLabel("UF");
		lblUF.setForeground(Color.BLACK);
		lblUF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUF.setBounds(10, 252, 71, 14);
		contentPane.add(lblUF);
		
		txtUF = new JTextField();
		txtUF.setColumns(10);
		txtUF.setBounds(101, 253, 168, 15);
		contentPane.add(txtUF);
		
		comboBoxMatricula = new JComboBox<String>();
		comboBoxMatricula.setEditable(true);
		comboBoxMatricula.setBounds(127, 399, 142, 19);
		contentPane.add(comboBoxMatricula);
		
		// Iniciando as ComboBox
		renovarComboBox();
	}
	
	public void actionComboBoxMatricula()
	{
		PessoaController controllerPessoa = MainController.getPessoaController();
		List<String> lista = controllerPessoa.getListarFuncionarios2();
		comboBoxMatricula.removeAllItems();
		comboBoxMatricula.setSelectedItem("Selecionar Matricula");		
		for (int i = 0; i < lista.size(); ++i)
		{
			comboBoxMatricula.addItem(lista.get(i));			
		}	
	}
	
	public void renovarComboBox()
	{
		actionComboBoxMatricula();
	}
	
	private void actionCriarFuncionario()
	{
		PessoaController controllerFuncionario = MainController.getPessoaController();		
		
		// Dados do Funcionario
		String nome = txtNome.getText();
		String email = txtEmail.getText();		
		long telefone;
		long cpf;	
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
		endereco = controllerFuncionario.criarEndereco(logradouro, numero, bairro, nomeCidade, uf);
		
		controllerFuncionario.addFuncionario(cpf, nome, email, telefone, endereco);		
		JOptionPane.showMessageDialog(null, "Funcionario Criado.");
		
		renovarComboBox();	
		limpar();	
	}
	
	private void actionRemoverFuncionario()
	{
		PessoaController controllerPessoa = MainController.getPessoaController();
		int matricula;	
		
		String cBoxMatricula = comboBoxMatricula.getSelectedItem().toString();
		if (cBoxMatricula.equals("Selecionar Matricula"))
		{
			JOptionPane.showMessageDialog(null, "Selecione o Matricula.");
			return;						
		}		
		String[] cb = cBoxMatricula.split(" ");		
		matricula = Integer.parseInt(cb[1]);	
		
		boolean estado = controllerPessoa.rmvFuncionario(matricula);
		if (estado)
			JOptionPane.showMessageDialog(null, "Funcionario Removido.");
		else
			JOptionPane.showMessageDialog(null, "Funcionario Inexistente.");		
		
		renovarComboBox();		
	}

	private void actionListarFuncionarios()
	{
		PessoaController controllerFuncionario = MainController.getPessoaController();
		
		StringBuilder sb = controllerFuncionario.getListarFuncionarios();		
		textListarFuncionarios.setText(sb.toString());	
		renovarComboBox();	
	}
	
	private void limpar() {
		txtNome.setText("");
		txtEmail.setText("");
		txtTelefone.setText("");
		txtCPF.setText("");
		txtLogradouro.setText("");
		txtNumero.setText("");
		txtBairro.setText("");
		txtCidade.setText("");
		txtUF.setText("");
	}	
}
