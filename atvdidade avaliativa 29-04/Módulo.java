package br.com.senai.model;

import java.util.ArrayList;

public class Módulo {
    //atributos
    private int id;
    private String nome;
    private ArrayList<Aula> array_aulas;

    //Construtores
    public Módulo(int id, String nome, ArrayList<Aula> array_aulas) {
        this.id = id;
        this.nome = nome;
        array_aulas = new ArrayList<>();
    }
    public Módulo(){}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ArrayList<Aula> getArray_aulas() {
        return array_aulas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArray_aulas(int id, String titulo, String url, String descricao){
        Aula aula = new Aula(); aula.setId(id); aula.setTitulo(titulo); aula.setUrl(url); aula.setDescricao(descricao);

        array_aulas.add(aula);
    }
    public void setArray_aulas(ArrayList<Aula> array_aulas) {}

    //Aqui indetificamos o toString
    @Override
    public String toString() {
        return "Sobre o Módulo: " +
                " ID: " + id +
                ", Aulas: " + array_aulas;
    }
}
