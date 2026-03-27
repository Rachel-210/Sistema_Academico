package com.unifsa.sistemaacademico;

public class Professor {
    private String nome;
    private int matriculaFuncional;
    private double salario;

    public Professor(String nome, int matricula, double salario) {
        this.nome = nome;
        this.matriculaFuncional = matricula;
        
        if (salario >= 0) {
            this.salario = salario;
        } else {
            this.salario = 0;
        }
    }

    public double getSalario() { return salario; }

    public void aumentarSalario(double valor) {
        if (valor > 0) {
            this.salario += valor;
        }
    }

    public String getNome() { return nome; }
}