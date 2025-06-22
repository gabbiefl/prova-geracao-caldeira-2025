package br.com.alura.questoes;
import java.time.LocalDate;

public class ManipulacaoDatas {

    public static void verificarPrazo() {
        LocalDate hoje = LocalDate.of(2025,6, 9);
        LocalDate prazo = hoje.plusDays(10);

        System.out.println(prazo);
    }


}
