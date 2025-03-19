package exercarray1;


import java.util.ArrayList;
import java.util.Scanner;

public class ExercArray1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite 5 números inteiros:");
        
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero); 
        }
        
        
        scanner.close();
        
        
        System.out.println("Os numeros são esses:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        
        
        
        
        
    }
    
}
