/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author athai
 */
public class Medico {
    
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    private String especialidade;
    private String endereco;
    
    public Medico() {
       
    }
    public Medico(String nome, String email, String telefone, String crm, String especialidade, String endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.crm = crm;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setAtivo(boolean b) {
       
    }

    public boolean isAtivo() {
    // Exemplo de lógica: se o médico tem um CRM válido, consideramos ele como ativo
    return crm != null && !crm.isEmpty();
}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // Método em Paciente para obter consultas no dia
public List<Consulta> getConsultasNoDia(LocalDate data) {
    List<Consulta> consultasNoDia = new ArrayList<>();
        Iterable<Consulta> Consulta = null;
    for (Consulta consulta : Consulta) {
        if (consulta.getDataHora().toLocalDate().equals(data)) {
            consultasNoDia.add(consulta);
        }
    }
    return consultasNoDia;
}

// Método em Medico para obter consultas no horário
public List<Consulta> getConsultasNoHorario(LocalDateTime dataHora) {
    List<Consulta> consultasNoHorario = new ArrayList<>();
        Iterable<Consulta> Consulta = null;
    for (Consulta consulta : Consulta) {
        if (consulta.getDataHora().equals(dataHora)) {
            consultasNoHorario.add(consulta);
        }
    }
    return consultasNoHorario;
}

    
    
    
}
