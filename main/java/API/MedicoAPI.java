/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package API;

import Model.Medico;
import Service.MedicoService;
import jakarta.enterprise.inject.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;


/**
 *
 * @author athai
 */
@Path("/medicos")
@jakarta.ws.rs.Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class MedicoAPI {
  private MedicoService medicoService;

    public MedicoAPI() {
        this.medicoService = new MedicoService();
    }

    @POST
    public Response cadastrarMedico(Medico medico) {
        medicoService.cadastrarMedico(medico);
        return Response.status(Response.Status.CREATED).entity("Médico cadastrado com sucesso").build();
    }

    @GET
    public Response listarMedicos() {
        return Response.ok(medicoService.listarMedicos()).build();
    }

    @PUT
    @Path("/{crm}")
    public Response atualizarMedico(@PathParam("crm") String crm, Medico novoMedico) {
        boolean atualizado = medicoService.atualizarMedico(crm, novoMedico);
        if (atualizado) {
            return Response.status(Response.Status.OK).entity("Médico atualizado com sucesso").build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Médico não encontrado").build();
        }
    }

    @DELETE
    @Path("/{crm}")
    public Response excluirMedico(@PathParam("crm") String crm) {
        boolean excluido = medicoService.excluirMedico(crm);
        if (excluido) {
            return Response.status(Response.Status.OK).entity("Médico marcado como inativo").build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Médico não encontrado").build();
        }
    }
    
    
     
}

