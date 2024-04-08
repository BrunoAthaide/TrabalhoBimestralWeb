/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Paciente;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author athai
 */
public class PacienteService {
    
 private List<Paciente> pacientes;

    public PacienteService() {
        this.pacientes = new ArrayList<>();
    }

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public List<Paciente> listarPacientes() {
        return pacientes;
    }

    public boolean atualizarPaciente(String cpf, Paciente novoPaciente) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCpf().equals(cpf)) {
                // Verificando regras de negócio
                if (!paciente.getNome().equals(novoPaciente.getNome()))
                    paciente.setNome(novoPaciente.getNome());
                if (!paciente.getTelefone().equals(novoPaciente.getTelefone()))
                    paciente.setTelefone(novoPaciente.getTelefone());
                if (!paciente.getEndereco().equals(novoPaciente.getEndereco()))
                    paciente.setEndereco(novoPaciente.getEndereco());
                return true; // Paciente atualizado com sucesso
            }
        }
        return false; // Paciente não encontrado ou não atualizado
    }

    public boolean excluirPaciente(String cpf) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCpf().equals(cpf)) {
                // Tornando o paciente como "inativo"
                paciente.setAtivo(false);
                return true; // Paciente marcado como inativo
            }
        }
        return false; // Paciente não encontrado
    }
}
