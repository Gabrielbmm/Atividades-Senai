package br.com.senai.Model;

public class Livro {

    //Atributos
    private int idlivro;
    private String Autor;
    private String Titulo;



    //Construtor
    public Livro (String nome){this.nome =  nome;}

    //getter and setter

    public int getIdlivro() {return idlivro;}
    public void setIdlivro(int idlivro) {this.idlivro = idlivro;}

    public String getAutor() {return Autor;}
    public void setAutor(String autor) {Autor = autor;}

    public String getTitulo() {return Titulo;}
    public void setTitulo(String titulo) {Titulo = titulo;}
}
