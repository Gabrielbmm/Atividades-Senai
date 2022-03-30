package br.com.senai;

import br.com.senai.model.Biblioteca;
import br.com.senai.model.Livro;

public class Main {
    public static void main(String[] args) {

        //Isso tudo é um objeto, naqual é uma instância da Biblioteca e entre() são os parâmetros

        Biblioteca Curitiba = new Biblioteca(1, "Biblioteca Curitiba");
        Biblioteca Catarinense = new Biblioteca(2, "Biblioteca Catarinense");


        Curitiba.setLivros(1, "Jogos Vorazes", "Suzanne Collins");
        Curitiba.setLivros(2, "Harry Potter", "J.K Rowling");
        Curitiba.setLivros(3, "Vinte Mil Léguas Submarinas", "Júlio Verne");
        Curitiba.setLivros(4, "Bitcoin a Moeda na Era Digital", "Fernando Ulrich");
        Curitiba.setLivros(5, "O Pequeno Príncipe", "Antoine de Saint-Exupéry");

        Curitiba.ImprimirBiblioteca();

        Catarinense.setLivros(1, "Sapiens - Uma Breve História da Humanidade", "Yuval Harari");
        Catarinense.setLivros(2, "Dom Quixote", "Miguel de Cervantes");
        Catarinense.setLivros(3, "A Menina que roubava Livro", "markus Zusak");
        Catarinense.setLivros(4, "Star Wars, Herdeiro do Jedi", "kevin Hearne");
        Catarinense.setLivros(5, "Viagem Ao centro Da Terra", "Júlio Verne");

        Catarinense.ImprimirBiblioteca();
    }
}
