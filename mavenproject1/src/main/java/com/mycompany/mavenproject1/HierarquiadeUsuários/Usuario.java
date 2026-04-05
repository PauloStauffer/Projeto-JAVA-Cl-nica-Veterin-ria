
package com.mycompany.mavenproject1.HierarquiadeUsuários;

public class Usuario {


    private int id;
    private String nome;
    private String email;
    private String senha;
    private String perfil;
    private boolean ativo;
    private String dataCadastro;

    public Usuario(int id, String nome, String email, String senha, String perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
        this.ativo = true;
    }

    public boolean login(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha) && this.ativo;
    }

    public void logout() {
        System.out.println("Usuário deslogado.");
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void desativar() {
        this.ativo = false;
    }

    public void exibir() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Perfil: " + perfil);
        System.out.println("Ativo: " + ativo);
        System.out.println("Data Cadastro: " + dataCadastro);
    }
}