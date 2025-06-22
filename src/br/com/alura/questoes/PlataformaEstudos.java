package br.com.alura.questoes;

public class PlataformaEstudos {

    public static void calcularMedia() {
        int nota = 7;
        int peso = 2;
        double media = (nota * peso + 6 * 3) / 5;

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Revisar conteúdo");
        }
    }

}
