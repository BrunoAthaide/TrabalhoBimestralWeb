/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;
import Exception.MedicoException.InformacaoObrigatoriaException;
import Exception.PacienteException.ErroAgendaPacienteException;
import Model.Paciente;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author athai
 */
public interface CadastroServicePasciente {

@WebService(endpointInterface = "HospitalMedico-1.0-SNAPSHOT")
public interface CadastroServicePaciente {

    @WebMethod
    ArrayList<Paciente> listAllPacientes() throws SQLException, InformacaoObrigatoriaException, ErroAgendaPacienteException;

    @WebMethod
    Paciente findByIdPaciente(@WebParam int id) throws SQLException, InformacaoObrigatoriaException, ErroAgendaPacienteException;

    @WebMethod
    Paciente inserirPaciente(Paciente paciente) throws SQLException, InformacaoObrigatoriaException, ErroAgendaPacienteException;

    @WebMethod
    Paciente atualizarPaciente(Paciente paciente) throws SQLException, InformacaoObrigatoriaException, ErroAgendaPacienteException;

    @WebMethod
    void deletarPaciente(int id) throws SQLException, InformacaoObrigatoriaException, ErroAgendaPacienteException;
}

}

