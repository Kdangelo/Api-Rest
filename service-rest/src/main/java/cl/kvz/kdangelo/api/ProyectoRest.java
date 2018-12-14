package cl.kvz.kdangelo.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.inject.Inject;

import cl.kvz.kdangelo.model.Proyecto;
import cl.kvz.kdangelo.service.ProyectoService;

@Path("/v1/proyectos")
public class ProyectoRest {

	@Inject
	private ProyectoService _proyectoService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Proyecto> listProyectos() {
     	return _proyectoService.findAllProyecto();
    }
    
    @GET 
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Proyecto getProyectos(@PathParam("id") Integer id) {
    	Proyecto proyectos = _proyectoService.findById(id);
    	if ( proyectos == null ) {
    		return null;
    	}
	   	return proyectos;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addProyectos(Proyecto proyecto) {
    	_proyectoService.saveProyecto(proyecto);
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteProyectos(@PathParam("id") Integer id) {
    	_proyectoService.deleteProyectoById(id);
    }
}
