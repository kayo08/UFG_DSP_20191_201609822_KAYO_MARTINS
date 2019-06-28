package br.com.kayo08.dsp20191.aulas0508.as;

public class Aluno {
    private String nome;
    private long matricula;
    private double nota1, nota2;
    
    public Aluno(String nome, long matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public String getName() {
        return this.nome;
    }
    
    public long getMatricula() {
        return this.matricula;
    }
    
    public double getNota1() {
        return this.nota1;
    }
    
    public double getNota2() {
        return this.nota2;
    }
}