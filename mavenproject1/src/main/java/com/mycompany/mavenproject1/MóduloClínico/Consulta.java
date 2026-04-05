package com.mycompany.mavenproject1.MóduloClínico;

import com.mycompany.mavenproject1.HierarquiadeUsuários.Veterinario;


public class Consulta extends RegistroClinico {

    private String motivo;
    private String prescricao;
    private String dataRetorno;

    public Consulta(int id, String data, String desc, Veterinario veterinario, String motivo) {
        super(id, data, desc, veterinario);
        this.motivo = motivo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setPrescricao(String p) {
        this.prescricao = p;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setDataRetorno(String d) {
        this.dataRetorno = d;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }

    @Override
    public void exibir() {
        System.out.println("Consulta - Motivo: " + motivo);
        System.out.println("Prescrição: " + prescricao);
        System.out.println("Data Retorno: " + dataRetorno);
    }
}