
package MódulodeAgendamento;

import java.util.ArrayList;
import java.util.List;
import MóduloClínico.Animal;
import HieraquiadeUsuario

public class Agendamento {
    private int id;
    private String dataHora;
    private String tipo; 
    private String status; 
    private Animal animal;
    private Veterinario veterinario;
    private String sala;
    private Notificador notificador;
    private List<String> historico;

    public Agendamento(int id, String dataHora, String tipo, Object animal, Object veterinario, Notificador notificador) {
        this.id = id;
        this.dataHora = dataHora;
        this.tipo = tipo;
        this.animal = animal;
        this.veterinario = veterinario;
        this.notificador = notificador;
        this.status = "AGENDADO";
        this.historico = new ArrayList<>();
    }

    public boolean agendar() {
        if (validarHorario() && validarVeterinario() && reservarRecursos()) {
            historico.add("Agendado em " + dataHora);
            notificarTutor();
            return true;
        }
        return false;
    }

    public void cancelar(String motivo) {
        this.status = "CANCELADO";
        historico.add("Cancelado: " + motivo);
        notificador.enviarCancelamento(this);
    }

    public void reagendar(String novaData) {
        this.dataHora = novaData;
        historico.add("Reagendado para " + novaData);
        notificador.enviarReagendamento(this);
    }

    public boolean validarHorario() {
        // Simulação: horário válido entre 08h e 18h
        return true;
    }

    public boolean validarVeterinario() {
        // Simulação
        return true;
    }

    public boolean reservarRecursos() {
        // Simulação
        return true;
    }

    public String getStatus() {
        return status;
    }

    public List<String> getHistorico() {
        return historico;
    }

    public void notificarTutor() {
        notificador.enviarConfirmacao(this);
    }

    public void exibir() {
        System.out.println("Agendamento #" + id);
        System.out.println("Data: " + dataHora);
        System.out.println("Tipo: " + tipo);
        System.out.println("Status: " + status);
    }
}