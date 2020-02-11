package daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import modelo.Prueba;
import utils.Conexion;

public class PruebaDAO {

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rset;

	private Prueba prueba;
	private List<Prueba> pruebas;
	

	public List<Prueba> obtenerTodas() {
		try {
			conn = Conexion.getConexion();
			String sql = "select * from pruebas";
			stmt = conn.prepareStatement(sql);
			rset = stmt.executeQuery();

			pruebas = new ArrayList<>();

			while (rset.next()) {
				prueba = new Prueba();

				prueba.setIdPrueba(rset.getInt("idprueba"));
				prueba.setIdAplicacion(rset.getInt("idaplicacion"));
				prueba.setCiclo(rset.getString("ciclo"));
				prueba.setCreadoEn(rset.getDate("creadoEn"));
				prueba.setActualizadEn(rset.getDate("actualizadoEn"));
				prueba.setVersionAplicativo(rset.getString("versionAplicativo"));
				prueba.setStatus(rset.getString("status"));
				prueba.setIdUsuario(rset.getInt("idusuario"));

				pruebas.add(prueba);
			}

		} catch (RuntimeException | SQLException e) {
			throw new RuntimeException("Error SQL - obtenerTodas()!");
		}
		return pruebas;
	} // Fin del método obtenerTodas()
	
	 public int create(Prueba prueba) {
	        try {
	            conn = Conexion.getConexion();
	            String sql = "insert into pruebas(idprueba, idaplicacion, ciclo, creadoEn, actualizadoEn, versionAplicativo, status, idusuario )"
	            		+ " values(?, ?, ?, ?, ?, ?, ?, ?)";
	            
	            stmt = conn.prepareStatement(sql);
	            stmt.setInt(1, prueba.getIdPrueba());
	            stmt.setInt(2, prueba.getIdAplicacion());
	            stmt.setString(3, prueba.getCiclo());
	            stmt.setDate(4, (java.sql.Date) prueba.getCreadoEn());
	            stmt.setDate(5, (java.sql.Date) prueba.getActualizadEn());
	            stmt.setString(6, prueba.getVersionAplicativo());
	            stmt.setString(7, prueba.getStatus());
	            stmt.setInt(8, prueba.getIdUsuario());
	            
	            return stmt.executeUpdate();

	        } catch (SQLException | RuntimeException e) {
	            System.out.println(e.toString());
	            return 0;
	        }
	    } // Fin del método agregar()

	
	 public int update(Prueba prueba) {
	        try {
	            conn = Conexion.getConexion();
	            String sql = "update pruebas set idaplicacion = ?, ciclo = ?, creadoEn = ?, ActualizadoEn = ? , versionAplicativo = ?, "
	            		+ "status = ?, idusuario = ? where idprueba = ?";
	            
	            stmt = conn.prepareStatement(sql);
	            stmt.setInt(1, prueba.getIdAplicacion());
	            stmt.setString(2, prueba.getCiclo());
	            stmt.setDate(3, (Date) prueba.getCreadoEn());
	            stmt.setDate(4, (Date) prueba.getActualizadEn());
	            stmt.setString(5, prueba.getVersionAplicativo());
	            stmt.setString(6, prueba.getStatus());
	            stmt.setInt(7, prueba.getIdUsuario());
	            stmt.setInt(8, prueba.getIdPrueba());
	            return stmt.executeUpdate();

	        } catch (SQLException | RuntimeException e) {
	            System.out.println(e.toString());
	            return 0;
	        }
	    } // Fin del método update()
	 
	 
	 
	 
	 public int delete(int idprueba) {
	        try {
	            conn = Conexion.getConexion();
	            String sql = "delete from pruebas where idprueba = ?";
	            stmt = conn.prepareStatement(sql);
	            stmt.setInt(1, idprueba);
	            return stmt.executeUpdate();
	        } catch (RuntimeException | SQLException e) {
	            System.out.println(e.toString());
	            return 0;
	        }
	    } // Fin del método delete() 
	 
	
}
