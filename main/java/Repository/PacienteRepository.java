/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author athai
 */
public class PacienteRepository {
     private Connection connection;

    public PacienteRepository(Connection connection) {
        this.connection = connection;
    }

    public void cadastrarPaciente(Paciente paciente) throws SQLException {
        String query = "INSERT INTO pacientes (nome, email, telefone, cpf, endereco) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getEmail());
            ps.setString(3, paciente.getTelefone());
            ps.setString(4, paciente.getCpf());
            ps.setString(5, paciente.getEndereco());
            ps.executeUpdate();
        }
    }

    public List<Paciente> listarPacientes() throws SQLException {
        List<Paciente> pacientes = new ArrayList<>();
        String query = "SELECT * FROM pacientes";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Paciente paciente = new Paciente(
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("telefone"),
                        rs.getString("cpf"),
                        rs.getString("endereco")
                    );
                    pacientes.add(paciente);
                }
            }
        }
        return pacientes;
    }
}
