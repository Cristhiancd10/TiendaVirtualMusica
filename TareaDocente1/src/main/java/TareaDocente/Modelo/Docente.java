package TareaDocente.Modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;





@Entity
public class Docente {

	/*
	 * @Id
	 * 
	 * @Column(name="doc_Id") private int id;
	 * 
	 * @NotNull
	 * 
	 * @Size(min=10, max=10)
	 * 
	 * @Column(name="doc_Cedula") private String cedula;
	 * 
	 * @NotNull
	 * 
	 * @Size(min=3, max=40)
	 * 
	 * @Column(name="doc_Nombre") private String nombre;
	 * 
	 * @NotNull
	 * 
	 * @Size(min=3, max=40)
	 * 
	 * @Column(name="doc_Apellido") private String apellido;
	 * 
	 * @NotNull
	 * 
	 * @Size(min=3, max=40)
	 * 
	 * @Column(name="doc_Direccion") private String direccion;
	 * 
	 * @NotNull
	 * 
	 * @Size(min=9, max=10)
	 * 
	 * @Column(name="doc_Telefono") private String telefono;
	 * 
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name="doc_codigo") private List<Actividades> actividades;
	 * 
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public String getCedula() { return cedula; }
	 * 
	 * public void setCedula(String cedula) { this.cedula = cedula; }
	 * 
	 * public String getNombre() { return nombre; }
	 * 
	 * public void setNombre(String nombre) { this.nombre = nombre; }
	 * 
	 * public String getApellido() { return apellido; }
	 * 
	 * public void setApellido(String apellido) { this.apellido = apellido; }
	 * 
	 * public String getDireccion() { return direccion; }
	 * 
	 * public void setDireccion(String direccion) { this.direccion = direccion; }
	 * 
	 * public String getTelefono() { return telefono; }
	 * 
	 * public void setTelefono(String telefono) { this.telefono = telefono; }
	 * 
	 * public List<Actividades> getActividades() { return actividades; }
	 * 
	 * public void setActividades(List<Actividades> actividades) { this.actividades
	 * = actividades; }
	 * 
	 * @Override public String toString() { return "Docente [id=" + id + ", cedula="
	 * + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" +
	 * direccion + ", telefono=" + telefono + "]"; }
	 * 
	 * public void addActividades(Actividades act) { if (actividades==null) {
	 * actividades=new ArrayList<>(); } this.actividades.add(act);
	 * 
	 * }
	 */
	
	@Id
	private String placa;
    private String marca;

    @OneToOne
	@JoinColumn(name="doc_codigo") 
    private Actividades actividades;
    
    
    
    
    public Actividades getActividades() {
		return actividades;
	}

	public void setActividades(Actividades actividades) {
		this.actividades = actividades;
	}

	public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

	
    
	@Override
	public String toString() {
		return "Docente [placa=" + placa + ", marca=" + marca + ", actividades=" + actividades + "]";
	}

	
	
}
