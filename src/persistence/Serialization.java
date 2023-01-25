package persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import controller.MainController;

public class Serialization {

	private static String fileName = "../data/data.bin";

	public static MainController readFile() {

		MainController mainController = null;

		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
			mainController = (MainController) input.readObject();

			input.close();

		} catch (FileNotFoundException e) { // Arquivo nao encontrado: nenhum objeto serializado
		

		} catch (Exception e) {
			e.printStackTrace();
		}

		return mainController;
	}

	public static void writeFile(MainController mainController) {

		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));

			output.writeObject(mainController);
			output.flush();

			output.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

