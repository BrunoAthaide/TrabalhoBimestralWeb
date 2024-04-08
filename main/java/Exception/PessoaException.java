/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author athai
 */
public class PessoaException {
    public class InformacaoObrigatoriaException extends Exception {
    public InformacaoObrigatoriaException(String message) {
        super(message);
    }
}

public class ErroAgendaPacienteException extends Exception {
    public ErroAgendaPacienteException(String message) {
        super(message);
    }
}
 public class ErroEspecialidadesException extends Exception {
    public ErroEspecialidadesException(String message) {
        super(message);
    }
    public class ErroAlteraPacienteException extends Exception {
    public ErroAlteraPacienteException(String message) {
        super(message);
    }
}

}
}