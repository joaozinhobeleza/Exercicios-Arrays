package exercarray2;


import java.util.ArrayList;
import java.util.Scanner;

public class ExercArray2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Anna");
        nomes.add("Carlão");
        nomes.add("Brunão");
        nomes.add("Daniela");
        nomes.add("Edu");
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Lista inicial de nomes:");
        System.out.println(nomes);
        
        
        System.out.print("\nDigite o nome que deseja remover: ");
        String nomeParaRemover = scanner.nextLine();
        
        
        if (nomes.contains(nomeParaRemover)) {
            nomes.remove(nomeParaRemover);
            System.out.println("\nNome removido com sucesso!");
        } else {
            System.out.println("\nNome não encontrado na lista.");
        }
        
        
        System.out.println("\nLista atualizada de nomes:");
        System.out.println(nomes);
        
        
        scanner.close();
        
        
        
    }
    
}
