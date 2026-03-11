package br.com.prefdesk.resource;

import java.util.List;

import br.com.prefdesk.dto.OrdemDTO;
import br.com.prefdesk.entity.Ordem;
import br.com.prefdesk.service.OrdemService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/ordem")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OrdemResource {

    @Inject
    OrdemService ordemService;

    @GET
    public List<Ordem> listarOrdens() {
        return Ordem.listAll();
    }

    @POST
    public Response criarOrdem(OrdemDTO ordem) {
        Ordem ordemCriada = ordemService.criarOrdem(ordem);

        return Response.ok().entity(ordemCriada).build();
    }
}
