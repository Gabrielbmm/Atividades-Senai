package br.com.senai.br.model;

import java.util.ArrayList;

public class Evento {
    private String nome;
    private String data;
    private Cliente cliente;
    private ArrayList <Cliente> clientes;

    public Evento() {clientes = new ArrayList<>();}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getData() {return data;}

    public void setData(String data) {this.data = data;}

    public Cliente getCliente() {return cliente;}

    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public void setClientes(String nome, String cpf, String tele, String email) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome(nome);
        cliente1.setCpf(cpf);
        cliente1.setTelefone(tele);
        cliente1.setEmail(email);
        clientes.add(cliente1);
    }

    @Override
    public String toString() {
        return "Evento: " + nome +
                "\nData: " + data +
                "\nCliente: " + clientes;
    }
}
