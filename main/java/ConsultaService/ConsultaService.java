/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConsultaService;

import Exception.ValidacaoException;
import Model.Consulta;
import Model.Medico;
import Model.Paciente;
import Service.MedicoService;
import Service.PacienteService;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author athai
 */

   
public class ConsultaService {

   public static List<Medico> findMedicosDisponiveis(LocalDateTime dataHora) {
    List<Medico> medicosDisponiveis = new ArrayList<>();
    
    // Implemente aqui a lógica para consultar o banco de dados ou outra fonte de dados
    // para encontrar médicos disponíveis no horário especificado
    
    // Exemplo: consultar um banco de dados fictício para obter médicos disponíveis
    // MedicosDisponiveisDAO dao = new MedicosDisponiveisDAO();
    // medicosDisponiveis = dao.findAvailableMedicos(dataHora);
    
    return medicosDisponiveis;
}


    private List<Consulta> consultas;

    public ConsultaService() {
        this.consultas = new ArrayList<>();
    }

    public void agendarConsulta(Paciente paciente, Medico medico, LocalDateTime dataHora) {
        Consulta novaConsulta = new Consulta(paciente, medico, dataHora);
        consultas.add(novaConsulta);
    }

    public void cancelarConsulta(Consulta consulta, String motivo) {
        consulta.setCancelada(true);
        consulta.setMotivoCancelamento(motivo);
    }

    public List<Consulta> listarConsultas() {
        return consultas;
    }

   
}


   
