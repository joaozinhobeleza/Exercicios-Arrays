package exercarray11;

import java.util.ArrayList;

public class ExercArray11 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(10.5);
        numeros.add(20.75);
        numeros.add(30.25);
        numeros.add(40.0);
        numeros.add(50.5);

        
        double soma = 0;
        for (Double numero : numeros) {
            soma += numero;
        }

        
        System.out.println("Soma dos valores: " + soma);
        
    }
    
}
