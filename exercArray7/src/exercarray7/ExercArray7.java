package exercarray7;

import java.util.ArrayList;
import java.util.HashSet;

public class ExercArray7 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(10);
        numeros.add(30);
        numeros.add(20);
        numeros.add(40);
        numeros.add(30);
        numeros.add(50);

       
        System.out.println("Lista inicial com números duplicados:");
        System.out.println(numeros);

        
        HashSet<Integer> numerosUnicos = new HashSet<>(numeros);

        
        ArrayList<Integer> listaSemDuplicados = new ArrayList<>(numerosUnicos);

        
        System.out.println("\nLista sem valores duplicados:");
        System.out.println(listaSemDuplicados);
        
    }
    
}
