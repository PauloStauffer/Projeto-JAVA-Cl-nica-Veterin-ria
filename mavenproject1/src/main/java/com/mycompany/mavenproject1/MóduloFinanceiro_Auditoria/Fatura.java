
package com.mycompany.mavenproject1.MóduloFinanceiro_Auditoria;

import com.mycompany.mavenproject1.HierarquiadeUsuários.Tutor;
import com.mycompany.mavenproject1.MódulodeAgendamento.Notificador;

public class Fatura {
    private int id;
    private Tutor tutor;
    private double valor;
    private String dataEmissao;
    private String dataVencimento;
    private String status;
    private String descricaoServico;
    private Notificador notificador;

    public Fatura(int id, Tutor tutor, double valor, String desc, Notificador notificador) {
        this.id = id;
        this.tutor = tutor;
        this.valor = valor;
        this.descricaoServico = desc;
        this.notificador = notificador;
        this.status = "PENDENTE";
    }

    public void emitir() {
        this.dataEmissao = "hoje";
        System.out.println("Fatura emitida!");
    }

    public String gerarBoleto() {
        return "Boleto gerado para pagamento.";
    }

    public String gerarLinkPagamento() {
        return "http://pagamento.com/fatura/" + id;
    }

    public void registrarPagamento() {
        this.status = "PAGO";
        System.out.println("Pagamento registrado!");
    }

    public boolean confirmarPagamentoOnline() {
        this.status = "PAGO";
        return true;
    }

    public boolean isPendente() {
        return status.equals("PENDENTE");
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public void exibir() {
        System.out.println("Fatura #" + id);
        System.out.println("Valor: " + valor);
        System.out.println("Status: " + status);
        notificador.enviarFatura(this);
    }
}