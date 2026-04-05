
package com.mycompany.mavenproject1.HierarquiadeUsuários;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.mavenproject1.MóduloClínico.Animal;

public class Tutor extends Usuario {

    private String cpf;
    private String telefone;
    private String endereco;
    private List<Animal> animais;

    public Tutor(int id, String nome, String email, String cpf, String telefone) {
        super(id, nome, email, "", "TUTOR");
        this.cpf = cpf;
        this.telefone = telefone;
        this.animais = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void adicionarAnimal(Animal a) {
        animais.add(a);
    }

    public void verHistoricoAnimal(int id) {
        System.out.println("Exibindo histórico do animal ID: " + id);
    }

    public List<String> verFaturas() {
        return new ArrayList<>();
    }

    public Animal buscarAnimal(String nome) {
        for (Animal a : animais) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Quantidade de animais: " + animais.size());
    }
}