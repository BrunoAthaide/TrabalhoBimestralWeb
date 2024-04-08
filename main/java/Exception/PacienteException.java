/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author athai
 */
public class PacienteException {
    // Definição da exceção InformacaoObrigatoria
    public class InformacaoObrigatoriaException extends Exception {
    public InformacaoObrigatoriaException(String message) {
        super(message);
    }
}

// Definição da exceção ErroAgendaPaciente
    public class ErroAgendaPacienteException extends Exception {
    public ErroAgendaPacienteException(String message) {
        super(message);
    }
}

}
