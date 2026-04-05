package com.mycompany.mavenproject1.MóduloClínico;

import com.mycompany.mavenproject1.HierarquiadeUsuários.Veterinario;

public class Exame extends RegistroClinico {

    private String tipo;
    private String resultado;
    private String imagemAnexo;
    private String laboratorio;

    public Exame(int id, String data, String desc, Veterinario vet, String tipo) {
        super(id, data, desc, vet);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setResultado(String r) {
        this.resultado = r;
    }

    public String getResultado() {
        return resultado;
    }

    public void anexarImagem(String path) {
        this.imagemAnexo = path;
    }

    public String getImagem() {
        return imagemAnexo;
    }

    @Override
    public void exibir() {
        System.out.println("Exame - Tipo: " + tipo);
        System.out.println("Resultado: " + resultado);
    }
}