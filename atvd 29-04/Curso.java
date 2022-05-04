package br.com.senai.model;

import java.util.ArrayList;
import java.util.Date;

public class Curso {
    //atributos
    private String nome;
    private ArrayList<Turma> turmas;
    private ArrayList<Módulo> módulos;

    //construtores
    public Curso(String nome, ArrayList<Turma> turmas, ArrayList<Módulo> módulos) {
        this.nome = nome;
        this.turmas = turmas;
        this.módulos = módulos;
    }
    public Curso(){}

    //getter and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
    public ArrayList<Módulo> getMódulos() {
        return módulos;
    }

    public void setTurmas(int id, Date ano_turma, ArrayList<Aluno> alunos, Módulo modulo){Turma turma = new Turma(); turma.setId(id); turma.setAno_turma(ano_turma); turma.setAlunos(alunos); turma.setModulo(modulo);
        turmas.add(turma);
    }
    public void setMódulos(int id, String nome, ArrayList<Aula> array_aulas){ Módulo modulo = new Módulo(); modulo.setId(id); modulo.setNome(nome); modulo.setArray_aulas(array_aulas);
        módulos.add(modulo);
    }

    //Aqui indetificamos o toString
    @Override
    public String toString() {
        return "Curso: " + nome +
                "\nTurmas: " + turmas +
                "\nMódulos: " + módulos;
    }
}
