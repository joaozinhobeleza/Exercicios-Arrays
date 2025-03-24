package exercarray12;

import java.util.ArrayList;
import java.util.Collections;

public class ExercArray12 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(5);
        numeros.add(40);
        numeros.add(30);

        
        int maiorValor = Collections.max(numeros);
        int menorValor = Collections.min(numeros);

        
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
        
    }
    
}
