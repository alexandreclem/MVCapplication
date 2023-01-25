package main;

import java.awt.EventQueue;

import controller.MainController;
import view.MenuView;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MainController.readFile();
				try {
					MenuView window = new MenuView();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}