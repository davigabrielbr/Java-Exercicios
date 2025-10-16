package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class NomesVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String vetor[] = new String[5];

        for (int contador = 0; contador < vetor.length; contador++) {
            System.out.print("Digite o " + (contador + 1) + "º nome: ");
            vetor[contador] = scanner.nextLine();
        }

        Arrays.sort(vetor);

        for (int contador = 0; contador < vetor.length; contador++) {
            System.out.println(vetor[contador]);
        }
        
        scanner.close();
    }
}