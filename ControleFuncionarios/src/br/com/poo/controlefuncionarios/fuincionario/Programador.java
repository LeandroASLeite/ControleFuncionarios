package br.com.poo.controlefuncionarios.fuincionario;

public class Programador extends Funcionario{

    private int horasExtrasTrabalhadas;
    private double valorHora;

    public Programador(String nome, double salarioBase, int horasExtrasTrabalhadas, double valorHora) {
        super(nome, salarioBase);
        this.horasExtrasTrabalhadas = horasExtrasTrabalhadas;
        this.valorHora = valorHora;
    }
}
