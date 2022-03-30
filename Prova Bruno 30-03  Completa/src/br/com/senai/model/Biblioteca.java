package br.com.senai.model;

import java.util.ArrayList;

public class Biblioteca {

    //Atributos
    private int idbiblioteca;
    private String nomebiblioteca;
    private Livro livro;
    private ArrayList<Livro> arraylivros;

    //Construtores
    public Biblioteca(int idbiblioteca, String nomebiblioteca) {
        this.idbiblioteca = idbiblioteca;
        this.nomebiblioteca = nomebiblioteca;
        arraylivros = new ArrayList<>();
    }
    public Biblioteca(){}

    //Getters
    public int getIdbiblioteca() {
        return idbiblioteca;
    }
    public String getNomebiblioteca() {
        return nomebiblioteca;
    }
    public Livro getLivro() {
        return livro;
    }
    public ArrayList<Livro> getLivros() {
        return arraylivros;
    }

    //Setters
    public void setIdbiblioteca(int idbiblioteca) {
        this.idbiblioteca = idbiblioteca;
    }
    public void setNomebiblioteca(String nomebiblioteca) {
        this.nomebiblioteca = nomebiblioteca;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }


    //Array de Livros
    public void setLivros(int idlivro, String titulo, String autor) {
        Livro livro = new Livro();
        livro.setIdlivro(idlivro);
        livro.setTitulo(titulo);
        livro.setAutor(autor);

        arraylivros.add(livro);
    }

    //Impressão - aqui utilizamos o toString
    public void ImprimirBiblioteca(){
        System.out.println("\nID Biblioteca: " + idbiblioteca +
                "\nNome Da Biblioteca: " + nomebiblioteca +
                "\n\nLivros: ");

        for (int i = 0; i < arraylivros.size(); i++){System.out.println(arraylivros.get(i));}
    }
}
