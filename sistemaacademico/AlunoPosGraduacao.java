package com.unifsa.sistemaacademico;

public class AlunoPosGraduacao extends Aluno {
    
    public AlunoPosGraduacao(String nome, int matricula, double nota) {
        super(nome, matricula, nota);
    }
    
    public boolean verificarAprovacao(){
        return getNota() >= 6.0;
    }
    
    public void publicarArtigo(){
        System.out.println("Artigo foi publicado!");
    }
}
