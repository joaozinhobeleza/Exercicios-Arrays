package exercarrays14;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercArrays14 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> tarefas = new ArrayList<>();
        
        
        Scanner scanner = new Scanner(System.in);
        
      
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1: 
                    System.out.print("Digite a descrição da tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                    
                case 2: 
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas para remover.");
                    } else {
                        System.out.println("Tarefas atuais:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + 1 + ". " + tarefas.get(i));
                        }
                        System.out.print("Digite o número da tarefa que deseja remover: ");
                        int indice = scanner.nextInt() - 1;
                        if (indice >= 0 && indice < tarefas.size()) {
                            tarefas.remove(indice);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;
                    
                case 3: 
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas para listar.");
                    } else {
                        System.out.println("Tarefas atuais:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + 1 + ". " + tarefas.get(i));
                        }
                    }
                    break;
                    
                case 4: 
                    System.out.println("Saindo...");
                    scanner.close();
                    return; 
                
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
    }
    
}
