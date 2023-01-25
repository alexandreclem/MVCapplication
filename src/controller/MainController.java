package controller;

import persistence.Serialization;
import java.io.Serializable;

public class MainController implements Serializable {
	private static final long serialVersionUID = 7960642925565557045L;

	private static MainController instance;
	
	// "Sub Controllers"
	private PessoaController pessoaController;
	private VeiculoController veiculoController;
	private CatalogoController catalogoController;
	private OrdemServicoController ordemservicoController;
	
	private MainController() {		
		pessoaController = new PessoaController();
		veiculoController = new VeiculoController();
		catalogoController = new CatalogoController();
		ordemservicoController = new OrdemServicoController();		
	}
	
	// "MainController" Functions 
	public static MainController getInstance() {
		return instance;
	}

	public static void readFile() {

		instance = Serialization.readFile();

		if (instance == null) {
			instance = new MainController();
		}
	}

	public static void writeFile() {
		Serialization.writeFile(instance);
	}
	
	// "SubControllers" Get's 

	public static PessoaController getPessoaController() {
		return instance.pessoaController;
	}

	public static VeiculoController getVeiculoController() {
		return instance.veiculoController;
	}
	public static CatalogoController getCatalogoController() {
		return instance.catalogoController;
	}
	
	public static OrdemServicoController getOrdemServicoController() {
		return instance.ordemservicoController;
	}
}
