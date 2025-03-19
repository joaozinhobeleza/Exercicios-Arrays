package exercarray6;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercArray6 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> palavras = new ArrayList<>();
        
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite palavras para adicionar a lista (digite 'sair' para terminar):");
        
        while (true) {
            System.out.print("Digite uma palavra: ");
            String palavra = scanner.nextLine();
            
            if (palavra.equalsIgnoreCase("sair")) {
                break;  
            }
            
            palavras.add(palavra);  
        }
        
        
        System.out.print("Digite a palavra que deseja contar as ocorrências: ");
        String palavraParaContar = scanner.nextLine();
        
        
        int count = 0;
        for (String palavra : palavras) {
            if (palavra.equalsIgnoreCase(palavraParaContar)) {
                count++;
            }
        }
        
        
        if (count > 0) {
            System.out.println("A palavra '" + palavraParaContar + "' apareceu " + count + " vez(es).");
        } else {
            System.out.println("A palavra '" + palavraParaContar + "' não foi encontrada na lista.");
        }
        
        
        scanner.close();        
        
    }
    
}
