/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Medico;
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

   
public class MedicoRepository {
    private Connection connection;

    public MedicoRepository(Connection connection) {
        this.connection = connection;
    }

    public void cadastrarMedico(Medico medico) throws SQLException {
        String query = "INSERT INTO medicos (nome, email, telefone, crm, especialidade, endereco) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, medico.getNome());
            ps.setString(2, medico.getEmail());
            ps.setString(3, medico.getTelefone());
            ps.setString(4, medico.getCrm());
            ps.setString(5, medico.getEspecialidade());
            ps.setString(6, medico.getEndereco());
            ps.executeUpdate();
        }
    }

    public List<Medico> listarMedicos() throws SQLException {
        List<Medico> medicos = new ArrayList<>();
        String query = "SELECT * FROM medicos";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Medico medico = new Medico();
                    medico.setNome(rs.getString("nome"));
                    medico.setEmail(rs.getString("email"));
                    medico.setTelefone(rs.getString("telefone"));
                    medico.setCrm(rs.getString("crm"));
                    medico.setEspecialidade(rs.getString("especialidade"));
                    medico.setEndereco(rs.getString("endereco"));
                    medicos.add(medico);
                }
            }
        }
        return medicos;
    }
}


