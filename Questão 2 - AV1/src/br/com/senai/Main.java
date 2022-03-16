package br.com.senai;

import br.com.senai.model.ItensDoPedido;
import br.com.senai.model.Pedido;
import br.com.senai.model.Produto;

public class Main {
    public static void main(String[] args) {

        Produto banana = new Produto("Banana", 7);
        Produto mamao = new Produto("Mamão Papaya", 3);
        Produto pera = new Produto("Pera Argentina", 2);
        Produto maca = new Produto("Maçã Argentina", 5);

        Pedido pedido1 = new Pedido();
        pedido1.setDescricao("Pedido realizado por Gabriela Moreira Senna Pinto");
        pedido1.setData("13/03/2022");
        pedido1.setItensdopedido(banana, 6);
        pedido1.setItensdopedido(mamao, 5);
        pedido1.setItensdopedido(maca, 15);

        Pedido pedido2 = new Pedido();
        pedido2.setDescricao("Pedido realizado por Gabriel Mazzolla Bronha Morais");
        pedido2.setData("15/03/2020");
        pedido2.setItensdopedido(pera, 6);
        pedido2.setItensdopedido(maca, 3);

        System.out.println(pedido1);
        System.out.println(pedido2);
    }
}
