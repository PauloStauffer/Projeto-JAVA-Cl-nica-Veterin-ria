
package com.mycompany.mavenproject1.HierarquiadeUsuários;

import com.mycompany.mavenproject1.MóduloClínico.Animal;

public class Recepcionista extends Usuario {

    private String ramal;
    private String turno;

    public Recepcionista(int id, String nome, String email, String ramal) {
        super(id, nome, email, "", "RECEP");
        this.ramal = ramal;
    }

    public void cadastrarTutor(Tutor t) {
        System.out.println("Tutor cadastrado: " + t.getNome());
    }

    public void cadastrarAnimal(Animal a) {
        System.out.println("Animal cadastrado: " + a.getNome());
    }

    public boolean agendarConsulta(int id) {
        System.out.println("Consulta agendada para ID: " + id);
        return true;
    }

    public void cancelarConsulta(int id) {
        System.out.println("Consulta cancelada para ID: " + id);
    }

    public Tutor buscarTutor(String termo) {
        System.out.println("Buscando tutor: " + termo);
        return null;
    }

    public Animal buscarAnimal(String termo) {
        System.out.println("Buscando animal: " + termo);
        return null;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Ramal: " + ramal);
        System.out.println("Turno: " + turno);
    }
}