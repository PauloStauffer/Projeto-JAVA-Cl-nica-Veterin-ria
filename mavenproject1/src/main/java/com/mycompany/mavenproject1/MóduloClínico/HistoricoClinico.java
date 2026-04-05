package com.mycompany.mavenproject1.MóduloClínico;

import java.util.ArrayList;
import java.util.List;

public class HistoricoClinico {

    private int idAnimal;
    private List<Consulta> consultas;
    private List<Vacina> vacinas;
    private List<Cirurgia> cirurgias;
    private List<Exame> exames;
    private List<Tratamento> tratamentos;
    private boolean finalizado;


    public HistoricoClinico(int idAnimal) {
        this.idAnimal = idAnimal;
        this.consultas = new ArrayList<>();
        this.vacinas = new ArrayList<>();
        this.cirurgias = new ArrayList<>();
        this.exames = new ArrayList<>();
        this.tratamentos = new ArrayList<>();
        this.finalizado = false;
    }

    public void adicionarConsulta(Consulta c) {
        consultas.add(c);
    }

    public void adicionarVacina(Vacina v) {
        vacinas.add(v);
    }

    public void adicionarCirurgia(Cirurgia c) {
        cirurgias.add(c);
    }

    public void adicionarExame(Exame e) {
        exames.add(e);
    }

    public void adicionarTratamento(Tratamento t) {
        tratamentos.add(t);
    }

    public void finalizar() {
        this.finalizado = true;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public List<Vacina> getVacinas() {
        return vacinas;
    }

    public void exibir() {
        System.out.println("ID Animal: " + idAnimal);
        System.out.println("Finalizado: " + finalizado);
        System.out.println("Consultas: " + consultas.size());
        System.out.println("Vacinas: " + vacinas.size());
        System.out.println("Cirurgias: " + cirurgias.size());
        System.out.println("Exames: " + exames.size());
        System.out.println("Tratamentos: " + tratamentos.size());
    }
}
