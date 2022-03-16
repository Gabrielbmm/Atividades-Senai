package br.com.senai.model;

public class ItensDoPedido {

    //atributos
    private Produto produto;
    private int quantidade;

    //construtor
    public ItensDoPedido() {
    }

    //getter and setter
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    //método

    @Override
    public String toString() {
        return  produto +
                "\nQuantidade: " + quantidade;
    }
}
