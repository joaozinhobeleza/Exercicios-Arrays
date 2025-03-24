package exercarrays8;

import java.util.ArrayList;
import java.util.Collections;

public class ExercArrays8 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.add("Elemento 4");
        lista.add("Elemento 5");
        lista.add("Elemento 6");

        
        System.out.println("Ordem original:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        
        Collections.reverse(lista);

        
        System.out.println("Ordem inversa:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        
    }
    
}
