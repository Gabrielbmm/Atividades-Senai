package br.com.senai.model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    //atributos
    private String descricao;
    private String data;
    private double total;
    private ItensDoPedido itensdopedido;
    private ArrayList<ItensDoPedido> idp;

    public Pedido(){
        idp = new ArrayList<>();
    }

    //getter and setter
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    //itens do pedido array em pedido
    public void setItensdopedido(Produto produto, int quantidade){
        ItensDoPedido itensdopedido = new ItensDoPedido();
        itensdopedido.setProduto(produto);
        itensdopedido.setQuantidade(quantidade);

        idp.add(itensdopedido);

        total += produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return "\nPedido: " +
                "\nDescricao: " + descricao +
                "\nData: " + data +
                "\nTotal: " + total +
                "\nItens do Pedido: " + idp;
    }
}
