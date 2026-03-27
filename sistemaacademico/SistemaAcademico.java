package com.unifsa.sistemaacademico;

public class SistemaAcademico {

    public static void main(String[] args) {
        Aluno g1 = new AlunoGraduacao("Eloise", 2026055, 8.5);
        Aluno p1 = new AlunoPosGraduacao("Hycinth", 2026023, 5.5);

        ProfessorEfetivo prof = new ProfessorEfetivo("Anthony", 782100, 5000.0);
        ProfessorTemporario profTemp = new ProfessorTemporario("Saymon", 765370, 3000.0, 6);
        
        Diciplina java = new Diciplina("Java", prof);
        java.adicionarAluno(g1);
        java.adicionarAluno(p1);
        java.adicionarAluno(g1);

        System.out.println("\n--- RELATORIO INICIAL ---");
        java.listarAlunos();

        System.out.println("\n--- AUMENTO SALARIAL ---");
        profTemp.encerrarContrato();
        profTemp.aumentarSalario(100);

        System.out.println("\n--- AJUSTE DE NOTA ---");
        p1.ajustarNota(9.5);
        p1.exibirDados();
    }
}