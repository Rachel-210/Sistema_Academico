package com.unifsa.sistemaacademico;

public class Aluno {
    private String nome;
    private int matricula;
    private double notaFinal;
    
    public Aluno(String nome, int matricula, double nota){
        if(nome == null){
            this.nome = "Nome invalido";
        } else{
        this.nome = nome;
        }
        
        this.matricula = matricula;
        
        if(nota >= 0 && nota <= 10){
            this.notaFinal = nota;
        } else{
            this.notaFinal = 0;
        }
    }
    
    public void setNota(double nota){
        if(nota >= 0 && nota <= 10){
            this.notaFinal = nota;
      }
    }
    
    public double getNota(){
        return notaFinal;
    }
    
    public void ajustarNota(double novaNota) {
        setNota(novaNota);
    }
    
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nota Final: " + this.notaFinal);
    }
}