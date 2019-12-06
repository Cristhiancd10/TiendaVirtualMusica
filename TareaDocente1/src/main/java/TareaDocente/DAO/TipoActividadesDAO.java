package TareaDocente.DAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class TipoActividadesDAO {

	@Inject
	private EntityManager em;
	
	
}
