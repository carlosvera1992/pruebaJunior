package utils;

import java.sql.Connection;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;


public class Conexion {

	private static Connection cnx = null;

	public static Connection getConexion() {

		
		try {
			SQLServerDataSource conexion = new SQLServerDataSource();
			conexion.setUser("sa");
			conexion.setPassword("123");
			conexion.setServerName("localhost");
			conexion.setPortNumber(1433);
			conexion.setDatabaseName("testing");
			cnx = conexion.getConnection();
			System.out.println("muy bien");
			return cnx;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	static class ShutdownHook extends Thread {

		@Override
		public void run() {
			try {
				Connection cnx = Conexion.getConexion();
				System.out.println("Conexion cerrada!");
				cnx.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
