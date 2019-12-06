package TareaDocente.Bussiness;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import TareaDocente.DAO.TipoActividadesDAO;




@Startup
@Singleton
public class Instalacion {

	@Inject
	private TipoActividadesDAO dao;
	
	
	
	@PostConstruct
	public void init() {
		
	}

	
}
