package app;

import java.text.ParseException;

import javax.swing.JFrame;
import vistas.VentanaPrincipal;


public class Principal {

	public static void main(String[] args) throws ParseException {

		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(); 
		ventanaPrincipal.setBounds(0, 0, 600, 400);
		ventanaPrincipal.setVisible(true);
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
