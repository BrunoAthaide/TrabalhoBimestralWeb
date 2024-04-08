/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package API;

import Model.Paciente;
import Service.PacienteService;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import java.util.List;

/**
 *
 * @author athai
 */
public class PacienteAPI {
   private PacienteService pacienteService;

    public PacienteAPI() {
        this.pacienteService = new PacienteService();
    }

    @POST
    public Response cadastrarPaciente(Paciente paciente) {
        pacienteService.cadastrarPaciente(paciente);
        return Response.status(Response.Status.CREATED).entity("Paciente cadastrado com sucesso").build();
    }

    @GET
    public Response listarPacientes() {
        return Response.ok(pacienteService.listarPacientes()).build();
    }

    @PUT
    @Path("/{cpf}")
    public Response atualizarPaciente(@PathParam("cpf") String cpf, Paciente novoPaciente) {
        boolean atualizado = pacienteService.atualizarPaciente(cpf, novoPaciente);
        if (atualizado) {
            return Response.status(Response.Status.OK).entity("Paciente atualizado com sucesso").build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Paciente não encontrado").build();
        }
    }

    @DELETE
    @Path("/{cpf}")
    public Response excluirPaciente(@PathParam("cpf") String cpf) {
        boolean excluido = pacienteService.excluirPaciente(cpf);
        if (excluido) {
            return Response.status(Response.Status.OK).entity("Paciente marcado como inativo").build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Paciente não encontrado").build();
        }
    }
}
