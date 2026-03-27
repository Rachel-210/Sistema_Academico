package com.unifsa.sistemaacademico;

public class ProfessorTemporario extends Professor{
    private int mesesContrato;
    private boolean contratoAtivo;

    public ProfessorTemporario(String nome, int matricula, double salario, int meses) {
        super(nome, matricula, salario);
        this.mesesContrato = meses;
        this.contratoAtivo = true;
    }

    public void encerrarContrato() { this.contratoAtivo = false; }

    @Override
    public void aumentarSalario(double valor) {
        if (contratoAtivo) {
            super.aumentarSalario(valor);
        } else {
            System.out.println("Contrato encerrado.");
        }
    }
}
