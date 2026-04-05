
package MóduloClínico;

import HierarquiadeUsuários.Veterinario;

public class Vacina extends RegistroClinico {

    private String nomeVacina;
    private String dataAplicacao;
    private String dataReforco;
    private String lote;
    private String fabricante;

    public Vacina(int id, String data, String desc, Veterinario vet, String nomeVacina) {
        super(id, data, desc, vet);
        this.nomeVacina = nomeVacina;
        this.dataAplicacao = data;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public String getDataReforco() {
        return dataReforco;
    }

    public void setDataReforco(String d) {
        this.dataReforco = d;
    }

    public boolean precisaReforco() {
        return dataReforco != null && !dataReforco.isEmpty();
    }

    public String getLote() {
        return lote;
    }

    @Override
    public void exibir() {
        System.out.println("Vacina: " + nomeVacina);
        System.out.println("Data Aplicação: " + dataAplicacao);
    }
}