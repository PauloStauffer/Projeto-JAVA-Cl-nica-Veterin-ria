
package com.mycompany.mavenproject1.MódulodeEstoque;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.mavenproject1.MódulodeAgendamento.Notificador;

public class Estoque {
    private List<ItemEstoque> itens;
    private Notificador notificador;

    public Estoque(Notificador notificador) {
        this.itens = new ArrayList<>();
        this.notificador = notificador;
    }

    public void adicionarItem(ItemEstoque item) {
        itens.add(item);
    }

    public void registrarEntrada(int id, int qtd, String resp) {
        ItemEstoque item = buscarItemPorId(id);
        if (item != null) {
            item.darEntrada(qtd, resp);
        }
    }

    public boolean registrarSaida(int id, int qtd, String resp) {
        ItemEstoque item = buscarItemPorId(id);
        if (item != null) {
            return item.darSaida(qtd, resp);
        }
        return false;
    }

    public boolean reservarParaProcedimento(Object ag) {
        return true;
    }

    public void verificarAlertas() {
        for (ItemEstoque item : itens) {
            if (item.isAbaixoMinimo()) {
                notificador.enviarAlerta("Estoque", 
                    "Item abaixo do mínimo: " + item.getLote());
            }

            if (item.isVencido()) {
                notificador.enviarAlerta("Estoque", 
                    "Item vencido: " + item.getLote());
            }
        }
    }

    private ItemEstoque buscarItemPorId(int id) {
    for (ItemEstoque item : itens) {
        if (item.getId() == id) {
            return item;
        }
    }
    return null;
    }

    public ItemEstoque buscarItem(String nome) {
        for (ItemEstoque item : itens) {
            if (item != null && nome.equalsIgnoreCase(item.getLote())) {
                return item;
            }
        }
        return null;
    }

    public List<ItemEstoque> getItens() {
        return itens;
    }

    public List<ItemEstoque> rastrearControlados() {
        List<ItemEstoque> controlados = new ArrayList<>();
        for (ItemEstoque item : itens) {
            if (item.isControlado()) {
                controlados.add(item);
            }
        }
        return controlados;
    }

    public void alertarVencimentos() {
        for (ItemEstoque item : itens) {
            if (item.isVencido()) {
                notificador.enviarAlerta("Estoque", 
                    "Produto vencido: " + item.getLote());
            }
        }
    }

    public void gerarRelatorioRastreado() {
        for (ItemEstoque item : itens) {
            if (item.isControlado()) {
                item.exibir();
            }
        }
    }

    public void exibir() {
        for (ItemEstoque item : itens) {
            item.exibir();
            System.out.println("---------------");
        }
    }
}
