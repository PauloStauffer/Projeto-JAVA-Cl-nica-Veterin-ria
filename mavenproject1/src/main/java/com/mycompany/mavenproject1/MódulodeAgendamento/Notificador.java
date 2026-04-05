package com.mycompany.mavenproject1.MódulodeAgendamento;

import java.util.List;

public class Notificador {
    private String canal; // EMAIL | SMS | APP
    private String destinatario;
    private boolean ativo;

    public Notificador(String canal, String destinatario) {
        this.canal = canal;
        this.destinatario = destinatario;
        this.ativo = true;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public void enviarConfirmacao(Object ag) {
        System.out.println("Enviando confirmação para " + destinatario);
    }

    public void enviarCancelamento(Object ag) {
        System.out.println("Enviando cancelamento para " + destinatario);
    }

    public void enviarReagendamento(Object ag) {
        System.out.println("Enviando reagendamento para " + destinatario);
    }

    public void enviarLembreteVacina(Object data) {
        System.out.println("Enviando lembrete de vacina");
    }

    public void enviarAlertaEstoque(Object item) {
        System.out.println("Enviando alerta de estoque");
    }

    public void enviarFatura(Object f) {
        System.out.println("Enviando fatura");
    }

    public void enviarAlerta(String dest, String msg) {
        System.out.println("Alerta para " + dest + ": " + msg);
    }

    public void enviarCampanha(List<String> lista, String msg) {
        for (String dest : lista) {
            System.out.println("Campanha para " + dest + ": " + msg);
        }
    }
}