package br.com.alura.questoes;

public class Livro {
    private String titulo;
    private boolean emprestado;

    public void emprestar() {
        emprestado = true;
    }

    public String status() {
        if (emprestado) {
            return "Indisponível";
        } else {
            return "Disponível";
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
