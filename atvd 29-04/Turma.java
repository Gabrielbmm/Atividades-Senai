package br.com.senai.model;

import java.util.ArrayList;
import java.util.Date;

public class Turma {
    //atributos
    private int id;
    private Date ano_turma;
    private ArrayList<Aluno> alunos;
    private Módulo modulo;

    //Construtores
    public Turma(int id, Date ano_turma, ArrayList<Aluno> alunos, Módulo modulo) {
        this.id = id; this.ano_turma = ano_turma; this.modulo = modulo; alunos = new ArrayList<>();
    }
    public Turma(){}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getAno_turma() {
        return ano_turma;
    }
    public void setAno_turma(Date ano_turma) {
        this.ano_turma = ano_turma;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public Módulo getModulo() {
        return modulo;
    }
    public void setModulo(Módulo modulo) {
        this.modulo = modulo;
    }

    public void setAlunos(int matrícula, String nome, String cpf, String endereço){
        Aluno aluno = new Aluno();
        aluno.setMatrícula(matrícula);
        aluno.setNome(nome);
        aluno.setCpf(cpf);
        aluno.setEndereço(endereço);

        alunos.add(aluno);
    }
    public void setAlunos(ArrayList<Aluno> alunos) {}

    //Aqui indetificamos o toString
    @Override
    public String toString() {
        return "Turma: " + id +
                ", Ano da Turma: " + ano_turma +
                ", Alunos: " + alunos;
    }


}
