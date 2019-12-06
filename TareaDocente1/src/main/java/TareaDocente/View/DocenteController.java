package TareaDocente.View;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import TareaDocente.Bussiness.DocenteON;
import TareaDocente.Bussiness.Instalacion;
import TareaDocente.Modelo.Actividades;
import TareaDocente.Modelo.Docente;



@ManagedBean
@ViewScoped
public class DocenteController {

	private Docente docente= new Docente();
	private List<Docente> listadoDocente;
	private String nom;
	private List<Docente> listadoDocenteNom;
	
	
	@Inject
	private DocenteON dON;
	
	private Instalacion insON;
	
	@PostConstruct
	public void init() {
		listadoDocente=dON.getListadoDocente();
	}
	
	public String cargarDatos() {
		try {
			dON.guardar(docente);
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String editar(int codigo) {
		System.out.println("codigo editar"+codigo);
		docente=dON.getDocente(codigo);
		System.out.println(docente);
		return "Docente.xhtml";
	}
	
	public String borrar(String codigo) {
		System.out.println("codigo borrar"+codigo);
		try {
			dON.borrar(codigo);
			init();
		} catch (Exception e) {
			System.out.println("Error "+ e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	public String busqueda()
	{
		System.out.println("Filtro " + docente.getPlaca());
		listadoDocenteNom=dON.getListadoDocenteNombre(docente.getPlaca());
		dON.getListadoDocenteNombre(docente.getPlaca());
		
		return null;
	}
	
	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public List<Docente> getListadoDocente() {
		return listadoDocente;
	}

	public void setListadoDocente(List<Docente> listadoDocente) {
		this.listadoDocente = listadoDocente;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Docente> getListadoDocenteNom() {
		return listadoDocenteNom;
	}

	public void setListadoDocenteNom(List<Docente> listadoDocenteNom) {
		this.listadoDocenteNom = listadoDocenteNom;
	}
	
	
	/*
	 * public void addActividades() { docente.addActividades(new Actividades());
	 * System.out.println("tele "+docente.getActividades().size()); }
	 */
	
	
}
