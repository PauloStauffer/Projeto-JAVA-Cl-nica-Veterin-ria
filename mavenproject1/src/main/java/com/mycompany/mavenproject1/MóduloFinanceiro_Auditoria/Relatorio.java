
package com.mycompany.mavenproject1.MóduloFinanceiro_Auditoria;

public class Relatorio {
    private int id;
    private int mes;
    private int ano;
    private int totalAtendimentos;
    private double faturamentoTotal;
    private double totalDespesas;
    private double taxaRetorno;
    private double tempoMedioAtend;
    private String procedimentoMaisRealizado;

    public Relatorio(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
    }

    public void gerar() {
        faturamentoTotal = calcularFaturamento();
        taxaRetorno = calcularTaxaRetorno();
        tempoMedioAtend = calcularTempoMedio();
        System.out.println("Relatório gerado!");
    }

    public String getEstatisticas() {
        return "Atendimentos: " + totalAtendimentos +
               ", Faturamento: " + faturamentoTotal;
    }

    public double calcularFaturamento() {
        return faturamentoTotal;
    }

    public double calcularTaxaRetorno() {
        return taxaRetorno;
    }

    public double calcularTempoMedio() {
        return tempoMedioAtend;
    }

    public String getProcedimentoMaisRealizado() {
        return procedimentoMaisRealizado;
    }

    public void exportar() {
        System.out.println("Relatório exportado!");
    }

    public void exibir() {
        System.out.println("Relatório " + mes + "/" + ano);
        System.out.println("Faturamento: " + faturamentoTotal);
        System.out.println("Despesas: " + totalDespesas);
        System.out.println("Taxa de retorno: " + taxaRetorno);
        System.out.println("Tempo médio: " + tempoMedioAtend);
        System.out.println("Procedimento mais realizado: " + procedimentoMaisRealizado);
    }
}