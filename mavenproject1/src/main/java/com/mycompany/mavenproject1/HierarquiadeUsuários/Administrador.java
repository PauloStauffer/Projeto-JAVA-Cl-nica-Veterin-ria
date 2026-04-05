
package com.mycompany.mavenproject1.HierarquiadeUsuários;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {

    private int nivelAcesso;
    private String departamento;

    public Administrador(int id, String nome, String email, String senha) {
        super(id, nome, email, senha, "ADMIN");
    }

    public boolean excluirRegistro(int id, String tipo) {
        System.out.println("Excluindo " + tipo + " com ID: " + id);
        return true;
    }

    public void ajustarEstoque(String item, int qtd) {
        System.out.println("Ajustando estoque: " + item + " Quantidade: " + qtd);
    }

    public String gerarRelatorio(int mes, int ano) {
        return "Relatório gerado para " + mes + "/" + ano;
    }

    public void gerenciarUsuario(Usuario u) {
        System.out.println("Gerenciando usuário: " + u.getNome());
    }

    public List<String> visualizarLogs() {
        return new ArrayList<>();
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Nível de acesso: " + nivelAcesso);
        System.out.println("Departamento: " + departamento);
    }
}