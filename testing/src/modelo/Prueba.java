package modelo;

import java.util.Date;

public class Prueba {

	
	private int idPrueba;
	private int idAplicacion;
	private String ciclo;
	private Date creadoEn;//default
	private Date actualizadEn;//default
	private String versionAplicativo;
	private String status;
	private int idUsuario;
	
	
	public int getIdPrueba() {
		return idPrueba;
	}
	public void setIdPrueba(int idPrueba) {
		this.idPrueba = idPrueba;
	}
	public int getIdAplicacion() {
		return idAplicacion;
	}
	public void setIdAplicacion(int idAplicacion) {
		this.idAplicacion = idAplicacion;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public Date getCreadoEn() {
		return creadoEn;
	}
	public void setCreadoEn(Date creadoEn) {
		this.creadoEn = creadoEn;
	}
	public Date getActualizadEn() {
		return actualizadEn;
	}
	public void setActualizadEn(Date actualizadEn) {
		this.actualizadEn = actualizadEn;
	}
	public String getVersionAplicativo() {
		return versionAplicativo;
	}
	public void setVersionAplicativo(String versionAplicativo) {
		this.versionAplicativo = versionAplicativo;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	@Override
	public String toString() {
		return "Prueba [idPrueba=" + idPrueba + ",idAplicacion=" + idAplicacion + ",ciclo=" + ciclo + ",creadoEn="
				+ creadoEn + ",actualizadEn=" + actualizadEn + ",versionAplicativo=" + versionAplicativo + ",status="
				+ status + ",idUsuario=" + idUsuario + "]";
	}
	
	
	
}
