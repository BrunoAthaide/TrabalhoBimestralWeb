/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package API;

import Model.Pessoas;
import Service.PessoasService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author athai
 */
@Path("/pessoas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaAPI {
   private PessoasService pessoaService;

    public PessoaAPI() {
        this.pessoaService = new PessoasService();
    }

    @POST
    public Response cadastrarPessoa(Pessoas pessoa) {
        pessoaService.cadastrarPessoa(pessoa);
        return Response.status(Response.Status.CREATED).entity("Pessoa cadastrada com sucesso").build();
    }

    @GET
    public Response listarPessoas() {
        return Response.ok(pessoaService.listarPessoas()).build();
    }

    @PUT
    @Path("/{cpf}")
    public Response atualizarPessoa(@PathParam("cpf") String cpf, Pessoas novaPessoa) {
        boolean atualizado = pessoaService.atualizarPessoa(cpf, novaPessoa);
        if (atualizado) {
            return Response.status(Response.Status.OK).entity("Pessoa atualizada com sucesso").build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Pessoa não encontrada").build();
        }
    }

    @DELETE
    @Path("/{cpf}")
    public Response excluirPessoa(@PathParam("cpf") String cpf) {
        boolean excluido = pessoaService.excluirPessoa(cpf);
        if (excluido) {
            return Response.status(Response.Status.OK).entity("Pessoa excluída com sucesso").build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Pessoa não encontrada").build();
        }
    }
}
