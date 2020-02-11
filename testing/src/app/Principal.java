package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import daos.PruebaDAO;
import modelo.Prueba;


public class Principal {

	private static PruebaDAO pruebaDAO = new PruebaDAO();
	private static Prueba prueba = new Prueba();

	public static void main(String[] args) throws ParseException {

		String fecha2 = "2010-04-11";
		String fecha = "2016-12-08";
		
		Date fechadate = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
		Date fechadate2 = new SimpleDateFormat("yyyy-MM-dd").parse(fecha2);
		
		java.sql.Date creadoEn = new java.sql.Date(fechadate.getTime());
		java.sql.Date actualizadoEn = new java.sql.Date(fechadate2.getTime());

		/*prueba.setIdPrueba(2);
		prueba.setIdAplicacion(10);
		prueba.setCiclo("ciclo 5");
		prueba.setCreadoEn(creadoEn);
		prueba.setActualizadEn(actualizadoEn);
		prueba.setVersionAplicativo("V1.0");
		prueba.setStatus("finalizada");
		prueba.setIdUsuario(3);

		pruebaDAO.create(prueba);//insertar en pruebas
		
		prueba.setIdPrueba(1);
		prueba.setIdAplicacion(11);
		prueba.setCiclo("ciclo 2");
		prueba.setCreadoEn(creadoEn);
		prueba.setActualizadEn(actualizadoEn);
		prueba.setVersionAplicativo("V1.1");
		prueba.setStatus("terminado");
		prueba.setIdUsuario(2);

		pruebaDAO.update(prueba);//actualizar en pruebas
		
		pruebaDAO.delete(2);*/ //eliminar en pruebas

		List<Prueba> pruebas = obtenerTodasPruebas();//listar las pruebas

		for (int i = 0; i < pruebas.size(); i++) {
			System.out.println(pruebas.get(i));
		}

	}

	public static List<Prueba> obtenerTodasPruebas() {
		return pruebaDAO.obtenerTodas();
	}

}
