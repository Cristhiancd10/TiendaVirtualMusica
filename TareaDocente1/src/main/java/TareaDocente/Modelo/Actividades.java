package TareaDocente.Modelo;




import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Actividades {

	@Id
	private int numero;
    private String fInicio;
    private String fFin;
    private int tiempo;
    private double valor;
	
		
	@OneToOne
	@JoinColumn(name="doc_codigo")
	@JsonIgnore
	private Docente vehiculo_id;

	@Transient
	private int idTipo;
	
	@Transient
	private int idDocenteTemp;
	
	
	
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getfInicio() {
		return fInicio;
	}


	public void setfInicio(String fInicio) {
		this.fInicio = fInicio;
	}


	public String getfFin() {
		return fFin;
	}


	public void setfFin(String fFin) {
		this.fFin = fFin;
	}


	public int getTiempo() {
		return tiempo;
	}


	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public Docente getVehiculo_id() {
		return vehiculo_id;
	}


	public void setVehiculo_id(Docente vehiculo_id) {
		this.vehiculo_id = vehiculo_id;
	}


	

	
	//temporales
	
	@Override
	public String toString() {
		return "Actividades [numero=" + numero + ", fInicio=" + fInicio + ", fFin=" + fFin + ", tiempo=" + tiempo
				+ ", valor=" + valor + ", vehiculo_id=" + vehiculo_id + "]";
	}


	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public int getIdDocenteTemp() {
		return idDocenteTemp;
	}
	
	public void setIdDocenteTemp(int idDocenteTemp) {
		this.idDocenteTemp = idDocenteTemp;
	}
}
