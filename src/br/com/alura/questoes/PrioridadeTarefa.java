package br.com.alura.questoes;

public class PrioridadeTarefa {
    public static void verificarPrioridade() {
        int prioridade = 4;
        int urgencia = 8;

        if (prioridade > 3 && urgencia > 7) {
            System.out.println("Tarefa critica");
        } else if (prioridade > 3 || urgencia > 7) {
            System.out.println("Tarefa importante");
        } else {
            System.out.println("Tarefa comum");
        }
    }
}
