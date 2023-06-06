package br.com.poo.controlefuncionarios.fuincionario;

public abstract class Funcionario {
    protected String nome;
    protected int matricula;
    protected double salarioBase;
    private static int ultimaMatricula = 0;


    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.matricula = Funcionario.gerarMatricula();
        this.salarioBase = salarioBase;
    }

    public static int gerarMatricula() {
        Funcionario.ultimaMatricula += 1;
        return Funcionario.ultimaMatricula;
    }

}
