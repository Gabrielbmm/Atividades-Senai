package br.com.senai.model;

public class Aluno {
    //atributos
    private int matrícula;
    private String nome;
    private String cpf;
    private String endereço;

    //construtor
    public Aluno(int matrícula, String nome, String cpf, String endereço) {this.matrícula = matrícula; this.nome = nome; this.cpf = cpf;this.endereço = endereço;}
    public Aluno(){}

    //getter and setter se encontra aqui
    public int getMatrícula() {
        return matrícula;
    }
    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }


    //Aqui indetificamos o toString
    @Override
    public String toString() {
        return "Aluno: " + nome +
                ", Matrícula: " + matrícula +
                ", CPF: " + cpf +
                ", Endereço: " + endereço;
    }
}
