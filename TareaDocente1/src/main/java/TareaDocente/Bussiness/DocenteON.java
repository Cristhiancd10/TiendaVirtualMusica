package TareaDocente.Bussiness;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import TareaDocente.DAO.DocenteDAO;
import TareaDocente.Modelo.Actividades;
import TareaDocente.Modelo.Docente;



@Stateless
public class DocenteON {

	@Inject
	private DocenteDAO dao;
	
	@Inject
	private Instalacion init;
	
	public void guardar(Docente d) throws Exception {
	
		
		dao.save(d);
	}
	
	public List<Docente> getListadoDocente(){
		return dao.getDocente();
	}
	
	public List<Docente> getListadoDocenteNombre(String nombre){
		return dao.getBusquedaDocente(nombre);
	}
	
	public void borrar(String codigo ) throws Exception {
		try {
			dao.delete(codigo);
		} catch (Exception  e) {
			throw new  Exception("Error al borrar "+e.getMessage());
		}
	}

public Docente getDocente(int codigo) {
	Docente aux=dao.read3(codigo);
	return aux;
 }
}
