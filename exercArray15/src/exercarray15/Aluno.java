package exercarray15;

import java.util.ArrayList;

class Aluno {
    
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Nota: " + nota);
    
    }
}
