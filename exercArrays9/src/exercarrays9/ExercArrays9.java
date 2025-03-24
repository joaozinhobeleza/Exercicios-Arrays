package exercarrays9;

import java.util.ArrayList;

public class ExercArrays9 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Pedro");

        
        ArrayList<String> copiaNomes = new ArrayList<>(nomes);

        
        System.out.println("ArrayList Original:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        
        System.out.println("\nArrayList Copiado:");
        for (String nome : copiaNomes) {
            System.out.println(nome);
        }
        
    }
    
}
