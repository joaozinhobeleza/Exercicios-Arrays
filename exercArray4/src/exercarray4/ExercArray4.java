package exercarray4;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercArray4 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> produtos = new ArrayList<>();
        
        
        produtos.add("Celular");
        produtos.add("Computador");
        produtos.add("Cadeira");
        produtos.add("Teclado");
        produtos.add("Mouse");
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Lista de produtos disponíveis:");
        System.out.println(produtos);
        
        
        System.out.print("\nDigite o nome do produto que deseja buscar: ");
        String produtoBuscado = scanner.nextLine();
        
        
        if (produtos.contains(produtoBuscado)) {
            System.out.println("\nProduto encontrado: " + produtoBuscado);
        } else {
            System.out.println("\nProduto não encontrado.");
        }
        
        
        scanner.close();
        
    }
    
}
