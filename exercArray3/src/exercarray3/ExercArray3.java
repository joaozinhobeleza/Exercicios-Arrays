package exercarray3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ExercArray3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        
        Random random = new Random();
        
        
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(100) + 1; 
            numeros.add(numeroAleatorio);
        }
        
        
        System.out.println("Lista de números antes da ordenação:");
        System.out.println(numeros);
        
        
        Collections.sort(numeros);
        
        
        System.out.println("\nLista de números ordenada:");
        System.out.println(numeros);
        
    }
    
}
