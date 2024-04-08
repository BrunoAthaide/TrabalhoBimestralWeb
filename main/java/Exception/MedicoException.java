/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author athai
 */
public class MedicoException {

    public static class InformacaoObrigatoriaException extends Exception {
        public InformacaoObrigatoriaException(String message) {
            super(message);
        }
    }

    public static class ErroAgendaMedicoException extends Exception {
        public ErroAgendaMedicoException(String message) {
            super(message);
        }
    }

    public static class ErroEspecialidadesException extends Exception {
        public ErroEspecialidadesException(String message) {
            super(message);
        }
    }

    public static class ErroAlteraMedicoException extends Exception {
        public ErroAlteraMedicoException(String message) {
            super(message);
        }
    }
}


