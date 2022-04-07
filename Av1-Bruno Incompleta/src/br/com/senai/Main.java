package br.com.senai;

import br.com.senai.Model.Biblioteca;
import br.com.senai.Model.Livro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca Curitiba = new Biblioteca("Curitiba");
        Biblioteca Catarinense = new Biblioteca("Catarinense");


        ArrayList<Livro> listBiblioteca = new ArrayList<Livro>();
        listBiblioteca.add(new Livro("Pequeno Príncipe"));
        listBiblioteca.add(new Livro("Viagem ao Centro da Terra"));
        listBiblioteca.add(new Livro("A história do Bitcoin"));




    }
}
