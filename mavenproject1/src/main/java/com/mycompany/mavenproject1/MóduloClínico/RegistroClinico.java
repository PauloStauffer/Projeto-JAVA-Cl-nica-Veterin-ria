
package com.mycompany.mavenproject1.MóduloClínico;

import com.mycompany.mavenproject1.HierarquiadeUsuários.Veterinario;


public class RegistroClinico {
    private int id;
    private String data;
    private String descricao;
    private Veterinario veterinario;
    private String laudoAnexo;
    private boolean finalizado;

    public RegistroClinico(int id, String data, String descricao, Veterinario veterinario) {
        this.id=id;
        this.data=data;
        this.descricao=descricao;
        this.veterinario=veterinario;
        this.finalizado=false;
        this.laudoAnexo=null;
    }
    
    public RegistroClinico() {
 
    }
    
    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public String getLaudo() {
        return laudoAnexo;
    }

    public void finalizar() {
        this.finalizado = true;
    }

    public void anexarLaudo(String path) {
        if (!finalizado) {
            this.laudoAnexo = path;
        } else {
            System.out.println("Não é possível anexar laudo. Registro já finalizado.");
        }
    }
    public void exibir() {
    System.out.println("ID: " + id);
    System.out.println("Data: " + data);
    System.out.println("Descrição: " + descricao);
}
}
