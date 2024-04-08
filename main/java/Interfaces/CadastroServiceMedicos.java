/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Exception.MedicoException;
import Exception.MedicoException.ErroAgendaMedicoException;
import Exception.MedicoException.ErroAlteraMedicoException;
import Exception.MedicoException.InformacaoObrigatoriaException;
import Exception.PessoaException.ErroEspecialidadesException;
import Model.Medico;
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

public interface CadastroServiceMedicos {

    @WebMethod
    ArrayList<Medico> listAllMedico() throws SQLException, InformacaoObrigatoriaException, ErroAgendaMedicoException;

    @WebMethod
    Medico findByIdMedico(@WebParam int id) throws SQLException, InformacaoObrigatoriaException, ErroAgendaMedicoException;

    @WebMethod
    Medico inserirMedico(Medico medico) throws SQLException, ErroEspecialidadesException, InformacaoObrigatoriaException, ErroAgendaMedicoException;

    @WebMethod
    Medico atualizarMedico(Medico medico) throws SQLException,  ErroAlteraMedicoException, InformacaoObrigatoriaException, ErroAgendaMedicoException;

    @WebMethod
    void deletarMedico(int id) throws SQLException, InformacaoObrigatoriaException;
}


