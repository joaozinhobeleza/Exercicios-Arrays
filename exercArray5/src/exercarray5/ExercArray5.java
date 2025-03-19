package exercarray5;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercArray5 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Gramado");
        cidades.add("Porto Alegre");
        cidades.add("Pelotas");

        
        System.out.println("Lista inicial de cidades:");
        System.out.println(cidades);

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o nome da cidade que deseja trocar: ");
        String cidadeParaSubstituir = scanner.nextLine();

        
        if (cidades.contains(cidadeParaSubstituir)) {
            
            System.out.print("Digite o nome da nova cidade: ");
            String novaCidade = scanner.nextLine();

            
            int indice = cidades.indexOf(cidadeParaSubstituir);
            
            cidades.set(indice, novaCidade);
            
            System.out.println("Lista de cidades após a troca:");
            System.out.println(cidades);
        } else {
           
            System.out.println("A cidade informada não foi encontrada na lista.");
        }

        
        scanner.close();
        
    }
    
}
