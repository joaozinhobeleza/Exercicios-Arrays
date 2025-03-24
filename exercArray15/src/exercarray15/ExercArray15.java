package exercarray15;

import java.util.ArrayList;

public class ExercArray15 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Aluno> alunos = new ArrayList<>();

        
        alunos.add(new Aluno("João", 8.5));
        alunos.add(new Aluno("Maria", 9.0));
        alunos.add(new Aluno("Carlos", 7.5));
        alunos.add(new Aluno("Ana", 6.0));
        alunos.add(new Aluno("Pedro", 8.0));

        
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
        }

        
        double somaNotas = 0;
        for (Aluno aluno : alunos) {
            somaNotas += aluno.getNota();
        }

        double mediaNotas = somaNotas / alunos.size();

       
        System.out.println("\nMédia das notas: " + mediaNotas);
        
    }
    
}
