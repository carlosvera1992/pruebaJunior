package vistas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class VentanaPrincipal extends JFrame implements ActionListener{

	JLabel nombre;
	JButton boton;
	JTextField nombreTexto;
	JComboBox<Object> apps;
	
	JTable tabla;
	
	
	public VentanaPrincipal() {
		Container contenedor = this.getContentPane();
		contenedor.setLayout(null);
		
		nombre = new JLabel("Nombre: ");
		nombre.setBounds(10, 10, 60, 30);
		nombre.setVisible(true);
		contenedor.add(nombre);
		
		nombreTexto = new JTextField(30);
		nombreTexto.setBounds(65, 10, 120, 30);
		nombreTexto.setVisible(true);
		contenedor.add(nombreTexto);
		
		boton = new JButton("Crear");
		boton.setBounds(190, 10, 100, 30);
		boton.setVisible(true);
		boton.addActionListener(this);
		contenedor.add(boton);
		
		apps = new JComboBox<Object>(loadAplicaciones());
		apps.setSelectedIndex(0);
		apps.addActionListener(this);
		apps.setBounds(295, 10, 130, 30);
		apps.setVisible(true);
		contenedor.add(apps);
		
		tabla = new JTable(getRowData(), getColumns());
		tabla.setBounds(10, 50, 500, 300);
		tabla.setVisible(true);
		tabla.setFillsViewportHeight(true);
		contenedor.add(tabla.getTableHeader());
		contenedor.add(tabla);
		
	}
	
	private static final long serialVersionUID = 1L;



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton) {
			JOptionPane.showMessageDialog(null, "Hola "+nombreTexto.getText());
		}else if(e.getSource() == apps) {
			if(apps.getSelectedIndex() != 0) {
				JOptionPane.showMessageDialog(null, "Seleccionó "+apps.getSelectedItem().toString());
			}
		}
	}
	
	public static String[] loadAplicaciones() {
		//Imagine that here you load the applications from the DB from the Controller
		
		String[] apps = {"Select App","App1","App2","App3"};
		
		return apps;
	}
	
	public static String[] getColumns() {
		String[] columnNames = {
					"First Name",
	                "Last Name",
	                "Sport",
	                "# of Years",
	                "Vegetarian"
                };
		
		return columnNames;
	}
	
	public static Object[][] getRowData(){
		Object[][] data = {
			    {"Kathy", "Smith",
			     "Snowboarding", new Integer(5), new Boolean(false)},
			    {"John", "Doe",
			     "Rowing", new Integer(3), new Boolean(true)},
			    {"Sue", "Black",
			     "Knitting", new Integer(2), new Boolean(false)},
			    {"Jane", "White",
			     "Speed reading", new Integer(20), new Boolean(true)},
			    {"Joe", "Brown",
			     "Pool", new Integer(10), new Boolean(false)}
			};
		return data;
	}
}
