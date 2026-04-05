
package com.mycompany.mavenproject1.MóduloFinanceiro_Auditoria;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.mavenproject1.HierarquiadeUsuários.Usuario;

public class LogAuditoria {
    private int id;
    private String dataHora;
    private Usuario usuario; 
    private String acao;
    private String entidadeAfetada;
    private int idEntidade;
    private String ipOrigem;

    private static List<LogAuditoria> logs = new ArrayList<>();

    public LogAuditoria(Usuario usuario, String acao, String entidade) {
        this.usuario = usuario;
        this.acao = acao;
        this.entidadeAfetada = entidade;
        this.dataHora = "agora"; 
    }

    public void registrar() {
        logs.add(this);
        System.out.println("Log registrado!");
    }

    public String getAcao() {
        return acao;
    }

    public Object getUsuario() {
        return usuario;
    }

    public String getDataHora() {
        return dataHora;
    }

    public static List<LogAuditoria> buscarPorUsuario(Object u) {
        List<LogAuditoria> resultado = new ArrayList<>();
        for (LogAuditoria log : logs) {
            if (log.usuario.equals(u)) {
                resultado.add(log);
            }
        }
        return resultado;
    }

    public static List<LogAuditoria> buscarPorEntidade(String e) {
        List<LogAuditoria> resultado = new ArrayList<>();
        for (LogAuditoria log : logs) {
            if (log.entidadeAfetada.equalsIgnoreCase(e)) {
                resultado.add(log);
            }
        }
        return resultado;
    }

    public void exibir() {
        System.out.println("Log #" + id);
        System.out.println("Usuário: " + usuario);
        System.out.println("Ação: " + acao);
        System.out.println("Entidade: " + entidadeAfetada);
        System.out.println("Data/Hora: " + dataHora);
        System.out.println("IP: " + ipOrigem);
    }
}