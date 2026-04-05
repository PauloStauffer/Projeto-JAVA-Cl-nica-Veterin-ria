package com.mycompany.mavenproject1.MóduloClínico;

import com.mycompany.mavenproject1.HierarquiadeUsuários.Tutor;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Animal {
    private int id;
    private String nome;
    private String especie;
    private String raca;
    private String dataNascimento;
    private double peso;
    private Tutor tutor;
    private HistoricoClinico historico;

    public Animal(int id, String nome, String especie, String raca, Tutor tutor){
        this.id=id;
        this.nome=nome;
        this.especie=especie;
        this.raca=raca;
        this.tutor=tutor;
    }
 
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso<=0){
            System.out.println("Valor Invalido!");
        }else{
            this.peso = peso;
        }
    }

    public Tutor getTutor() {
        return tutor;
    }

    public HistoricoClinico getHistorico() {
        return historico;
    }
    
    public int calcularIdade(){
        String dataNascimentoStr=dataNascimento;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formato);

        LocalDate hoje = LocalDate.now();
        int idade = Period.between(dataNascimento, hoje).getYears();

        return idade;
    }
    
    public void exibir(){
        System.out.println("Id: "+id+"\nNome: "+nome+"\nRaça: "+raca+"Idade: "+calcularIdade()+"\nPeso: "+peso+"\nTutor: "+tutor);
    }
}
