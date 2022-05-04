package br.com.senai.model;

public class Aula{
    //atributos
    private int id;
    private String titulo;
    private String url;
    private String descricao;

    //construtor
    public Aula(int id, String titulo, String url, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.url = url;
        this.descricao = descricao;
    }
    public Aula(){}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Aqui indetificamos o toString
    @Override
    public String toString() {
        return "Aula: " + "id = " + id +
                ", titulo = " + titulo +
                ", url = " + url +
                ", descricao = " + descricao;
    }
}
