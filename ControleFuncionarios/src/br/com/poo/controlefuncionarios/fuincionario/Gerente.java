package br.com.poo.controlefuncionarios.fuincionario;

public class Gerente extends Funcionario{

    private double bonus;
    private String usuario;
    private String senha;

    public Gerente(String nome, double salarioBase, double bonus, String usuario, String senha) {
        super(nome, salarioBase);
        this.bonus = bonus;
        this.usuario = usuario;
        this.senha = senha;
    }
}
