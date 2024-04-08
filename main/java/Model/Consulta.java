/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author athai
 */
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Consulta {

    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataHora;
    private boolean cancelada;
    private String motivoCancelamento;

    // Construtor
    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.cancelada = false;
    }

    public Consulta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   

    // Getters e Setters
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    public String getMotivoCancelamento() {
        return motivoCancelamento;
    }

    public void setMotivoCancelamento(String motivoCancelamento) {
        this.motivoCancelamento = motivoCancelamento;
    }

    // Métodos relacionados ao banco de dados
    public void insert(Consulta consulta) {
        // Lógica para inserir a consulta no banco de dados
    }

    public void deactivate(int consultaId) {
        // Lógica para desativar a consulta no banco de dados
    }


    public static Consulta findById(int consultaId) {
        // Lógica para encontrar uma consulta pelo ID no banco de dados
        return null;
    }

    public static List<Medico> findMedicosDisponiveis(LocalDateTime dataHora) {
        // Lógica para encontrar médicos disponíveis no banco de dados
        return new ArrayList<>();
    }


    public List<Consulta> findByDateAndMedico(LocalDateTime dataHora, int medicoId) {
        // Lógica para encontrar consultas com a data/hora e o médico fornecidos no banco de dados
        // Você pode usar a classe ConsultaDAO para realizar a consulta
        return null;
        // Lógica para encontrar consultas com a data/hora e o médico fornecidos no banco de dados
        // Você pode usar a classe ConsultaDAO para realizar a consulta

    }
    public List<Consulta> findByDateAndPaciente(LocalDate date, int pacienteId) {
        List<Consulta> consultasEncontradas = new ArrayList<>();
        // Aqui você implementa a lógica para consultar o banco de dados por consultas
        // com a data e o ID do paciente fornecidos
        // Você pode usar a classe ConsultaDAO para realizar essa consulta
        // Por enquanto, retornaremos uma lista vazia
        return consultasEncontradas;
    }

    private static List<Medico> findMedicosDisponiveis() {
        List<Medico> medicosDisponiveis = new ArrayList<>();
        // Aqui você implementa a lógica para encontrar médicos disponíveis para uma determinada data e hora
        // Você pode consultar o banco de dados ou alguma outra fonte de dados para obter essa informação
        // Por enquanto, retornaremos uma lista vazia
        return medicosDisponiveis;
    }

    public static List<Consulta> listAll() {
        List<Consulta> todasConsultas = new ArrayList<>();
        // Aqui você implementa a lógica para obter todas as consultas do banco de dados
        // Por enquanto, retornaremos uma lista vazia
        return todasConsultas;
    
}

}

