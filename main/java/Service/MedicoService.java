/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Medico;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author athai
 */
public class MedicoService {

    public static List<Medico> findMedicosDisponiveis(LocalDateTime dataHora) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 private List<Medico> medicos;

    public MedicoService() {
        this.medicos = new ArrayList<>();
    }

    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
    }

    public List<Medico> listarMedicos() {
        return medicos;
    }

    public boolean atualizarMedico(String crm, Medico novoMedico) {
        for (Medico medico : medicos) {
            if (medico.getCrm().equals(crm)) {
                // Verificando regras de negócio
                if (!medico.getNome().equals(novoMedico.getNome()))
                    medico.setNome(novoMedico.getNome());
                if (!medico.getTelefone().equals(novoMedico.getTelefone()))
                    medico.setTelefone(novoMedico.getTelefone());
                if (!medico.getEndereco().equals(novoMedico.getEndereco()))
                    medico.setEndereco(novoMedico.getEndereco());
                return true; // Médico atualizado com sucesso
            }
        }
        return false; // Médico não encontrado ou não atualizado
    }

    public boolean excluirMedico(String crm) {
        for (Medico medico : medicos) {
            if (medico.getCrm().equals(crm)) {
                // Tornando o médico como "inativo"
                medico.setAtivo(false);
                return true; // Médico marcado como inativo
            }
        }
        return false; // Médico não encontrado
    }
}
