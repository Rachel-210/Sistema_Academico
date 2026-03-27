package com.unifsa.sistemaacademico;

public class AlunoGraduacao extends Aluno {
    
    public AlunoGraduacao(String nome, int matricula, double nota) {
        super(nome, matricula, nota);
    }
    
    public boolean verificarAprovacao(){
       return getNota() >= 7.0;
    }
}
