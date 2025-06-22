package br.com.alura.questoes;

public class Item {
    private String nome;
    private int quantidade;

    public Item(String nome) {
        this.nome = nome;
        this.quantidade = 1;
    }

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
