
package MóduloClínico;

import HierarquiadeUsuários.Veterinario;
import java.util.ArrayList;
import java.util.List;

public class Cirurgia extends RegistroClinico {

    private int duracao;
    private String sala;
    private List<String> equipe;
    private String anestesia;
    private List<String> medicamentos;

    public Cirurgia(int id, String data, String desc, Veterinario vet, String sala) {
        super(id, data, desc, vet);
        this.sala = sala;
        this.equipe = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
    }

    public String getSala() {
        return sala;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setEquipe(String e) {
        equipe.add(e);
    }

    public void adicionarMedicamento(String m) {
        medicamentos.add(m);
    }

    public boolean validarRecursos() {
        return !equipe.isEmpty() && anestesia != null;
    }

    @Override
    public void exibir() {
        System.out.println("Cirurgia - Sala: " + sala);
        System.out.println("Duração: " + duracao + " min");
        System.out.println("Equipe: " + equipe);
    }
}
