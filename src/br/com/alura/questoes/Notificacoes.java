package br.com.alura.questoes;

public class Notificacoes {

    public static void calcularNotificacoes() {
        int notificacoes = 0;

        for (int i = 1; i <= 5 ; i++) {
            if (i % 2 == 0) {
                notificacoes += 2;
            } else {
                notificacoes++;
            }
        }

        System.out.println(notificacoes);
    }
}
