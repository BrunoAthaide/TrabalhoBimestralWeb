/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import API.PessoaAPI;
import Exception.MedicoException.InformacaoObrigatoriaException;
import Exception.PacienteException.ErroAgendaPacienteException;
import Exception.PessoaException.ErroEspecialidadesException;
import Exception.PessoaException.ErroEspecialidadesException.ErroAlteraPacienteException;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author athai
 */

@WebService(endpointInterface = "HospitalMedico-1.0-SNAPSHOT")
public interface CadastroServicePessoa {

    @WebMethod
    ArrayList<PessoaAPI> listAllPessoa() throws SQLException, InformacaoObrigatoriaException, ErroAgendaPacienteException;

    @WebMethod
    PessoaAPI findByIdPessoa(@WebParam int id) throws SQLException, InformacaoObrigatoriaException, ErroAgendaPacienteException;

    @WebMethod
    PessoaAPI inserirPessoa(PessoaAPI pessoa) throws SQLException, InformacaoObrigatoriaException, ErroAgendaPacienteException;

    @WebMethod
    PessoaAPI atualizarPessoa(PessoaAPI pessoa) throws SQLException, InformacaoObrigatoriaException, ErroEspecialidadesException, ErroAlteraPacienteException, ErroAgendaPacienteException;

    @WebMethod
    void deletarPessoa(int id) throws SQLException, InformacaoObrigatoriaException, ErroAgendaPacienteException;
}





