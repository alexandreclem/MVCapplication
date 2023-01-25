package view;

import controller.CatalogoController;
import controller.MainController;
import model.ETipoItem;

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

public class CatalogoView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JLabel lblCriarCategoria;
	private JLabel lblListarC;
	private JTextArea textListarCategorias;
	private JTextArea textListarItens;
	private JTextField txtTipo;
	private JTextField txtDescricao;
	private JTextField txtPreco;
	private JComboBox<String> comboBoxCategoria;
	private JComboBox<String> comboBoxCategoria2;
	private JComboBox<String> comboBoxItem;
	

	public CatalogoView() {
		setTitle("Catalogo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(180, 180, 743, 640);
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
		txtNome.setBounds(101, 52, 172, 15);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lblCriarCategoria = new JLabel("Criar Categoria");
		lblCriarCategoria.setForeground(Color.BLACK);
		lblCriarCategoria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCriarCategoria.setBounds(10, 86, 79, 14);
		contentPane.add(lblCriarCategoria);
		
		JButton btnCriarCategoria = new JButton("OK");
		btnCriarCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionCriarCategoria();
			}
		});
		btnCriarCategoria.setBounds(101, 84, 172, 20);
		contentPane.add(btnCriarCategoria);
		
		JScrollPane ScrollPaneListarCategorias = new JScrollPane();
		ScrollPaneListarCategorias.setBounds(307, 81, 358, 181);
		contentPane.add(ScrollPaneListarCategorias);
		
		textListarCategorias = new JTextArea();
		ScrollPaneListarCategorias.setViewportView(textListarCategorias);
		
		JLabel lblListarCategorias = new JLabel("Listar Categorias");
		lblListarCategorias.setHorizontalAlignment(SwingConstants.TRAILING);
		lblListarCategorias.setForeground(Color.BLACK);
		lblListarCategorias.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblListarCategorias.setBounds(275, 52, 125, 14);
		contentPane.add(lblListarCategorias);
		
		JButton btnListarCategorias = new JButton("OK");
		btnListarCategorias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListarCategorias();
			}
		});
		btnListarCategorias.setBounds(442, 51, 168, 18);
		contentPane.add(btnListarCategorias);
		
		JLabel lblCategoria2 = new JLabel("Categoria");
		lblCategoria2.setForeground(Color.BLACK);
		lblCategoria2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCategoria2.setBounds(10, 400, 71, 14);
		contentPane.add(lblCategoria2);
		
		JLabel lblRemoverCategoria = new JLabel("Remover Categoria");
		lblRemoverCategoria.setForeground(Color.BLACK);
		lblRemoverCategoria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRemoverCategoria.setBounds(10, 425, 108, 20);
		contentPane.add(lblRemoverCategoria);
		
		JButton btnRemoverCategoria = new JButton("OK");
		btnRemoverCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionRemoverCategoria();
			}
		});
		btnRemoverCategoria.setBounds(122, 426, 151, 20);
		contentPane.add(btnRemoverCategoria);
		
		JLabel lblCriar = new JLabel("- CRIAR CATEGORIA -");
		lblCriar.setBounds(10, 11, 140, 14);
		contentPane.add(lblCriar);
		
		JLabel lblRemover2 = new JLabel("- REMOVER CATEGORIA -");
		lblRemover2.setBounds(10, 362, 150, 14);
		contentPane.add(lblRemover2);
		
		lblListarC = new JLabel("- LISTAR CATEGORIAS -");
		lblListarC.setBounds(307, 11, 151, 14);
		contentPane.add(lblListarC);
		
		JLabel lblRemover1 = new JLabel("- REMOVER ITEM -");
		lblRemover1.setBounds(10, 480, 156, 14);
		contentPane.add(lblRemover1);
		
		comboBoxCategoria2 = new JComboBox<String>();
		comboBoxCategoria2.setEditable(true);
		comboBoxCategoria2.setBounds(122, 399, 151, 19);
		contentPane.add(comboBoxCategoria2);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setForeground(Color.BLACK);
		lblItem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblItem.setBounds(10, 510, 71, 14);
		contentPane.add(lblItem);
		
		comboBoxItem = new JComboBox<String>();
		comboBoxItem.setEditable(true);
		comboBoxItem.setBounds(124, 505, 149, 19);
		contentPane.add(comboBoxItem);
		
		JLabel lblAdicionar = new JLabel("- ADICIONAR ITEM -");
		lblAdicionar.setBounds(10, 137, 140, 14);
		contentPane.add(lblAdicionar);
		
		JLabel lblRemoverItem = new JLabel("Remover Item");
		lblRemoverItem.setForeground(Color.BLACK);
		lblRemoverItem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRemoverItem.setBounds(10, 535, 108, 20);
		contentPane.add(lblRemoverItem);
		
		JButton btnRemoverItem = new JButton("OK");
		btnRemoverItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionRemoverItem();
			}
		});
		btnRemoverItem.setBounds(124, 535, 149, 20);
		contentPane.add(btnRemoverItem);
		
		JLabel lblTipo = new JLabel("Tipo(P/S)");
		lblTipo.setForeground(Color.BLACK);
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTipo.setBounds(10, 166, 71, 14);
		contentPane.add(lblTipo);
		
		txtTipo = new JTextField();
		txtTipo.setColumns(10);
		txtTipo.setBounds(101, 166, 172, 15);
		contentPane.add(txtTipo);
		
		JLabel lblDescricao = new JLabel("Descricao");
		lblDescricao.setForeground(Color.BLACK);
		lblDescricao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDescricao.setBounds(10, 198, 71, 14);
		contentPane.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(101, 198, 172, 15);
		contentPane.add(txtDescricao);
		
		JLabel lblPreco = new JLabel("Preco");
		lblPreco.setForeground(Color.BLACK);
		lblPreco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreco.setBounds(10, 231, 71, 14);
		contentPane.add(lblPreco);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(100, 231, 173, 15);
		contentPane.add(txtPreco);
		
		JLabel lblAdicionarItem = new JLabel("Adicionar Item");
		lblAdicionarItem.setForeground(Color.BLACK);
		lblAdicionarItem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdicionarItem.setBounds(10, 298, 80, 14);
		contentPane.add(lblAdicionarItem);
		
		JButton btnAdicionarItem = new JButton("OK");
		btnAdicionarItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionAdicionarItem();
			}
		});
		btnAdicionarItem.setBounds(101, 296, 172, 20);
		contentPane.add(btnAdicionarItem);
	
		comboBoxCategoria = new JComboBox<String>();
		comboBoxCategoria.setEditable(true);
		comboBoxCategoria.setBounds(101, 259, 172, 19);
		contentPane.add(comboBoxCategoria);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setForeground(Color.BLACK);
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCategoria.setBounds(10, 266, 71, 14);
		contentPane.add(lblCategoria);
		
		JLabel lblListarI = new JLabel("- LISTAR ITENS -");
		lblListarI.setBounds(317, 299, 151, 14);
		contentPane.add(lblListarI);
		
		JScrollPane scrollPaneListarItens = new JScrollPane();
		scrollPaneListarItens.setBounds(317, 360, 348, 181);
		contentPane.add(scrollPaneListarItens);
		
		textListarItens = new JTextArea();
		scrollPaneListarItens.setViewportView(textListarItens);
		
		JLabel lblListarItens = new JLabel("Listar Itens");
		lblListarItens.setHorizontalAlignment(SwingConstants.TRAILING);
		lblListarItens.setForeground(Color.BLACK);
		lblListarItens.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblListarItens.setBounds(260, 335, 125, 14);
		contentPane.add(lblListarItens);
		
		JButton btnListarItens = new JButton("OK");
		btnListarItens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListarItens();
			}
		});
		btnListarItens.setBounds(442, 331, 168, 18);
		contentPane.add(btnListarItens);
		
		// Iniciando as ComboBox
		renovarComboBox();
	} 
	
	public void actionComboBoxCategoria()
	{
		CatalogoController controllerCatalogo = MainController.getCatalogoController();
		List<String> lista = controllerCatalogo.getListarCategorias2();
		comboBoxCategoria.removeAllItems();
		comboBoxCategoria2.removeAllItems();
		comboBoxCategoria.setSelectedItem("Selecionar Categoria");
		comboBoxCategoria2.setSelectedItem("Selecionar Categoria");
		for (int i = 0; i < lista.size(); ++i)
		{
			comboBoxCategoria.addItem(lista.get(i));
			comboBoxCategoria2.addItem(lista.get(i));			
		}	
	}
	
	public void actionComboBoxItem()
	{
		CatalogoController controllerCatalogo = MainController.getCatalogoController();
		List<String> lista = controllerCatalogo.getListarItens2();
		comboBoxItem.removeAllItems();		
		comboBoxItem.setSelectedItem("Selecionar Item");
		for (int i = 0; i < lista.size(); ++i)
		{
			comboBoxItem.addItem(lista.get(i));			
		}			
	}
	
	public void renovarComboBox()
	{
		actionComboBoxCategoria();
		actionComboBoxItem();
	}
	
	private void actionCriarCategoria()
	{
		CatalogoController controllerCatalogo = MainController.getCatalogoController();		
		
		String nomeCategoria = txtNome.getText();
		controllerCatalogo.addCategoria(nomeCategoria);
			
		JOptionPane.showMessageDialog(null, "Categoria Criada.");
		renovarComboBox();
		limpar();	
	}
	
	public void actionAdicionarItem()
	{
		CatalogoController catalogoController = MainController.getCatalogoController();		
		
		ETipoItem tipo;
		String t = txtTipo.getText();
		String descricao = txtDescricao.getText();
		double preco;
		String nomeCategoria;
		
		if (t.equals("S"))
		{
			tipo = ETipoItem.SERVICO;
		}
		else if (t.equals("P"))
		{
			tipo = ETipoItem.PECA;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Tipo Invalido. Digite S(Servico) ou P(Peca).");
			return;			
		}
		
		try
		{
			preco = Double.parseDouble(txtPreco.getText());			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Preco Invalido.");
			return;				
		}
		
		String cBoxCategoria = comboBoxCategoria.getSelectedItem().toString();
		if (cBoxCategoria.equals("Selecionar Categoria"))
		{
			JOptionPane.showMessageDialog(null, "Selecione a Categoria.");
			return;						
		}		
		String[] cb = cBoxCategoria.split(" ");		
		nomeCategoria = cb[1];		
		
		catalogoController.addItem(nomeCategoria, tipo, descricao, preco);
		
		JOptionPane.showMessageDialog(null, "Item Adicionado.");
		renovarComboBox();
		limpar2();		
	}
	
	private void actionRemoverCategoria()
	{
		CatalogoController catalogoController = MainController.getCatalogoController();
		String nomeCategoria;
		
		String cBoxCategoria = comboBoxCategoria2.getSelectedItem().toString();
		if (cBoxCategoria.equals("Selecionar Categoria"))
		{
			JOptionPane.showMessageDialog(null, "Selecione a Categoria.");
			return;						
		}		
		String[] cb = cBoxCategoria.split(" ");		
		nomeCategoria = cb[1];		
		
		boolean estado = catalogoController.rmvCategoria(nomeCategoria);
		if (estado)
			JOptionPane.showMessageDialog(null, "Categoria Removida.");
		else
			JOptionPane.showMessageDialog(null, "Categoria Inexistente.");
			
		renovarComboBox();		
	}
	
	public void actionRemoverItem()
	{
		CatalogoController catalogoController = MainController.getCatalogoController();
		int codigo;
		
		String cBoxItem = comboBoxItem.getSelectedItem().toString();
		if (cBoxItem.equals("Selecionar Item"))
		{
			JOptionPane.showMessageDialog(null, "Selecione o Item.");
			return;						
		}		
		String[] cb = cBoxItem.split(" ");		
		codigo = Integer.parseInt(cb[1]);		
		
		boolean estado = catalogoController.rmvItem(codigo);
		if (estado)
			JOptionPane.showMessageDialog(null, "Item Removido.");
		else
			JOptionPane.showMessageDialog(null, "Item Inexistente.");
			
		renovarComboBox();		
	}

	private void actionListarCategorias()
	{
		CatalogoController catalogoController = MainController.getCatalogoController();
		
		StringBuilder sb = catalogoController.getListarCategorias();
		
		textListarCategorias.setText(sb.toString());	
		
		renovarComboBox();		
	}
	
	public void actionListarItens()
	{
		CatalogoController catalogoController = MainController.getCatalogoController();
		
		StringBuilder sb = catalogoController.getListarItens();
		
		textListarItens.setText(sb.toString());	
		
		renovarComboBox();			
	}
	
	private void limpar() {
		txtNome.setText("");
	}
	
	private void limpar2()
	{
		txtTipo.setText("");
		txtDescricao.setText("");
		txtPreco.setText("");		
	}	
}
