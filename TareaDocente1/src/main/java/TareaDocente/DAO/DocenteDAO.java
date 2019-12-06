package TareaDocente.DAO;

import java.util.List;

import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import TareaDocente.Modelo.Docente;



@Stateless
@Startup
public class DocenteDAO {

	@Inject
	private EntityManager em;
	
	public void save(Docente d) {
		if (this.read(d.getPlaca())!=null) {
			this.update(d);
		}else {
			this.create(d);
		}
	}
	
	public void create(Docente d) {
		em.persist(d);
	}
	
	public Docente read(String id) {
		return em.find(Docente.class, id);
	}
	
	public Docente read3(int id) {
		String jpql= "SELECT d "
				+"      FROM Docente d "
				+"   WHERE d.codigo = :codigo";
		Query q= em.createQuery(jpql, Docente.class);
		q.setParameter("codigo", id);
		
		Docente d= (Docente) q.getSingleResult();
		
		return d;
	}
	
	public void update(Docente d) {
		em.merge(d);
	}
	
	public void delete(String id) {
		Docente d=read(id);
		em.remove(d);
	}
	
	public List<Docente> getDocente(){
		String jpql="SELECT d FROM Docente d";
		Query q=em.createQuery(jpql, Docente.class);
		
		List<Docente> docentes=q.getResultList();
		
		return docentes;
	}
	
	public List<Docente> getDocente2(){
		String jpql="SELECT d FROM Docente d";
		Query q=em.createQuery(jpql, Docente.class);
		
		List<Docente> docentes=q.getResultList();
		return docentes;
	}
	
	public List<Docente> getBusquedaDocente(String filBusqueda){
		String jpql="SELECT d FROM Docente d "
				    +" WHERE d.nombre LIKE :filtro ";
		Query q=em.createQuery(jpql, Docente.class);
		q.setParameter("filtro", "%"+filBusqueda+"%");
		
		List<Docente> docentes=q.getResultList();
		System.out.println(docentes);
		return docentes;
	}
}
