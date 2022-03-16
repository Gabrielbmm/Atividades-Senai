package br.com.senai.br;

import br.com.senai.br.model.Cliente;
import br.com.senai.br.model.Evento;

import java.awt.*;

public class Main {
    public static void main (String [] args){
        System.out.println("Mostrando eventos...");
        Evento evento1 = new Evento();
        evento1.setNome("Endireita");
        evento1.setData("11 de Maio");
        evento1.setClientes("Ariany Chagas","316.309.175-39", "(48)98493-4374", "ariany_chagas@estudante.sc.senai.br");
        evento1.setClientes("Igor Rosiak", "958.9320.054-24", "(48)99644-9750", "igor_rosiak@estudante.sc.senai.br");
        evento1.setClientes("Gabriela Senna", "738.405.839-85", "(48)99112-7985", "gabriela_senna@estudante.sc.senai.br");
        evento1.setClientes("Gabriel Morais", "756.867.533-45", "(48)98864-1053", "gabriel_b_morais@estudante.sc.senai.br");
        evento1.setClientes("Paulo Battistella", "930.320.943-32", "(48)98455-3944", "paulo.battistella@edu.sc.senai.br");
        System.out.println(evento1);

        Evento evento2 = new Evento();
        evento2.setNome("Ponto");
        evento2.setData("25 de Março");
        evento2.setClientes("Gabriela Senna", "738.405.839-85", "(48)99112-7985", "gabriela_senna@estudante.sc.senai.br");
        evento2.setClientes("Ariany Chagas","316.309.175-39", "(48)98493-4374", "ariany_chagas@estudante.sc.senai.br");
        evento2.setClientes("Igor Rosiak", "958.9320.054-24", "(48)99644-9750", "igor_rosiak@estudante.sc.senai.br");
        evento2.setClientes("Paulo Battistella", "930.320.943-32", "(48)98455-3944", "paulo.battistella@edu.sc.senai.br");
        evento2.setClientes("Gabriel Morais", "756.867.533-45", "(48)98864-1053", "gabriel_b_morais@estudante.sc.senai.br");
        System.out.println(evento2);

        Evento evento3 = new Evento();
        evento3.setNome("P12");
        evento3.setData("12 de Abril");
        evento3.setClientes("Igor Rosiak", "958.9320.054-24", "(48)99644-9750", "igor_rosiak@estudante.sc.senai.br");
        evento3.setClientes("Gabriel Morais", "756.867.533-45", "(48)98864-1053", "gabriel_b_morais@estudante.sc.senai.br");
        evento3.setClientes("Gabriela Senna", "738.405.839-85", "(48)99112-7985", "gabriela_senna@estudante.sc.senai.br");
        evento3.setClientes("Ariany Chagas","316.309.175-39", "(48)98493-4374", "ariany_chagas@estudante.sc.senai.br");
        evento3.setClientes("Paulo Battistella", "930.320.943-32", "(48)98455-3944", "paulo.battistella@edu.sc.senai.br");
        System.out.println(evento3);
    }
}



