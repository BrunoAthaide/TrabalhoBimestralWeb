/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Pessoas;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author athai
 */
public class PessoasService {

    private List<Pessoas> pessoas;

    public PessoasService() {
        this.pessoas = new ArrayList<>();
    }

    public void cadastrarPessoa(Pessoas pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoas> listarPessoas() {
        return pessoas;
    }

    public boolean atualizarPessoa(String cpf, Pessoas novaPessoa) {
        for (Pessoas pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                // Lembrar de verificar as Regras!!!!!!
                
                if (!pessoa.getNome().equals(novaPessoa.getNome()))
                    pessoa.setNome(novaPessoa.getNome());
                if (!pessoa.getTelefone().equals(novaPessoa.getTelefone()))
                    pessoa.setTelefone(novaPessoa.getTelefone());
                if (!pessoa.getEndereco().equals(novaPessoa.getEndereco()))
                    pessoa.setEndereco(novaPessoa.getEndereco());
                return true; // Informar pessoa que foi atualizada com sucesso!!
            }
        }
        return false; // Pessoa não encontrada ou não atualizada
    }

    public boolean excluirPessoa(String cpf) {
        for (Pessoas pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                // Tornando a pessoa como "inativa"
                pessoa.setAtivo(false);
                return true; // Pessoa marcada como inativa
            }
        }
        return false; // Pessoa não encontrada
    }
}

    


    