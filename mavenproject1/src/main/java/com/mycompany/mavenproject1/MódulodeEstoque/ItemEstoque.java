
package com.mycompany.mavenproject1.MódulodeEstoque;

public class ItemEstoque {
    private int id;
    private String nome;
    private int quantidade;
    private int quantidadeMinima;
    private String lote;
    private String validade;
    private boolean controlado;
    private String responsavelRetirada;
    private String categoria;

    public ItemEstoque(int id, String nome, int qtd, int qtdMin, String lote) {
        this.id = id;
        this.nome = nome;
        this.quantidade = qtd;
        this.quantidadeMinima = qtdMin;
        this.lote = lote;
    }

    public void darEntrada(int qtd, String resp) {
        this.quantidade += qtd;
        this.responsavelRetirada = resp;
        System.out.println("Entrada de " + qtd + " unidades realizada por " + resp);
    }

    public boolean darSaida(int qtd, String resp) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
            responsavelRetirada = resp;
            System.out.println("Saída de " + qtd + " unidades realizada por " + resp);
            return true;
        } else {
            System.out.println("Estoque insuficiente!");
            return false;
        }
    }

    public boolean reservar(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
            System.out.println("Reservado " + qtd + " unidades.");
            return true;
        }
        return false;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean isAbaixoMinimo() {
        return quantidade < quantidadeMinima;
    }

    public boolean isControlado() {
        return controlado;
    }

    public boolean isVencido() {
        return false;
    }

    public String getLote() {
        return lote;
    }

    public int getId() {
    return id;
    }
    
    public void exibir() {
        System.out.println("Item: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Lote: " + lote);
        System.out.println("Categoria: " + categoria);
    }
}