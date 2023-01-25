package view;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

public class MenuView extends JFrame{

	public MenuView() {
		initialize();
	}

	private void initialize() {		
		setTitle("Menu");
		setBounds(65, 65, 400, 295);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblCatalogo = new JLabel("Catalogo");
		lblCatalogo.setForeground(Color.BLACK);
		lblCatalogo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCatalogo.setBounds(71, 31, 94, 18);
		getContentPane().add(lblCatalogo);
		
		JButton btnCatalogo = new JButton("OK");
		btnCatalogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionCatalogo();
			}
		});
		btnCatalogo.setBounds(227, 34, 75, 15);
		getContentPane().add(btnCatalogo);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setForeground(Color.BLACK);
		lblClientes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblClientes.setBounds(71, 71, 94, 18);
		getContentPane().add(lblClientes);
		
		JButton btnClientes = new JButton("OK");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionClientes();
			}
		});
		btnClientes.setBounds(227, 74, 75, 15);
		getContentPane().add(btnClientes);
		
		JLabel lblFuncionarios = new JLabel("Funcionarios");
		lblFuncionarios.setForeground(Color.BLACK);
		lblFuncionarios.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFuncionarios.setBounds(71, 111, 94, 18);
		getContentPane().add(lblFuncionarios);
		
		JButton btnFuncionarios = new JButton("OK");
		btnFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionFuncionarios();
			}
		});
		btnFuncionarios.setBounds(227, 114, 75, 15);
		getContentPane().add(btnFuncionarios);
		
		JLabel lblVeiculos = new JLabel("Veiculos");
		lblVeiculos.setForeground(Color.BLACK);
		lblVeiculos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVeiculos.setBounds(71, 155, 94, 18);
		getContentPane().add(lblVeiculos);
		
		JButton btnVeiculos = new JButton("OK");
		btnVeiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionVeiculos();
			}
		});
		btnVeiculos.setBounds(227, 158, 75, 15);
		getContentPane().add(btnVeiculos);
		
		JLabel lblOrdemServico = new JLabel("Ordens de Servico");
		lblOrdemServico.setForeground(Color.BLACK);
		lblOrdemServico.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOrdemServico.setBounds(71, 199, 111, 18);
		getContentPane().add(lblOrdemServico);
		
		JButton btnOrdemServico = new JButton("OK");
		btnOrdemServico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionOrdemServico();
			}
		});
		btnOrdemServico.setBounds(227, 202, 75, 15);
		getContentPane().add(btnOrdemServico);
	}	

	private void actionCatalogo()
	{
		CatalogoView categoriaView = new CatalogoView();
		categoriaView.setVisible(true);	
	}	

	private void actionClientes()
	{
		ClienteView clienteView = new ClienteView();
		clienteView.setVisible(true);	
	}
	
	private void actionFuncionarios()
	{
		FuncionarioView funcionarioView = new FuncionarioView();
		funcionarioView.setVisible(true);	
	}
	
	private void actionVeiculos()
	{
		VeiculoView veiculoView = new VeiculoView();
		veiculoView.setVisible(true);	
	}
	
	private void actionOrdemServico()
	{
		OrdemServicoView ordemservicoView = new OrdemServicoView();
		ordemservicoView.setVisible(true);	
	}
}
