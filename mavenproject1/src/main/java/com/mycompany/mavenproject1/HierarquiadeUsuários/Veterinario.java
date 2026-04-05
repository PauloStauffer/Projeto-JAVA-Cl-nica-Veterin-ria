
package com.mycompany.mavenproject1.HierarquiadeUsuários;

import java.util.ArrayList;
import java.util.List;

public class Veterinario extends Usuario {

    private String crmv;
    private String especialidade;
    private boolean disponivel;

    public Veterinario(int id, String nome, String email, String crmv, String especialidade) {
        super(id, nome, email, "", "VET");
        this.crmv = crmv;
        this.especialidade = especialidade;
        this.disponivel = true;
    }

    public String getCrmv() {
        return crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean v) {
        this.disponivel = v;
    }

    public void registrarLaudo(int id, String texto) {
        System.out.println("Laudo registrado para ID " + id + ": " + texto);
    }

    public void emitirPrescricao(int id, String tx) {
        System.out.println("Prescrição para ID " + id + ": " + tx);
    }

    public List<String> consultarAgenda() {
        return new ArrayList<>();
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CRMV: " + crmv);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Disponível: " + disponivel);
    }
}