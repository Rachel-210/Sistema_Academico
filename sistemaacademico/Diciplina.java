package com.unifsa.sistemaacademico;

import java.util.ArrayList;
import java.util.List;

public class Diciplina {
    private String nome;
    private Professor professorResponsavel;
    private List<Aluno> listaAlunos;

    public Diciplina(String nome, Professor professor) {
        this.nome = nome;
        
        if (professor != null) {
            this.professorResponsavel = professor;
        }
        this.listaAlunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        if (!listaAlunos.contains(aluno)) {
            listaAlunos.add(aluno);
        }
    }

    public void listarAlunos() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Professor: " + professorResponsavel.getNome());
        System.out.println("--- Lista de Alunos ---");
        for (Aluno a : listaAlunos) {
            a.exibirDados();
        }
    }
}