package br.com.alura.questoes;

import java.time.LocalTime;

public class VerificacaoHorario {

    public static void verificarHorario() {
        LocalTime envio = LocalTime.of(23, 0);
        LocalTime limite = LocalTime.of(22, 59);

        if (!envio.isBefore((limite))) {
            System.out.println("Entrega fora do horário.");
        } else {
            System.out.println("Tarefa enviada com sucesso.");
        }
    }
}
