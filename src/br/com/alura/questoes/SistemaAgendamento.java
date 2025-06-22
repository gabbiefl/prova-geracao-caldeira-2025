package br.com.alura.questoes;

import java.time.LocalDate;

public class SistemaAgendamento {

    public static void agendar() {
        LocalDate base = LocalDate.of(2025, 6, 1);
        int dias = 7;
        LocalDate novaData = base.plusDays(dias * 2 - 3);
        System.out.println(novaData.getDayOfMonth());
    }

}
