package TareaDocente.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import TareaDocente.Bussiness.DocenteON;
import TareaDocente.Modelo.Docente;




@Path("/crud")
public class OperacionesService {

	@Inject
	private DocenteON docenteON;
	
	@POST 
	@Path("/create")
	@Produces("application/json")
	@Consumes("application/json")
public  Response insertPersona(Docente docente) {
		
		Response.ResponseBuilder builder = null;
		Map<String, String> data = new HashMap<>();
		
		try {
			docenteON.guardar(docente);
			data.put("codigo", "100");
			data.put("Mensaje: ", "Docente ingresado");
			builder = Response.status(Response.Status.OK).entity(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			data.put("codigo", "50");
			data.put("Mensaje: ", e.getMessage());
			builder = Response.status(Response.Status.BAD_REQUEST).entity(data);
		}
		
		return builder.build();
		
		
	}
	
	@GET
	@Path("/listar")
	@Produces("application/json")
		public List<Docente> getPersonas(){
			return docenteON.getListadoDocente();
		}
}
