package br.com.senai.model;

public class Livro {

    //Atributos
    private int idlivro;
    private String titulo;
    private String autor;

    //Construtores
    public Livro(int idlivro, String titulo, String autor) {this.idlivro = idlivro; this.titulo = titulo; this.autor = autor;}

    public Livro(){}

    //Getters
    public int getIdlivro() {
        return idlivro;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    //Setters
    public void setIdlivro(int idlivro) {
        this.idlivro = idlivro;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }



    //Impressão - aqui utilizamos o toString
    @Override
    public String toString() {
        return "ID Livro: " + idlivro +
                ", Titulo: " + titulo +
                ", Autor: " + autor;
    }
}
