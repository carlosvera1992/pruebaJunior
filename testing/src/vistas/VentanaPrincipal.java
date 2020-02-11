package vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class VentanaPrincipal {

	public static void main(String[] args) {

		JFrame framePrincipal = new JFrame("Ventana Principal");

		framePrincipal.setSize(800, 600);
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePrincipal.setVisible(true);

		JPanel panel = new JPanel();
		framePrincipal.add(panel);
		
		
	}
	
	
}
