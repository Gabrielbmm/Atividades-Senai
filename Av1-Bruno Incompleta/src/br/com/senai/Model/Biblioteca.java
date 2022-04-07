package br.com.senai.Model;
import java.util.ArrayList;

public class Biblioteca {

    //atributos
    private String nome;
    private int id;
    private Livro Livro;
    private ArrayList<Livro> listadelivros;

    //Construtor
    public Biblioteca(String nome, int id;) {
        this.nome = nome;
        this.id = id;
    }
    public Biblioteca(String nome, int id;){
        this.nome =  nome;
        this.id = id;
        listadelivros = new ArrayList<>();
    }

    //getter and setter
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public ArrayList<Livro> getListadeLivros() {return listadelivros;}
    public void setListadeLivros(ArrayList<Livro> listadeLivros) {listadeLivros = listadeLivros;}

    public void imprimirBiblioteca(){

    }
}